import java.awt.Color;
import java.lang.Object;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;
@SuppressWarnings("serial")

public class Main extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      g.drawRect(50, 50, 100, 200);
      
      Ellipse2D red =  new Ellipse2D.Double(90, 90, 20, 20);
      g.setColor(Color.RED);
      g2.fill(red);
      g2.draw(red);
      
      Ellipse2D yellow =  new Ellipse2D.Double(90, 140, 20, 20);
      g.setColor(Color.YELLOW);
      g2.fill(yellow);
      g2.draw(yellow);
      
      Ellipse2D green =  new Ellipse2D.Double(90, 200, 20, 20);
      g.setColor(Color.GREEN);
      g2.fill(green);
      g2.draw(green);
      
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