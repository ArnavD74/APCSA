import javax.swing.JFrame;

public class NameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      
      frame.setSize(300, 400);
      frame.setTitle("Name in rectangles");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      NameComponent component = new NameComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
