import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		int x;
		int y;

		for (int i = 0; i < 8; i++) { //8x
			
			for (int j = 0; j < 8; j++) { //8y
				
				x = i * 16;
				y = j * 16;

				if (i % 2 == j % 2)
					g2.setColor(Color.WHITE);
				
				else 
					g2.setColor(Color.BLACK);

				g2.fillRect(x, y, 16, 16); //tile

			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(150, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main component = new Main();
		frame.add(component);
		frame.setVisible(true);

	}

}
