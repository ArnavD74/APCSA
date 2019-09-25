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
	   public static void main(String[] args)
   {  

      //Color cool = new Color(red, blue, green);
      
      Color darkred = Color.RED;
      
      darkred = darkred.darker();
      darkred = darkred.darker();

      int red = darkred.getRed();
      int green = darkred.getGreen();
      int blue = darkred.getBlue();

      Color cool = new Color(red, blue, green);
      
      System.out.println("Red: " + red);
      System.out.println("Blue: " + blue);
      System.out.println("Green: " + green);
      
      System.out.println(cool.getRGB());  //debug
      
      
      
   }
}