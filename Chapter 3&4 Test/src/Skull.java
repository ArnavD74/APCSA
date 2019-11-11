import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Skull {

	@SuppressWarnings("unused")
	private double xpos;
	@SuppressWarnings("unused")
	private double ypos;
	@SuppressWarnings("unused")
	private Color c;
	@SuppressWarnings("unused")
	private double xamp;
	@SuppressWarnings("unused")
	private double yamp;

	public void draw(Graphics2D g2, Color c, double xpos, double ypos, double xamp, double yamp) {

		g2.setColor(c);

		this.xpos = xpos;
		this.ypos = ypos;
		this.xamp = xamp;
		this.yamp = yamp;
		this.c = c;

		g2.setColor(c);
		Ellipse2D.Double face = new Ellipse2D.Double(xpos, ypos, 10 * xamp, 10 * yamp);

		Ellipse2D.Double lefteye = new Ellipse2D.Double(xpos + (2 * xamp), ypos + (3 * yamp), 3 * xamp, 3 * yamp);
		Ellipse2D.Double righteye = new Ellipse2D.Double(xpos + (6 * xamp), ypos + (3 * yamp), 3 * xamp, 3 * yamp);

		Ellipse2D.Double lefteye1 = new Ellipse2D.Double(xpos + (2.5 * xamp), ypos + (3.5 * yamp), 2 * xamp, 2 * yamp);
		Ellipse2D.Double righteye1 = new Ellipse2D.Double(xpos + (6.25 * xamp), ypos + (3.5 * yamp), 2 * xamp,
				2 * yamp);

		Ellipse2D.Double lefteye2 = new Ellipse2D.Double(xpos + (3 * xamp), ypos + (4.25 * yamp), 1 * xamp, 1 * yamp);
		Ellipse2D.Double righteye2 = new Ellipse2D.Double(xpos + (6.75 * xamp), ypos + (4.25 * yamp), 1 * xamp,
				1 * yamp);

		Ellipse2D.Double noseL = new Ellipse2D.Double(xpos + (5.0 * xamp), ypos + (5.5 * yamp), 0.5 * xamp,
				0.75 * yamp);
		Ellipse2D.Double noseR = new Ellipse2D.Double(xpos + (5.4 * xamp), ypos + (5.5 * yamp), 0.5 * xamp,
				0.75 * yamp);

		Line2D.Double line1 = new Line2D.Double(xpos + (3 * xamp), ypos + (7.5 * yamp), xpos + (7.5 * xamp),
				ypos + (7.5 * yamp));
		Line2D.Double line2 = new Line2D.Double(xpos + (4 * xamp), ypos + (7 * yamp), xpos + (4 * xamp),
				ypos + (8 * yamp));
		Line2D.Double line3 = new Line2D.Double(xpos + (5 * xamp), ypos + (7 * yamp), xpos + (5 * xamp),
				ypos + (8 * yamp));
		Line2D.Double line4 = new Line2D.Double(xpos + (6 * xamp), ypos + (7 * yamp), xpos + (6 * xamp),
				ypos + (8 * yamp));

		g2.draw(face);
		g2.draw(lefteye);
		g2.draw(righteye);
		g2.draw(lefteye1);
		g2.draw(righteye1);
		g2.draw(lefteye2);
		g2.draw(righteye2);
		g2.draw(noseL);
		g2.draw(noseR);
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		g2.draw(line4);

	}
}