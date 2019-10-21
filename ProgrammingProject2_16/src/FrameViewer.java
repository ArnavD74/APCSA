import java.awt.Color;
import java.awt.Image;
//import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer {
	
	public static void main(String[] args) throws MalformedURLException {
		
		JFrame frame = new JFrame();
		
		
		Image image = null;
        try {
            URL url = new URL("https://www.doghealth.com/images/dog_scratching_doghealth.jpg");
            image = ImageIO.read(url);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
		frame.setSize(400, 400);
		JLabel label = new JLabel("Hello, Arnav!");
		label.setOpaque(true);
		label.setBackground(new Color(152, 251, 152));
		
		frame.setIconImage(image);
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}