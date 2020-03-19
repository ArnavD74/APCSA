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
		Ellipse2D.Double circ = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
		g2.setColor(Color.BLACK);
		g2.draw(circ);
		g2.setColor(Color.CYAN);
		g2.fill(circ);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(150, 200);
		frame.setTitle("Ellipse");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main component = new Main();
		frame.add(component);
		frame.setVisible(true);

	}

}
