package Model;
import java.util.ArrayList;

/**
 * DVDcontainer class that stores
 * list of DVDs.
 */
public class DVDcontainer
{
    private ArrayList<DVD>dvdList;
    private static DVDcontainer instance;
    private DVD dvd;

    /**
     * Constructor for objects of class DVDcontainer
     */
    public DVDcontainer()
    {
        dvdList = new ArrayList<DVD>();
    }
    
    /**
     * Creates a static instance.
     */

    public static DVDcontainer getInstance()
    {
        if(instance == null)
        {
            instance = new DVDcontainer();
        }
        return instance;
    }
    
    /**
     * Creates a new DVD.
     */
    
    public void createDVD(int id, String title, String artist, String publicationDate)
    {
        if(checkId(id)==false) {
            System.out.println("ID already exist.");
        }
        else {
        DVD dvd = new DVD(id, title,artist,publicationDate);
        addDvd(dvd);
    }
    }
    
    /**
     * Adds new DVD.
     */
    
    private void addDvd(DVD newDvd)
    {
        dvdList.add(newDvd);
    }
    
    
    /**
     * Checks for id duplication.
     */
    public boolean checkId(int id)
    {
     
        for(DVD dvd: dvdList)
        {
            if(dvd.getId() == id)
            return false;
        }
        
        return true;
    }
    
    /**
     * Returns the DVD that has the same id as the parameter
     * or returns null if the id does not exist.
     */
    
    public DVD getDvd(int id)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        
        while (!found && index < dvdList.size())
        {
            DVD dvd = dvdList.get(index);
            if(dvd.getId() == id)
            {
                found = true;
                index2 = index;
            }
            index++;
        }
        if(found == true)
        {
            return dvdList.get(index2);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Creates a new copy.
     */
    
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
        
        DVD dvd = getDvd(id);
        dvd.createCopy(serialNumber,purchaseDate,purchasePrice, period);
        }
    }
    
    /**
     * Prints information about a DVD.
     */
    
    public void printDvd(int id)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.print();
        }
    }
    
    /**
     * Prints information about a copy
     * by first inserting an id.
     */
    
    public void printCopy(int id, int serialNumber)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.printCopy(serialNumber);
        }
    }
    
    /**
     * Removes a copy by first inserting the id.
     */
    
    public void removeCopy(int id,int serialNumber)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.removeDVDcopy(serialNumber);
        }
    }
    
    /**
     * Changes artist of a DVD.
     */
    
    public void changeArtist(int id,String artist)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.setArtist(artist);
        }
    }
    
    /**
     * Changes the title of a DVD.
     */
    
    public void changeTitle(int id, String title)
        {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.title(title);
        }
    }
    
    /**
     * Changes publication date.
     */
    public void changePublicationDate(int id,String publicationDate)
    
   {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
            DVD dvd = getDvd(id);
            dvd.setPublicationDate(publicationDate);
        }
    }
    
    /**
     * Removes DVD from the ArrayList.
     */
    public void removeDVD(int id)
    {
        DVD dvd = getDvd(id);
        dvdList.remove(dvd);
    }
    
    public void printDvdByTitle(String title)
    {
        for(DVD dvd : dvdList)
        {
            if(dvd.getTitle().equals(title))
            {
                dvd.print();
            }
        }
    }
    
    /**
     * Prints all DVDs stored in the AraryList.
     */
    
    public void printAllDvd()
    {
        for(DVD dvd: dvdList)
        {
            dvd.print();
            System.out.println("**************");
        }
    }
    
    /**
     * Prints all copies available for a single DVD.
     */
    public void printAllCopies(int id)
    {
        for(DVD dvd: dvdList)
        {
            if(dvd.getId()==id)
            dvd.printCopy();
        }
    }
            
    
}
