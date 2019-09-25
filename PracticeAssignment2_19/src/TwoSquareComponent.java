import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


/*
   Write a graphics program that draws two squares, both with the same center. 
   Provide a class TwoSquareViewer and a class TwoSquareComponent.
*/

@SuppressWarnings("serial")
public class TwoSquareComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      Rectangle box = new Rectangle(55, 55, 40, 40);
      Rectangle box2 = new Rectangle(50, 50, 50, 50);
      g2.draw(box);
      g2.draw(box2);

   }
}