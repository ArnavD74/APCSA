import javax.swing.JFrame;

public class ColorNameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      
      frame.setSize(500, 500);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      ColorNameComponent component = new ColorNameComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
