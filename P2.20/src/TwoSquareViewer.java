import javax.swing.JFrame;

public class TwoSquareViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setVisible(true);
      
      frame.setSize(300, 400);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      TwoSquareComponent component = new TwoSquareComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
