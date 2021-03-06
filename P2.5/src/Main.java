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
      
      Rectangle box = new Rectangle(50, 50, 6, 7);
      g2.setColor(Color.BLUE);
      g2.draw(box);
      double width0 = box.getWidth();
      double height0 = box.getHeight();
      int width1 = (int)width0;
      int height1 = (int)height0;
      g.drawString("W = " + width1, 50, 30);
      g.drawString("H = " + height1, 50, 15);
      g.drawString("The area is: " + ((2*width1)+(2*height1)), 50, 45);
      
      Rectangle box2 = new Rectangle(150, 210, 10, 11);
      g2.setColor(Color.RED);
      g2.draw(box2);
      double width2 = box2.getWidth();
      double height2 = box2.getHeight();
      int width3 = (int)width2;
      int height3 = (int)height2;
      g.drawString("W = " + width3, 150, 170);
      g.drawString("H = " + height3, 150, 185);
      g.drawString("The perimeter is: " + ((2*width1)+(2*height1)), 150, 200);


      

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