

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank.
 * The car may be driven, which reduces the amount of gas in the fuel tank.
 * 
 * @author Sarah Mansfield 
 * @version 10 September 2015
 */
public class Car
{
    /** the fuel efficiency for the car measured in units of miles/gallon (mpg) */
    private double fuelEfficiency;
    
    /** the amount of fuel in the tank of the car measured in units of gallons */
    private double fuelInTank;
   
    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * This method simulates driving the car for the specified distance and 
     * reduces the amount of gas in the fuel tank
     *
     * @pre     the specified distance will not consume more than the available gas
     * @param    distance    the specified distance to drive in units of miles
     */
    public void drive(double distance)
    {
        fuelInTank -= distance/fuelEfficiency;
    }


    /**
     * Returns the number of gallons of gas in the car's tank
     * 
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }


    /**
     * Increments the amount of gas in the car's tank by the specified number of gallons
     *
     * @pre     gallonsOfGas must be positive
     * @post    gallonsOfGas    amount of gas to add to the car's tank
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
        
    }

}
