import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class OlympicRing {

	public int x;
	public int y;
	public int scale;

	public Ellipse2D ring(Graphics2D g2, Color c, int x, int y) {
		g2.setColor(c);
		Ellipse2D.Double ring = new Ellipse2D.Double(x, y, 50, 50);
		return ring;
		//g2.draw(ring);
	}


}