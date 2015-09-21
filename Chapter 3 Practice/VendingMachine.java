

/**
 * A vending machine holds cans of soda. To buy a can of soda, the customer needs to 
 * insert a token into the machine. When the token is inserted, a can drops from the 
 * can reservoir into the product delivery slot. The vending machine can be filled with more cans. 
 * The goal is to determine how many cans and tokens are in the machine at any given time.
 * 
 * @author Sarah Mansfield
 * @version 17 September 2015
 */
public class VendingMachine
{
    /** the number of cans in the vending machine */
    private int cans;
    
    /** the number of tokens in the vending machine */
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
        this.cans = 10;
        this.tokens = 0;
    }


    /**
     * Updates the token and can counts of the vending machine
     *
     * @pre     the number of new tokens will not exceed the number of cans in the machine
     * @param   newTokens   integer number of new tokens to be put in the machine
     */
    public void insertToken(int newTokens) 
    {
        tokens += newTokens;
        cans -= newTokens;
    }

    /**
     * This method simulates filling up the vending machine with more soda cans
     *
     * @param    newCans    integer number of new cans to be added to the machine    
     */
    public void fillUp(int newCans)
    {
        cans += newCans;       
    }


    /**
     * Gets the can count of the number of cans in the machine
     *
     * @return  number of cans in the machine
     */
    public int getCanCount()
    {
        return cans;
    }


    /**
     * Gets the token count of the number of tokens in the machine
     *
     * @return  number of tokens in the machine
     */
    public int getTokenCount()
    {
        return tokens;
    }

}
