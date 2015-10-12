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

import java.util.Random;

/**
 * a globe shape in the cityscape
 * 
 * @author Sarah Mansfield
 * @version October 2015
 */
public class Globe
{
    
    /**
     * Draws the globe
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //randomizes the color of the globe
        
        Random rand = new Random();

        float r = rand.nextFloat() / 2f;
        float g = rand.nextFloat() / 2f;
        float b = rand.nextFloat();

        Color randomColor = new Color(r, g, b);
        
        //
        
        Ellipse2D.Double globe = new Ellipse2D.Double(375, 250, 450, 450);

        Point2D center = new Point2D.Float(375, 250);
        float radius = 450;
        Point2D focus = new Point2D.Float(450, 450);
        float[] dist = {0.0f, 0.2f, 1.0f};
        Color[] colors = {Color.white, Color.white, randomColor};
        RadialGradientPaint p =
            new RadialGradientPaint(center, radius, focus,
                                    dist, colors,
                                    CycleMethod.REFLECT);
        
        g2.setPaint(p);
        g2.fill (globe);
        g2.draw(globe);
   
    }

}
