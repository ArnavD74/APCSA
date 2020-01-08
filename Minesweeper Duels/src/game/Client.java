package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Client extends Window {
	//socket
	ClientConnection connection;
	
	String serverName;
	int port;
	
	final int BOARD1_X = 100;
	final int BOARD1_Y = 100;
	final int BOARD1_W = 400;
	final int BOARD1_H = 400;
	final int HEALTH_BAR_WIDTH = 20;
	final int QUEUE_WIDTH = 5;
	
	final Color QUEUE_COLOR = new Color(82, 212, 255);
	
	Player p;
	boolean matchRunning = false;
	Long matchTime = 0L;
	
	public Client(String serverName, int port) {
		super(1200, 650, "client", 60);
		this.serverName = serverName;
		this.port = port;
	}
	
	public void update() {
		//ping
		int ping = connection.getPing();
		connection.ping();
		g.drawString("Ping: "+ping, 100, 20);
		
		if (connection.isConnected()) {
			String updateString = connection.getUpdateString();
			if (updateString == "") {
				return;
			}
			String matchString = Parser.getString(updateString, "match:[", "]");
			matchRunning = Parser.getBoolean(matchString, "matchRunning:", "|");
			matchTime = Parser.getLong(matchString, "matchTime:", "|");
			String playerString = Parser.getString(updateString, "yourPlayer:[", "]");
			p = new Player(playerString);
			ArrayList<Player> otherPlayers = new ArrayList<Player>();
			int curIndex = updateString.indexOf("[", updateString.indexOf("otherPlayers:"));
			while (curIndex != -1) {
				otherPlayers.add(new Player(updateString.substring(curIndex+1, updateString.indexOf("]", curIndex))));
				curIndex = updateString.indexOf("[", curIndex+1);
			}
			//draw
			String uString = updateString;
			int cy = BOARD1_Y+BOARD1_H+20;
			while (uString.length() > 0) {
				g.drawString(uString.substring(0,Math.min(100, uString.length())), BOARD1_X, cy);
				uString = uString.substring(Math.min(100, uString.length()), uString.length());
				cy+=12;
			}
			g.drawString("Match Running: "+matchRunning, 250, 30);
			g.drawString("Match Time: "+matchTime, 250, 45);//TODO change the match time system to run without an update
			drawBoard(p, BOARD1_X, BOARD1_Y, BOARD1_W, BOARD1_H);
			for (int i = 0; i < otherPlayers.size(); i++) {
				Player curPlayer = otherPlayers.get(i);
				drawBoard(curPlayer, BOARD1_X+BOARD1_H+50+i*250, BOARD1_Y, 200, 200);
			}
		}
	}
	private void drawBoard(Player displayPlayer, int boardX, int boardY, int boardW, int boardH) {
		g.setColor(Color.black);
		g.drawRect(boardX, boardY, boardW, boardH);
		if (displayPlayer.valid) {
			g.setFont(new Font("", 0, 10));
			g.drawString("Health: "+displayPlayer.health, boardX, boardY-5);
			g.drawString("Queue: "+displayPlayer.queue, boardX+100, boardY-5);
			g.drawString("Num Mines: "+displayPlayer.numMines, boardX+200, boardY-5);
			char[][] chars = displayPlayer.boardDisplay;
			double squareSize = (double)boardW / chars.length;
			//Health Bar
			double healthPercent = (double)displayPlayer.health / Player.startingHealth;
			g.setColor(Color.red);
			g.fillRect(boardX - 35, boardY+(int)(boardH*(1-healthPercent)), HEALTH_BAR_WIDTH, (int)(boardH*healthPercent));
			g.setColor(Color.black);
			g.drawRect(boardX - 35, boardY, HEALTH_BAR_WIDTH, boardH);
			for (int i = boardY; i < boardH+boardY; i+= boardH / 10) {
				g.drawLine(boardX - 35, i, boardX + HEALTH_BAR_WIDTH - 35, i);
			}
			//Queue
			double queuePercent = (double)displayPlayer.queue / 100;//TODO exponential scale on the bar
			g.setColor(QUEUE_COLOR);
			g.fillRect(boardX - 10, boardY+(int)(boardH*(1-queuePercent)), QUEUE_WIDTH, (int)(boardH*queuePercent));
			g.setColor(Color.black);
			g.drawRect(boardX - 10, boardY, QUEUE_WIDTH, boardH);
			//Board
			g.setFont(new Font("", 0, (int)(squareSize*0.8)));
			for (double i = 0; i <= boardW+1; i+= squareSize) {
				g.drawLine((int)i+boardX, boardY, (int)i+boardX, boardY+boardH);
			}
			for (double i = 0; i <= boardH+1; i+= squareSize) {
				g.drawLine(boardX, (int)i+boardY, boardX+boardW, (int)i+boardY);
			}
			for (int x = 0; x < chars.length; x++) {
				for (int y = 0; y < chars[0].length; y++) {
					g.setColor(Color.black);
					if (chars[x][y] == '1') {
						g.setColor(Color.blue);
						g.fillRect((int)(x*squareSize+boardX), (int)(y*squareSize+boardY), (int)squareSize, (int)squareSize);
					} else if (chars[x][y] == '2') {
						g.setColor(Color.green);
						g.fillRect((int)(x*squareSize+boardX), (int)(y*squareSize+boardY), (int)squareSize, (int)squareSize);
					} else if (chars[x][y] == '3') {
						g.setColor(Color.red);
						g.fillRect((int)(x*squareSize+boardX), (int)(y*squareSize+boardY), (int)squareSize, (int)squareSize);
					} else if (chars[x][y] == '4') {
						g.setColor(Color.blue.darker());
						g.fillRect((int)(x*squareSize+boardX), (int)(y*squareSize+boardY), (int)squareSize, (int)squareSize);
					} else if (chars[x][y] == 'f') {
						g.setColor(Color.orange.brighter());
						g.fillRect((int)(x*squareSize+boardX), (int)(y*squareSize+boardY), (int)squareSize, (int)squareSize);
					} else {
						g.setColor(Color.black);
					}
					g.setColor(Color.black);
					if (chars[x][y] != '.') {
						g.drawString(""+chars[x][y], (int)(x*squareSize+boardX+squareSize*0.1), (int)(y*squareSize+boardY+squareSize*0.8));
					}
				}
			}
		}
	}
	public void onStart() {
		ML ml = new ML();
		canvas.addMouseListener(ml);
		canvas.addMouseMotionListener(ml);
		KL kl = new KL();
		canvas.addKeyListener(kl);
		frame.setSize(w,h);//<<<<<<<<very weird
		frame.setResizable(true);
		//socket
		connection = new ClientConnection(serverName, port);
	}
	public void onClosing() {
		connection.close();
	}
	
	private class ML implements MouseListener, MouseMotionListener {
		public void mouseDragged(MouseEvent arg0) {}
		public void mouseMoved(MouseEvent arg0) {}
		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent e) {
			if (matchRunning) {//only send info if the match is running
				if (e.getX() >= BOARD1_X && e.getX() <= BOARD1_X+BOARD1_W && e.getY() >= BOARD1_Y && e.getY() <= BOARD1_Y+BOARD1_H) {
					double squareSize = (double)BOARD1_W / p.boardDisplay.length;
					if (e.getButton() == MouseEvent.BUTTON1) {
						connection.send("reveal:("+(int)((e.getX()-BOARD1_X)/squareSize)+","+(int)((e.getY()-BOARD1_Y)/squareSize)+")");
					} else if (e.getButton() == MouseEvent.BUTTON3) {
						connection.send("flag:("+(int)((e.getX()-BOARD1_X)/squareSize)+","+(int)((e.getY()-BOARD1_Y)/squareSize)+")");
					}
				}
			}
		}
	}
	private class KL implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == 's') {
				connection.send("startMatch");
			}
		}
		public void keyReleased(KeyEvent arg0) {}
		public void keyTyped(KeyEvent arg0) {}
	}
}
