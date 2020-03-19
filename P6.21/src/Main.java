import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		int pos = 120;

		for (int i = 0; i <= 10; i++) {

			int line = 10 + 10*i; //+ 10

			g2.drawLine(pos - line, pos - line, pos + line, pos - line); // sub sub add sub -- rightward line
			g2.drawLine(pos + line, pos - line, pos + line, pos + line); //add sub add add -- downward line
			g2.drawLine(pos + line - 10, pos + line - 10, pos + line - 10, pos + line); //add sub add sub add sub (sub + 10) 10connector
			g2.drawLine(pos + line - 10, pos + line, pos - line, pos + line); //add sub add sub add (sub + 10) -- leftward line
			g2.drawLine(pos - line, pos + line, pos - line, pos - line); //sub add sub sub (rev of 1) --upward line
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(250, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main component = new Main();
		frame.add(component);
		frame.setVisible(true);

	}

}
