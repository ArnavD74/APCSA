import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings({ "serial", "unused" })
public class HouseTester extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);

		House house1 = new House(50, 50);
		House house2 = new House(170, 150);
		House house3 = new House(300, 300);

		house1.draw(g2);
		house2.draw(g2);
		house3.draw(g2);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(1000, 1000);
		frame.setTitle("Houses");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HouseTester component = new HouseTester();
		frame.add(component);
		frame.setVisible(true);

	}
}
