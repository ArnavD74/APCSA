import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

@SuppressWarnings({ "serial", "unused" })

public class Main extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		int x = 0;
		int y = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				g2.setColor(Color.BLACK);
			} else {
				g2.setColor(Color.WHITE);
			}
			x = x + 50;
			y = y + 50;
			g2.fillOval(0 + x / 2, 0 + y / 2, 500 - x, 500 - y);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(550, 550);
		frame.setTitle("Ellipse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main component = new Main();
		frame.add(component);
		frame.setVisible(true);

	}

}
