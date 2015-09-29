

public class Rectangle
{
    public static void main(String[] args)
    {
        double length = System.out.println("Enter a length: ");
        double width = System.out.println("Enter a width: ");
        
        double area = length*width;
        double perimeter = 2*(length+width);
        double diagonal = Math.pow((length*length+width*width),(1/2));
    }
}
