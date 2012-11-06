package Model;


/**
 * Write a description of class Copy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Copy
{
    private String serialNumber;
    private String purchaseDate;
    private double purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy()
    {
        
    }
    
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }
    
    public void setPurchaseDate(String purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }
    
    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    public String getSerialNumber()
    {
        return serialNumber;
    }
    
    public String getPurchaseDate()
    {
        return purchaseDate;
    }
    
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
    
    
}
