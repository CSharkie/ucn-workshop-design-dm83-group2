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
    /**
     * instance variables
     */
     
    private DVDcontainer dvdContainer;

    /**
     * Constructor for objects of class PersonControler
     */
    public DVDcontroler()
    {
        dvdContainer = DVDcontainer.getInstance();
    }
    
    /**
     * Create dvd 
     */
    
    public void createDVD(int id, String title, String artist, String publicationDate)
    {
        dvdContainer.createDVD(id, title, artist, publicationDate);
    }
    
    /**
     * Remove dvd
     */
    
    public void removeDVD(int id)
    {
        dvdContainer.removeDVD(id);
    }
    
    /**
     * Print dvd details
     */
    public void printDvd(int id)
    {
        dvdContainer.printDvd(id);
    }
    
    /**
     * Create a copy for an existing dvd
     */
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        dvdContainer.createCopy(id, serialNumber, purchaseDate, purchasePrice,period);
    }
    
    /**
     * Change the name of the artist
     */
    public void changeArtist(int id,String artist)
    {
        dvdContainer.changeArtist(id,artist);
    }
    
    /**
     * Change the publication date of dvd
     */
    public void changePublicationDate(int id,String publicationDate)
    {
        dvdContainer.changePublicationDate(id,publicationDate);
    }
    
    /**
     * Change the title of the dvd
     */
    public void changeTitle(int id, String title)
    {
        dvdContainer.changeTitle( id, title);
    }
    
    /**
     * Print copy details
     */
    public void printCopy(int id, int serialNumber)
    {
        dvdContainer.printCopy( id, serialNumber);
    }
    
    /**
     * Remove a dvd copy
     */
    public void removeCopy(int id,int serialNumber)
    {
        dvdContainer.removeCopy(id,serialNumber);
    }
    
    /**
     * Print dvd details searching by name of it
     */
    public void printDvdByTitle(String title)
    {
        dvdContainer.printDvdByTitle(title);
    }
    
    /**
     * Print all the dvds details
     */
    public void printAllDvd()
    {
        dvdContainer.printAllDvd();
    }
    
    /**
     * Print all the copies details
     */
    public void printAllCopies(int id)
    {
        dvdContainer.printAllCopies(id);
    }
    
    
}