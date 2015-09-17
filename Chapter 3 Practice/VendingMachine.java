

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        this.cans = 50;
        this.tokens = 0;
    }


    /**
     * Updates the token and can counts of the vending machine
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void insertToken(int newTokens) 
    {
        tokens += newTokens;
        cans -= newTokens;
    }

    /**
     * This method simulates filling up the vending machine with more soda cans
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int newCans)
    {
        cans += newCans;       
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getCanCount()
    {
        return cans;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokenCount()
    {
        return tokens;
    }

}
