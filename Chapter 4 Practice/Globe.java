import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Point2D;

import java.awt.GradientPaint;
import java.awt.Color;

import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.MultipleGradientPaint.CycleMethod;

/**
 * Write a description of class Globe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Globe
{
    /** position of x coordinate */
    private int xLeft;
    /** position of y coordinate */
    private int yTop;

    /**
     * Default constructor for objects of class Globe
     */
    public Globe(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the globe
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double globe = new Ellipse2D.Double(300, 250, 450, 450);

        Point2D center = new Point2D.Float(300, 250);
        float radius = 450;
        Point2D focus = new Point2D.Float(450, 450);
        float[] dist = {0.0f, 0.2f, 1.0f};
        Color[] colors = {Color.white, Color.white, Color.blue};
        RadialGradientPaint p =
            new RadialGradientPaint(center, radius, focus,
                                    dist, colors,
                                    CycleMethod.REFLECT);
        
        g2.setPaint(p);
        g2.fill (globe);
        g2.draw(globe);
        
    }

}
