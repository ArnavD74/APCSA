import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class CarComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Car car1 = new Car(0, 0, Color.BLUE, 3);

		int x = getWidth() - 60;
		int y = getHeight() - 30;

		Car car2 = new Car(x, y, Color.RED, 1);
		
		Car car3 = new Car(100, 100, Color.GREEN, 2);

		car1.draw(g2);
		car2.draw(g2);
		car3.draw(g2);

	}
}
