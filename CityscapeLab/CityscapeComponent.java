import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Sky nightsky;  
    private Globe globe;
    private Moon moon1;
    private Buildings b1;

    private String skyColor;
    
    // define the CityscapeComponent contructor and initialize all instance variables
    // ...
    public CityscapeComponent(String newskycolor)
    {    
        skyColor  = newskycolor;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //sky
        Sky nightsky = new Sky(skyColor);  
        //globe
        Globe globe = new Globe();
        //moon
        Moon moon1 = new Moon();
        //buildings
        Buildings b1 = new Buildings();
        
        // invoke the draw method on each object in your Cityscape

        nightsky.draw(g2);
        globe.draw(g2);
        moon1.draw(g2);
        b1.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
      
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
