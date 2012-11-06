package Controller;
import Model.*;


/**
 * Write a description of class PersonControler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVDcontroler
{
    // instance variables - replace the example below with your own
    private DVD dvd;

    /**
     * Constructor for objects of class PersonControler
     */
    public DVDcontroler(int id,String title,String artist,String publicationDate)
    {
        dvd = DVD.getInstance(id,title,artist,publicationDate);
    }

    
    public void createCopy(int serialNumber, String purchaseDate,double purchasePrice)
    {
        dvd.createCopy(serialNumber,purchaseDate,purchasePrice);
    }
    
    public void removeDVDcopy(int serialNumber)
    {
        dvd.removeDVDcopy(serialNumber);
    }
    
    public void setId(int id)
    {
        dvd.setId(id);
    }
    
    public void setArtist(String artist)
    {
        dvd.setArtist(artist);
    }
    
    public void setPublicationDate(String publicationDate)
    {
        dvd.setPublicationDate(publicationDate);
    }
    
    public void printCopy(int id)
    {
        dvd.printCopy(id);
    }
    
    
}