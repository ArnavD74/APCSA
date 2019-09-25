
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
@SuppressWarnings("unused")

public class Main
{
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Rectangle rect1 = new Rectangle(20, 20, 20, 20);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		rect1.translate(20, 20);
		
	}
}