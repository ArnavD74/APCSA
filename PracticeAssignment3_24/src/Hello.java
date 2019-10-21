import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class Hello {

	public int x;
	public int y;
	public int scale;

	public void LetterH(Graphics2D g2) {
		Line2D.Double seg1 = new Line2D.Double(10, 10, 10, 100);
		Line2D.Double seg2 = new Line2D.Double(10, 60, 30, 60);
		Line2D.Double seg3 = new Line2D.Double(30, 10, 30, 100);

		g2.draw(seg1);
		g2.draw(seg2);
		g2.draw(seg3);	
	}
	
	public void LetterE(Graphics2D g2) {
		Line2D.Double seg1 = new Line2D.Double(70, 10, 70, 100);
		Line2D.Double seg2 = new Line2D.Double(70, 10, 80, 10);
		Line2D.Double seg3 = new Line2D.Double(70, 40, 80, 40);
		Line2D.Double seg4 = new Line2D.Double(70, 100, 80, 100);

		g2.draw(seg1);
		g2.draw(seg2);
		g2.draw(seg3);	
		g2.draw(seg4);
	}
	
	public void LetterL1(Graphics2D g2) {
		Line2D.Double seg1 = new Line2D.Double(90, 10, 90, 100);
		Line2D.Double seg2 = new Line2D.Double(90, 100, 110, 100);

		g2.draw(seg1);
		g2.draw(seg2);
	}
	
	public void LetterL2(Graphics2D g2) {
		Line2D.Double seg1 = new Line2D.Double(10, 10, 10, 100);
		Line2D.Double seg2 = new Line2D.Double(10, 60, 30, 60);
		Line2D.Double seg3 = new Line2D.Double(30, 10, 30, 100);

		g2.draw(seg1);
		g2.draw(seg2);
		g2.draw(seg3);	
	}
	
	public void LetterO(Graphics2D g2) {
		Line2D.Double seg1 = new Line2D.Double(10, 10, 10, 100);
		Line2D.Double seg2 = new Line2D.Double(10, 60, 30, 60);
		Line2D.Double seg3 = new Line2D.Double(30, 10, 30, 100);

		g2.draw(seg1);
		g2.draw(seg2);
		g2.draw(seg3);	
	}



}