
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
This component draws the cityscape shapes
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Default constructor for objects of class CityscapeComponent
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Moon moon1 = new Moon(0,0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        g2.setColor(Color.GRAY);
        g2.fill(moon1);
        
        moon1.draw(g2);
    }
}
