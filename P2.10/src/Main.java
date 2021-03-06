import java.awt.Color;
import java.lang.Object;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      //Rectangle box = new Rectangle(50, 50, 200, 200);
      int red = 50;
      int blue = 100;
      int green = 150;
      Color cool = new Color(red, blue, green);
      g2.setColor(cool);

      g.drawString("Red: " + red, 50, 25);
      g.drawString("Blue: " + blue, 50, 35);
      g.drawString("Green: " + green, 50, 45);
      
      g2.fillRect(50, 50, 200, 200);
      

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