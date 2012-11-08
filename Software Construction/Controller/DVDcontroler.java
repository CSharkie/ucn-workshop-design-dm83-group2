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
    private DVDcontainer dvdContainer;

    /**
     * Constructor for objects of class PersonControler
     */
    public DVDcontroler()
    {
        
        dvdContainer = DVDcontainer.getInstance();
    }
    
    public void createDVD(int id, String title, String artist, String publicationDate)
    {
        dvdContainer.createDVD(id, title, artist, publicationDate);
    }
    
    public void removeDVD(int id)
    {
        dvdContainer.removeDVD(id);
    }
    
    public void printDvd(int id)
    {
        dvdContainer.printDvd(id);
    }
    
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice)
    {
        dvdContainer.createCopy(id, serialNumber, purchaseDate, purchasePrice);
    }
    
    public void changeArtist(int id,String artist)
    {
        dvdContainer.changeArtist(id,artist);
    }
    
    public void changePublicationDate(int id,String publicationDate)
    {
        dvdContainer.changePublicationDate(id,publicationDate);
    }
    
    public void changeTitle(int id, String title)
    {
        dvdContainer.changeTitle( id, title);
    }
    
    public void printCopy(int id, int serialNumber)
    {
        dvdContainer.printCopy( id, serialNumber);
    }
    
    public void removeCopy(int id,int serialNumber)
    {
        dvdContainer.removeCopy(id,serialNumber);
    }
    
    public void printDvdByTitle(String title)
    {
        dvdContainer.printDvdByTitle(title);
    }
    
    public void printAllDvd()
    {
        dvdContainer.printAllDvd();
    }
    
    
    
}