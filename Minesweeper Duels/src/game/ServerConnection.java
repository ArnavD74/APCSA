package game;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerConnection extends Thread{
	
	public Color debugColor;
	
	ServerSocket serverSocket;
	Socket server;
	DataInputStream in;
	DataOutputStream out;
	private long startTime;
	private boolean running;//running means waiting or active
	private boolean connected = false;
	
	Server gameServer;
	
	Player p;
	
	public ServerConnection (int port, Server gameServer) {
		debugColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		this.gameServer = gameServer;
		resetPlayer();
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.setSoTimeout(30000);
			startTime = System.currentTimeMillis();
			start();
		} catch(IOException e) {
			System.out.println("Server connection failed to initialize at port "+port);
		}
	}
	public void resetPlayer() {
		p = new Player();
	}
	public void close() {
		running = false;
	}
	public boolean isRunning() {
		return running;
	}
	public boolean isConnected() {
		return connected;
	}
	public int getLocalPort() {
		return serverSocket.getLocalPort();
	}
	public long getStartTime () {
		return startTime;
	}
	private ArrayList<ServerConnection> getOtherConnections() {//includes non-connected and dead
		ArrayList<ServerConnection> output = new ArrayList<ServerConnection>();
		for (int i = 0; i < gameServer.connections.size(); i++) {
			if (gameServer.connections.get(i)!=this) {
				output.add(gameServer.connections.get(i));
			}
		}
		return output;
	}
	private ArrayList<ServerConnection> getOtherAlive() {
		ArrayList<ServerConnection> output = new ArrayList<ServerConnection>();
		ArrayList<ServerConnection> alive = gameServer.getAllAlive();
		for (int i = 0; i < alive.size(); i++) {
			if (alive.get(i)!=this) {
				output.add(alive.get(i));
			}
		}
		return output;
	}
	public void updateClient() {
		String str = "";
		str += "match:["+gameServer.getMatchString()+"]";
		str += "yourPlayer:[";
		if (gameServer.matchRunning) {
			str += p.toString();
		}
		str += "]";
		
		ArrayList<ServerConnection> otherConnections = getOtherConnections();
		str += "otherPlayers:";
		for (int i = 0; i < otherConnections.size(); i++) {
			ServerConnection other = otherConnections.get(i);
			str += "["; 
			if (other.isConnected() && gameServer.matchRunning) {
				str += other.p.toString();
			}
			str += "]";
		}
		send(str);
	}
	private void newBoard() {
		//TODO time scaling
		p.newBoard(9, 9, 10 + p.queue);
		p.queue = 0; //TODO maybe don't consume it?
	}
	private void sendAttack(int amount) {
		ArrayList<ServerConnection> otherAlive = getOtherAlive();
		for (int i = 0; i < otherAlive.size(); i++) {
			otherAlive.get(i).p.queue += amount;
		}
	}
	private void onMineReveal() {
		int flagScore = p.b.getNumCorrectFlags();
		p.health -= (p.b.getNumMines() - flagScore);
		//cancel your own queue
		if (p.queue >= flagScore) {
			p.queue -= flagScore;
		} else {
			flagScore -= p.queue;
			p.queue = 0;
			//send attack with remaining after cancelling
			sendAttack(flagScore);
		}
		newBoard();
	}
	private void onWin() {
		int flagScore = p.b.getNumCorrectFlags();
		sendAttack((int)(flagScore*1.5));//1.5x attack bonus
		newBoard();
	}
	private void update() throws IOException{
		String data = in.readUTF();
		if (data.equals("end")) {
			running = false;
		} else if (data.equals("ping")) {
			send("pong");
		} else if (data.equals("getUpdate")) {
			updateClient();
		} else if (data.equals("startMatch")) {
			gameServer.startMatch();
		} else if (gameServer.matchRunning) {
			if (data.length()>= 7 && data.substring(0,7).equals("reveal:")) {
				//reveal:(0,0)
				int x = Parser.getInt(data, "(", ",");
				int y = Parser.getInt(data, ",", ")");
				if (p.b.reveal(x,y)) {
					onMineReveal();
				} else if (p.b.checkWin()) {
					onWin();
				}
				gameServer.updateAllClients();
			} else if (data.length()>= 5 && data.substring(0,5).equals("flag:")) {
				//flag:(0,0)
				int x = Parser.getInt(data, "(", ",");
				int y = Parser.getInt(data, ",", ")");
				p.b.flag(x,y);
				gameServer.updateAllClients();
			}
		} else {
			System.out.println("Unknown Data sent to server: "+data);
		}
	}
	public void run () {
		try {
			running = true;
			printDebug("Waiting for client...");
			server = serverSocket.accept();
			printDebug("Accepted connection from "+server.getRemoteSocketAddress());
			connected = true;
			in = new DataInputStream(server.getInputStream());
			out = new DataOutputStream(server.getOutputStream());
			gameServer.updateAllClients();
			while (running) {
				update();
			}
			printDebug("Closing...");
			connected = false;
			try {
				in.close();
				out.close();
				server.close();
				printDebug("Successfully closed connection");
			} catch (IOException e) {
				e.printStackTrace();
				printDebug("Failed to close");
			}
		} catch (IOException e) {
			printDebug("ServerSocket timed out!");
			running = false;
		}
		
	}
	private void printDebug(String str) {
		System.out.println("[Server Connection : "+serverSocket.getLocalPort()+"] "+str);
	}
	public void send(String str) {
		try {
			out.writeUTF(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
