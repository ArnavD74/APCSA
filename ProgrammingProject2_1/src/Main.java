import java.awt.Color;
import java.lang.Object;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
@SuppressWarnings({ "serial", "unused" })


public class Main {
	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(20, 20, 20, 20);
		System.out.println(rect1);
		rect1.translate(20, 0);
		System.out.println(rect1);
		rect1.translate(0, 20);
		System.out.println(rect1);
		rect1.translate(-20, 0);
		System.out.println(rect1);
		
	}

}
