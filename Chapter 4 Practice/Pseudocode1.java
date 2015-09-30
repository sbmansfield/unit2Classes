import java.util.Scanner;

public class Pseudocode1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a ten-digit phone number: ");
        String number = in.next();
        
        String areaCode = "("+ number.substring(0,3) +")";
        String three = number.substring(3,6) +"-";
        String four = number.substring(6,10);
        
        String phoneNum = areaCode + three + four;
        
        System.out.println(phoneNum);
    }
}
