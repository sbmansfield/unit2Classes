import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

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
        
        //sky
        Sky nightsky = new Sky(700, 500);
        nightsky.draw(g2);
        
        //buildings
        Buildings b1 = new Buildings(50, 50);
        b1.draw(g2);
         
        //globe
        Globe globe = new Globe(100, 100);
        globe.draw(g2);
        
        //moon
        Moon moon1 = new Moon(100, 100);
        moon1.draw(g2);
        
        //sun
        Sun sun1 = new Sun(100, 100);
        sun1.draw(g2);
        
    }
}
