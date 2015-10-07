import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import java.awt.GradientPaint;
import java.awt.Color;

/**
 * A moon shape
 */
public class Sun
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
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the sun
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun1 = new Ellipse2D.Double(50, 50, 100, 100);

        GradientPaint graytoyellow = new GradientPaint(150,150,Color.yellow,50, 50,Color.gray);
        
        g2.setPaint(graytoyellow);
        g2.fill (sun1);
        g2.draw(sun1);
        
    }

}
