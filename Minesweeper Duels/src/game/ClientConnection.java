package game;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientConnection extends Thread {

	Socket client;
	DataOutputStream out;
	DataInputStream in;
	
	private boolean running;
	private boolean isConnected;
	
	private String updateString;
	
	private long lastPing = 0;
	private long lastPong = 0;
	
	public ClientConnection(String serverName, int port) {
		running = true;
		isConnected = false;
		try {
			updateString = "";
			System.out.println("[CLIENT] connecting to "+serverName+" on port "+port+"...");
			client = new Socket(serverName, port);
			isConnected = true;
			System.out.println("[CLIENT] connected to "+client.getRemoteSocketAddress());
			out = new DataOutputStream(client.getOutputStream());
			in = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			running = false;
			e.printStackTrace();
		}
		send("getUpdate");
		start();
	}
	public String getUpdateString() {
		return updateString;
	}
	public boolean isConnected() {
		return isConnected;
	}
	public int getPing() {
		return (int)(lastPong-lastPing);
	}
	public void close() {
		running = false;
		send("end");
		try {
			in.close();
			out.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void send(String str) {
		try {
			out.writeUTF(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void ping() {
		lastPing = System.currentTimeMillis();
		send("ping");
	}
	private void update() {
		try {
			
			String data = in.readUTF();
			if (data.equals("end")) {
				running = false;
			} else if (data.equals("pong")) {
				lastPong = System.currentTimeMillis();
			} else if (data.length()>= 6 && data.substring(0,6).equals("match:")) {
				updateString = data;
			} else {
				System.out.println("Unknown Data sent to client: "+data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void run() {
		while (running) {
			update();
		}
	}
	
}
