import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("https://st.depositphotos.com/1216158/3267/v/950/depositphotos_32676701-stock-illustration-sun-clipart.jpg");
		JOptionPane.showMessageDialog(null, "GOOD MORNING", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}