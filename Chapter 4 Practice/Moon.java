import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import java.awt.geom.Line2D;

import java.awt.GradientPaint;
import java.awt.Color;

import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;

/**
 * A moon shape
 */
public class Moon
{
    /** position of x coordinate */
    private int xLeft;
    /** position of y coordinate */
    private int yTop;

    /**
     * Constructs a moon with a given top right corner
     * @param x x coordinate of top right corner
     * @param y y coordinate of top right corner
     */
    public Moon(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the moon
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon1 = new Ellipse2D.Double(10, 10, 100, 100);

        GradientPaint graytowhite = new GradientPaint(100,100,Color.gray,20, 20,Color.white);
        
        g2.setPaint(graytowhite);
        g2.fill (new Ellipse2D.Double(10, 10, 100, 100));
        g2.draw(moon1);
        
    }

}
