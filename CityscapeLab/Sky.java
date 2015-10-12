import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.GradientPaint;
import java.awt.Color;

/**
 * the sky in the cityscape
 * 
 * @author Sarah Mansfield
 * @version October 2015
 */
public class Sky
{
    /** color of sky (from user) */
    
    private String color;
    
    
    /**
     * Default constructor for objects of class Sky
     */
    public Sky(String newColor)
    {
        color = newColor;
    }

    /**
     * draws the sky
     *
     * @param    g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0, 0, 800, 600);

        GradientPaint nightsky;
       
        if (color.equals("blue")) 
            nightsky = new GradientPaint(0,0,Color.black,1400, 300,Color.blue);
        else 
            nightsky = new GradientPaint(0,0,Color.black,1400, 300,Color.gray);
        
   
        g2.setPaint(nightsky);
        g2.fill (sky);
        g2.draw(sky);
    }
        
        
}


