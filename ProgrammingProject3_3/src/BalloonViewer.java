import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class BalloonViewer {

	public static void main(String[] args) {
		Balloon balloonObj = new Balloon();
		System.out.println(balloonObj.getVolume());
		balloonObj.inflate(20);
		System.out.println(balloonObj.getVolume());
		balloonObj.inflate(40);
		System.out.println(balloonObj.getVolume());
	}
}
