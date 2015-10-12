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
 * A moon shape in the cityscape
 * 
 * @author Sarah Mansfield
 * @version October 2015
 */
public class Moon
{
    
    /**
     * Draws the moon
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon1 = new Ellipse2D.Double(10, 10, 100, 100);
        Ellipse2D.Double moon2 = new Ellipse2D.Double(50, 300, 200, 200);
        Ellipse2D.Double moon3 = new Ellipse2D.Double(300, 50, 150, 150);

        Point2D center = new Point2D.Float(10, 10);
        float radius = 400;
        Point2D focus = new Point2D.Float(100, 100);
        float[] dist = {0.0f, 0.2f, 1.0f};
        Color[] colors = {Color.white, Color.gray, Color.white};
        RadialGradientPaint p =
            new RadialGradientPaint(center, radius, focus,
                                    dist, colors,
                                    CycleMethod.REFLECT);
        
        g2.setPaint(p);
        
        g2.fill (moon1);
        g2.draw(moon1);
        
        g2.fill (moon2);
        g2.draw(moon2);
        
        g2.fill (moon3);
        g2.draw(moon3);
        
    }

}
