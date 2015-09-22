import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(0,0);
        
        int x = getWidth()-50;
        int y = getHeight()-50;
        
        Target target2 = new Target(x, y);
        
        target1.draw(g2);
        target2.draw(g2);
    }
}