import java.util.Scanner;

public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number between 1,000 and 999,999: ");
        String number = in.next();
        
        number = number.replace("," , "");
        System.out.println(number);
    }
}


