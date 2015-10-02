import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

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
        Ellipse2D.Double moon1 = new Ellipse2D.Double(xLeft + 20, yTop + 20, 100, 100);

        g2.draw(moon1);
    }

}
