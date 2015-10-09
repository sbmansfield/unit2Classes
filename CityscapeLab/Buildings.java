import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

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
        //draws buildings
        Rectangle b1 = new Rectangle(510, 180, 30, 100);
        Rectangle b2 = new Rectangle(540, 190, 30, 90);
        Rectangle b3 = new Rectangle(570, 155, 30, 125);
        Rectangle b4 = new Rectangle(600, 130, 30, 150);
        Rectangle b5 = new Rectangle(630, 180, 30, 100);
        Rectangle b6 = new Rectangle(660, 205, 30, 75);
        
        //fills buildings in black
        g2.setPaint(Color.black);
        g2.fill(b1);
        g2.draw(b1);
        
        g2.fill(b2);
        g2.draw(b2);
        
        g2.fill(b3);
        g2.draw(b3);
        
        g2.fill(b4);
        g2.draw(b4);
        
        g2.fill(b5);
        g2.draw(b5);
        
        g2.fill(b6);
        g2.draw(b6);
        
        //outlines each building
        g2.setPaint(Color.white);
        
        g2.draw(b1);
        g2.draw(b2);
        g2.draw(b3);
        g2.draw(b4);
        g2.draw(b5);
        g2.draw(b6);
        
        
    }
}
