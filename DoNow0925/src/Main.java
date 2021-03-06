import java.awt.Color;
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
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.BLACK);

      Rectangle box0 = new Rectangle(50, 50, 200, 200);
      g2.draw(box0);
      Rectangle box1 = new Rectangle(70, 70, 160, 160);
      g2.draw(box1);
      Rectangle box2 = new Rectangle(90, 90, 120, 120);
      g2.draw(box2);
      Rectangle box3 = new Rectangle(110, 110, 80, 80);
      g2.draw(box3);
      Rectangle box4 = new Rectangle(130, 130, 40, 40);
      g2.draw(box4);
      
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