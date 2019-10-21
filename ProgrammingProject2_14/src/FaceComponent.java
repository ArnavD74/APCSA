import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class FaceComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
	   
	  g2.draw(new Ellipse2D.Double(50, 50, 200, 200));
	  g2.draw(new Ellipse2D.Double(110, 70, 25, 25));
	  g2.draw(new Ellipse2D.Double(160, 70, 25, 25));
	  g2.drawLine(100,  150, 220 , 150);
      
   }
}