package Model;


/**
 * Write a description of class Copy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * Constructor for objects of class Copy
     */
    
    public Copy()
    {
    }
    public Copy(int serialNumber,String purchaseDate,double purchasePrice,int period)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.period = period;
        available = true;
    }
    
    public Copy(int serialNumber,String purchaseDate,double purchasePrice,boolean available,int period)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.available = available;
        this.period = period;
    }
    
    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }
    
    public void setPeriod(int period)
    {
        if(period>0)
        {
            this.period= period;
        }
    }
    
    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
    
    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    public int getSerialNumber()
    {
        return serialNumber;
    }
    
    public String getPurchaseDate()
    {
        return purchaseDate;
    }
    
    public boolean getAvability()
    {
        return available;
    }
    
    public boolean changeAvability()
    {
        if(available== true)
        {available= false;}
        else{
        available = true;}
        return available;
        
    }
    
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
    
    public DVD getDvd()
    {
        return dvd;
    }
    
    public void print()
    {   
        System.out.println("********************************");
        System.out.println("Serial number: " + serialNumber);
        System.out.println("Purchase date: " + purchaseDate);
        System.out.println("Purchase price: " + purchasePrice);
        System.out.println("Period: " + period + " days");
     
        System.out.println(" ");
    }
    
    public void extendPeriod(int addDays)
    {
        period = period+ addDays;
    }
    
    public int getPeriod()
    {
        return period;
    }
    
}
