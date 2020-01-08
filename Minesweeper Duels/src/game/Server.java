package game;

import java.awt.Color;
import java.util.ArrayList;

public class Server extends Window{
	
	int numConnections = 3;
	ArrayList<ServerConnection> connections = new ArrayList<ServerConnection>();
	
	boolean matchRunning = false;
	long matchStartTime = 0;
	
	public Server() {
		super(500, 400, "Server", 10);
	}
	public void startMatch() {
		if (!matchRunning) {
			ArrayList<ServerConnection> connected = getAllConnected();
			if (connected.size() >= 2) {
				for (int i = 0; i < connected.size(); i++) {
					connected.get(i).resetPlayer();
				}
				matchStartTime = System.currentTimeMillis();
				matchRunning = true;
				updateAllClients();
			}
		}
	}
	public long getMatchTime() {
		return System.currentTimeMillis() - matchStartTime;
	}
	public String getMatchString() {
		//eg "matchRunning:true|matchTime:1000|"
		String output = "";
		output += "matchRunning:"+matchRunning+"|";
		output += "matchTime:"+getMatchTime()+"|";
		return output;
	}
	public ArrayList<ServerConnection> getAllConnected() {
		ArrayList<ServerConnection> output = new ArrayList<ServerConnection>();
		for (int i = 0; i < connections.size(); i++) {
			ServerConnection connection = connections.get(i); 
			if (connection.isConnected()) {
				output.add(connection);
			}
		}
		return output;
	}
	public ArrayList<ServerConnection> getAllAlive() {
		ArrayList<ServerConnection> output = new ArrayList<ServerConnection>();
		ArrayList<ServerConnection> connected = getAllConnected();
		for (int i = 0; i < connected.size(); i++) {
			if (connected.get(i).p.isAlive()) {
				output.add(connected.get(i));
			}
		}
		return output;
	}
	public void updateAllClients() {
		ArrayList<ServerConnection> validConnections = getAllConnected();
		for (int i = 0; i < validConnections.size(); i++) {
			validConnections.get(i).updateClient();
		}
	}
	public void update() {
		//add new connections and remove timed out ones
		for (int i = connections.size()-1; i >= 0; i--) {
			ServerConnection c = connections.get(i);
			if (!c.isRunning()) {
				c.close();
				System.out.println("Removing connection "+i);
				connections.remove(i);
			}
		}
		if (connections.size() < numConnections) {
			connections.add(new ServerConnection(0, this));
		}
		//match logic
		if (matchRunning) {
			ArrayList<ServerConnection> alive = getAllAlive();
			if (alive.size() <= 1) {
				matchRunning = false;
				//TODO actual win notification
				System.out.println("Game over, player "+connections.indexOf(alive.get(0))+" is the winner.");
				updateAllClients();
			}
		}
		//draw representation
		g.setColor(Color.black);
		if (matchRunning) {
			g.drawString("------> Match Time: "+getMatchTime(), 175, 225);
			g.setColor(Color.green);
		} else {
			g.setColor(Color.red);
		}
		g.drawString("Match Running: "+matchRunning, 25, 225);
		for (int i = 0; i < connections.size(); i++) {
			ServerConnection c = connections.get(i);
			g.setColor(c.debugColor);
			g.fillRect(i*125+25, 100, 100, 100);
			g.clearRect(i*125+28, 103, 94, 94);
			g.setColor(Color.black);
			g.drawString("Connection "+i, i*125+25, 95);
			g.drawString("Port: "+c.getLocalPort(), i*125+25+5, 115);
			if (c.isRunning()) {
				g.setColor(Color.green);
			} else {
				g.setColor(Color.red);
			}
			g.drawString("Running: "+c.isRunning(), i*125+25+5, 130);
			g.setColor(Color.black);
			g.drawString("Time: "+(System.currentTimeMillis()-c.getStartTime()), i*125+25+5, 145);
			if (c.isConnected()) {
				g.setColor(Color.green);
			} else {
				g.setColor(Color.red);
			}
			g.drawString("Conn: "+c.isConnected(), i*125+25+5, 160);
		}
	}

	public void onStart() {
	}

	public void onClosing() {
		for (int i = connections.size()-1; i >= 0; i--) {
			connections.get(i).close();
		}
	}
	
}
