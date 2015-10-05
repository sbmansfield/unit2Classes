import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.GradientPaint;
import java.awt.Color;

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    /** position of x coordinate */
    private int xLeft;
    /** position of y coordinate */
    private int yTop;
    
    /**
     * Default constructor for objects of class Sky
     */
    public Sky(int x, int y)
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
        Rectangle sky = new Rectangle(0, 0, 700, 500);
        
        GradientPaint nightsky = new GradientPaint(0,0,Color.black,750, 450,Color.blue);
        
        g2.setPaint(nightsky);
        g2.fill (new Rectangle(0, 0, 700, 500));
        g2.draw(sky);
    }

}
