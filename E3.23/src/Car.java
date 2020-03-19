import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Car {
	private int xLeft;
	private int yTop;
	private Color c;
	private int scale;
	

	public Car(int x, int y, Color c, int scale) {
		xLeft = x;
		yTop = y;
		this.c = c;
		this.scale = scale;
	}

	public void draw(Graphics2D g2) {
		Rectangle body = new Rectangle(xLeft, yTop + 10 * scale, 60 * scale, 10 * scale);
		g2.setColor(c);

		
		
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10 * scale, yTop + 20 * scale, 10 * scale, 10 * scale);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40 * scale, yTop + 20 * scale, 10 * scale, 10 * scale);
		
		// The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(xLeft + 10 * scale, yTop + 10* scale);
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double(xLeft + 20 * scale, yTop);
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double(xLeft + 40 * scale, yTop);
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(xLeft + 50 * scale, yTop + 10 * scale);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}
}
