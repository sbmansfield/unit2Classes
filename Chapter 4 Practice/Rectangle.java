import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a length: ");
        double length = in.nextDouble();
        System.out.print("Enter a width: ");
        double width = in.nextDouble();
        
        double area = length*width;
        double perimeter = 2*(length+width);
        
        double sqLength = length*length;
        double sqWidth = width*width;
        double diagonal = Math.pow( (sqLength + sqWidth), (.5) );
        
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Diagonal: "+diagonal);
    }
}
