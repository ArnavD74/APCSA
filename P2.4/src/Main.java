import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;


/*
   Write a graphics program that draws two squares, both with the same center. 
   Provide a class TwoSquareViewer and a class TwoSquareComponent.
*/

@SuppressWarnings("serial")
public class Main extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Rectangle box = new Rectangle(50, 50, 50, 100);
      g2.setColor(Color.BLUE);
      g2.draw(box);
      double width = box.getWidth();
      double height = box.getHeight();
      int width1 = (int)width;
      int height1 = (int)height;
      g.drawString("W " + width1, 10, 20);
      g.drawString("H " + height1, 10, 10);
      g.drawString("The perimeter is: " + ((2*width1)+(2*height1)), 50, 45);
      

   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      
      frame.setSize(300, 400);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      Main component = new Main();
      frame.add(component);

      frame.setVisible(true);
   }
}