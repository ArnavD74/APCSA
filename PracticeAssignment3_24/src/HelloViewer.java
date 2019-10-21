import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings({ "serial", "unused" })
public class HelloViewer extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);

		Hello h = new Hello();
		h.LetterH(g2);
		h.LetterE(g2);
		h.LetterL1(g2);
		h.LetterL2(g2);
		h.LetterO(g2);


		//h.draw(g2);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(1000, 1000);
		frame.setTitle("Houses");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HelloViewer component = new HelloViewer();
		frame.add(component);
		frame.setVisible(true);

	}
}
