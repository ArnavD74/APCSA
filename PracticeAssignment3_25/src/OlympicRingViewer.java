import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings({ "serial", "unused" })
public class OlympicRingViewer extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		OlympicRing ringobj = new OlympicRing();
		
		g2.draw(ringobj.ring(g2, Color.BLUE, 50, 50));
		g2.draw(ringobj.ring(g2, Color.BLACK, 110, 50));
		g2.draw(ringobj.ring(g2, Color.RED, 170, 50));
		g2.draw(ringobj.ring(g2, Color.YELLOW, 75, 75));
		g2.draw(ringobj.ring(g2, Color.GREEN, 135, 75));

		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OlympicRingViewer component = new OlympicRingViewer();
		frame.add(component);
		frame.setVisible(true);

	}
}
