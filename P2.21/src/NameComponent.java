import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JComponent;


/*
   Write a graphics program that draws two squares, both with the same center. 
   Provide a class TwoSquareViewer and a class TwoSquareComponent.
*/

@SuppressWarnings("serial")
public class NameComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Rectangle box = new Rectangle(50, 50, 200, 200);
      g2.setColor(Color.BLUE);
      g2.draw(box);
      g.setColor(Color.RED);
      g.drawString("Arnav Dashaputra", 65, 80);

   }
}