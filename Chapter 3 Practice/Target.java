import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D; 

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the circles
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        
        g2.draw(body);
        g2.draw(circle1);
    }

}
