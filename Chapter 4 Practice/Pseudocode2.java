import java.util.Scanner;

public class Pseudocode2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Amount Due: ");
        int due = in.nextInt();
        
        System.out.print("Amount Received: ");
        int received = in.nextInt();
        
        int change = received - due;
        
        int dollars = change/100;
        int quarters = (change-100*dollars)/25;
        int dimes = (change-100*dollars-25*quarters)/10;
        int nickels = (change-100*dollars-25*quarters-10*dimes)/5;
        int pennies = (change-100*dollars-25*quarters-10*dimes-5*nickels);
        
        System.out.println("The amount of change is equal to "+dollars+" dollars, "
        +quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
    }
}
