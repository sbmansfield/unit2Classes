

public class Annuity
{
    public static void main(String[] args)
    {
        double pmt = 10000;
        double i = .08;
        double n = 20;
        double pvAnn = pmt*(((Math.pow((1+i),(n-1))-1)/i)/(Math.pow((1+i),(n-1)))+ 1);
        
        System.out.println(pvAnn);
    }
}
