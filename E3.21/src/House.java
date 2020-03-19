import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class House {

	public int x;
	public int y;
	public int scale;

	public House(int x, int y, int scale) {
		this.x = x;
		this.y = y;
		this.scale = scale;
	}

	public void draw(Graphics2D g2) {
		Rectangle box = new Rectangle(x*scale, y*scale, 100*scale, 100*scale);
		Line2D.Double seg1 = new Line2D.Double(x*scale, y*scale, (x+50)*scale, (y-40)*scale);
		Line2D.Double seg2 = new Line2D.Double((x+50)*scale, (y-40)*scale, (x+100)*scale, y*scale);

		g2.draw(box);
		g2.draw(seg1);
		g2.draw(seg2);

	}

}
