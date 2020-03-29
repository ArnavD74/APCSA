import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

public class SkullComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Skull s = new Skull();

		s.draw(g2, Color.BLACK, 10, 10, 5, 5); // small

		s.draw(g2, Color.BLACK, 50, 40, 10, 10); // medium

		s.draw(g2, Color.BLACK, 10, 150, 15, 15); // large

	}
}