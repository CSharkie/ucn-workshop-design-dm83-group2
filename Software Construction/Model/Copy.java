package Model;


/**
 * The class creates copies by initiating different attributes.
 */
public class Copy
{
    private int serialNumber;
    private String purchaseDate;
    private double purchasePrice;
    private int period;
    private DVD dvd;
    boolean available;

    /**
     * Constructor(empty) for objects of class Copy.
     */
    
    public Copy()
    {
    }
    
    /**
     * Constructor without the availability attribute./
     */
    public Copy(int serialNumber,String purchaseDate,double purchasePrice,int period)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.period = period;
        available = true;
    }
    /**
     * Consistent constructor for objects of class Copy..
     */
    public Copy(int serialNumber,String purchaseDate,double purchasePrice,boolean available,int period)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.available = available;
        this.period = period;
    }
    
    /**
     * A method for inserting a serial number.
     */
    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }
    
    /**
     * A method for initializing the wanted period of lending.
     */
    public void setPeriod(int period)
    {
        if(period>0)
        {
            this.period= period;
        }
    }
    
    /**
     * Sets purchase date of the copy.
     */
    
    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
    
    /**
     * Sets purchase price of a copy.
     */
    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    /**
     * Gives information about the serial number of the copy.
     */
    
    public int getSerialNumber()
    {
        return serialNumber;
    }
    
    /**
     * Gives information about the purchase date of the copy.
     */
    
    public String getPurchaseDate()
    {
        return purchaseDate;
    }
    
    /**
     * Checks the availability of the copy.
     */
    public boolean getAvability()
    {
        return available;
    }
    
    /**
     * Changes the availability status of the copy.
     */
    
    public boolean changeAvability()
    {
        if(available== true)
        {available= false;}
        else{
        available = true;}
        return available;
        
    }
    
    /**
     * Returns information about the purrchase price.
     */
    
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
    
    /**
     * Returns information about the DVD the copy created.
     */
    
    public DVD getDvd()
    {
        return dvd;
    }
    
    /**
     * Prints information about the coppy,
     * consisting of all attributes connected with it.
     */
    public void print()
    {   
        System.out.println("********************************");
        System.out.println("Serial number: " + serialNumber);
        System.out.println("Purchase date: " + purchaseDate);
        System.out.println("Purchase price: " + purchasePrice);
        System.out.println("Period: " + period + " days");
     
        System.out.println(" ");
    }
    
    /**
     * Extends the period of the time
     * the copy is lent.
     */
    
    public void extendPeriod(int addDays)
    {
        period = period+ addDays;
    }
    
    /**
     * Returns the period the copy is supposed
     * to be lent out.
     */
    
    public int getPeriod()
    {
        return period;
    }
    
}
