package game;

import java.util.Scanner;

public class MainWindow	{
	public static void main(String[] args) {
		new Server();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println("Enter port: ");
			new Client("localhost", sc.nextInt());
		}
		sc.close();
		
	}
}

//TODO shields
//TODO first click immunity (currently just deletes, maybe keep it like that?)
//TODO scale difficulty based on game time
//TODO difficulty scaling with time, size scaling with difficulty
//TODO queue affects density, not just mine count
//TODO clean up the "getAllConnected, getAllAlive, getOtherConnections, getOtherAlive" thing
//TODO chat/notification box
//TODO bug: client stops recieving updates (maybe socket gets disconnected or locked on some request)
//TODO synchronized methods for thread-safety
//TODO bug: blank screen, requires changing the size to see (something to do with awt)
//TODO design animation/effects system
/*
	Effect abstract class
		- static hashmap effects????<------ (actually no b/c of running multiple instances...)
		- boolean finished
			delete/remove from list when finished
		- public abstract void update()
			assumes 60 fps or make it scale using system time?
		- public abstract void draw()
*/