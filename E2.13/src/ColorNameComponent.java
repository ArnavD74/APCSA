import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class ColorNameComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      //Graphics2D g2 = (Graphics2D) g;
      
      g.setColor(Color.RED);
      g.drawString("RED", 65, 80);

      g.setColor(Color.GREEN);
      g.drawString("GREEN", 65, 100);
      
      g.setColor(Color.BLUE);
      g.drawString("BLUE", 65, 120);
      
      g.setColor(Color.YELLOW);
      g.drawString("YELLOW", 65, 140);
      
      g.setColor(Color.CYAN);
      g.drawString("CYAN", 65, 160);
      
      g.setColor(Color.MAGENTA);
      g.drawString("MAGENTA", 65, 180);
      
      g.setColor(Color.BLACK);
      g.drawString("BLACK", 65, 200);
      
      g.setColor(Color.GRAY);
      g.drawString("GRAY", 65, 220);
      
      g.setColor(Color.LIGHT_GRAY);
      g.drawString("LIGHT_GRAY", 65, 240);
      
      g.setColor(Color.DARK_GRAY);
      g.drawString("DARK_GRAY", 65, 260);
      
      g.setColor(Color.ORANGE);
      g.drawString("ORANGE", 65, 280);
      
      g.setColor(Color.PINK);
      g.drawString("PINK", 65, 300);
      
   }
}