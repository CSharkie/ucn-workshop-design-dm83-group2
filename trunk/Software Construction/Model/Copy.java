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

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber,String purchaseDate,double purchasePrice)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }
    
    public void setSerialNumber(int serialNumber)
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
    
    public int getSerialNumber()
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
    
    public void print()
    {
        System.out.println("Serial number: " + serialNumber);
        System.out.println("Purchase date: " + purchaseDate);
        System.out.println("Purchase price: " + purchasePrice);
        System.out.println(" ");
    }
    
}
