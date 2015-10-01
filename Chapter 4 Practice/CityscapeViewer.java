import javax.swing.JFrame;
 
/**
 * Write a description of class CityscapeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityscapeViewer
{
    public static void main(String[] args)
     {
         JFrame frame = new JFrame();

         frame.setSize(300, 400);
         frame.setTitle("Cityscape");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         CityscapeComponent component = new CityscapeComponent();
         frame.add(component);

         frame.setVisible(true);
    }
}
