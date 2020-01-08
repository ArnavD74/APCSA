package game;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

//Version 1.4 - fps is a parameter, "fix" for starting instability, Toolkit.getDefaultToolkit().sync(); exists apparently

public abstract class Window extends Thread{
	int w;
	int h;
	String name;
	JFrame frame;
	Canvas canvas;
	BufferStrategy bs;
	Graphics g;
	
	boolean running;
	
	long[] frameTimes;
	int fps;
	double frameLength;//in ms
	
	public Window (int width, int height, String name, int fps) {
		this.w = width;
		this.h = height;
		this.name = name;
		running = true;
		setupWindow();
		//FPS counter init
		this.fps = fps;
		frameLength = (double)1000/fps;
		frameTimes = new long[10];
		for (int i = 0; i < frameTimes.length; i++) {
			frameTimes[i] = System.currentTimeMillis()-(long)(i*frameLength);
		}
		start();//start thread
	}
	void setupWindow () {
		frame = new JFrame(name);
		frame.setSize(new Dimension(w,h));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent windowEvent) {
				running = false;
			}
		});
		canvas = new Canvas();
		canvas.setSize(new Dimension(w, h));
		canvas.setBackground(new Color(255, 255, 255));
		frame.add(canvas);
		canvas.createBufferStrategy(2);
		bs = canvas.getBufferStrategy();
	}
	/*private long getRunMilli() {
		//find average over last frames
		long output = 0;
		for (int i = 0; i < frameTimes.length; i++) {
			output += frameTimes[i]+frameLength*(frameTimes.length-i);
		}
		output /= frameTimes.length;
		return output;
	}*/
	private long getRunMilli() {
		return (long)(frameTimes[frameTimes.length-1]+frameLength);
	}
	public void run () {
		onStart();
		while (running) {
			if (System.currentTimeMillis() >= getRunMilli()) {
				//Toolkit.getDefaultToolkit().sync();
				g = bs.getDrawGraphics();
				g.clearRect(0, 0, w, h);
				//fps counter
				long timeDifference = System.currentTimeMillis() - frameTimes[0];
				int fps = (int)(((double)1000/timeDifference)*frameTimes.length);
				for (int i = 0; i < frameTimes.length - 1; i++) {
					frameTimes[i] = frameTimes[i+1];
				}
				frameTimes[frameTimes.length-1] = System.currentTimeMillis();
				g.drawString("TimePerFrame: "+Long.toString((System.currentTimeMillis() - frameTimes[0])/(frameTimes.length-1)),10, 40);
				g.drawString("FPS: "+Integer.toString(fps),10, 20);
				
				update();
				bs.show();
				Toolkit.getDefaultToolkit().sync();
				g.dispose();
			}
		}
		onClosing();
		frame.dispose();
	}
	public abstract void update();
	public abstract void onStart();
	public abstract void onClosing();
}