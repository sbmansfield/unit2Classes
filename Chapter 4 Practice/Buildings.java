import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Buildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buildings
{
    /** position of x coordinate */
    private int xLeft;
    /** position of y coordinate */
    private int yTop;

    /**
     * Default constructor for objects of class Buildings
     */
    public Buildings(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

     /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle b1 = new Rectangle(0, 700, 700, 500);
        
        g2.setPaint(Color.black);
        g2.fill (new Rectangle(0, 700, 700, 500));
        g2.draw(b1);
    }
}
