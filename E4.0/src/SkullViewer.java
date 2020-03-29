import javax.swing.JFrame;

public class SkullViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("3 Skulls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SkullComponent component = new SkullComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}