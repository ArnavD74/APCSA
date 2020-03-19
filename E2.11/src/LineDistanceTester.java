import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
@SuppressWarnings("serial")

public class LineDistanceTester extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      g.drawLine(100,  100,  200, 200);
      
      Point2D.Double point1 = new Point2D.Double(100, 200);
      Point2D.Double point2 = new Point2D.Double(150, 150);
      Point2D.Double point3 = new Point2D.Double(250, 50);
      Ellipse2D circ1 = new Ellipse2D.Double(100, 200, 5, 5);
      Ellipse2D circ2 = new Ellipse2D.Double(150, 150, 5, 5);
      Ellipse2D circ3 = new Ellipse2D.Double(250, 50, 5, 5);
      g2.draw(circ1);
      g2.draw(circ2);
      g2.draw(circ3);
      
      Line2D.Double lingus = new Line2D.Double(100,100,200,200);
      double d1 = lingus.ptLineDist(point1);
      double d2 = lingus.ptLineDist(point2);
      double d3 = lingus.ptLineDist(point3);

      System.out.println(d1);
      System.out.println(d2);
      System.out.println(d3);
      
   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(500, 500);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      LineDistanceTester component = new LineDistanceTester();
      frame.add(component);
      frame.setVisible(true);
   }
}