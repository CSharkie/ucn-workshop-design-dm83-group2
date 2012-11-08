package Model;
import java.util.ArrayList;

/**
 * Write a description of class DVDcontainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVDcontainer
{
    // instance variables - replace the example below with your own
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

    public static DVDcontainer getInstance()
    {
        if(instance == null)
        {
            instance = new DVDcontainer();
        }
        return instance;
    }
    
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
    
    private void addDvd(DVD newDvd)
    {
        dvdList.add(newDvd);
    }
    
    /**
     * Check for id duplication.
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
    
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice)
    {
        if(getDvd(id)==null)
        {
            System.out.println("Dvd id doesn't exist");
        }
        else
        {
        
        DVD dvd = getDvd(id);
        dvd.createCopy(serialNumber,purchaseDate,purchasePrice);
        }
    }
    
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
    
    public void printAllDvd()
    {
        for(DVD dvd: dvdList)
        {
            dvd.print();
            System.out.println("**************");
        }
    }
    
    public void printAllCopies(int id)
    {
        for(DVD dvd: dvdList)
        {
            if(dvd.getId()==id)
            dvd.printCopy();
        }
    }
            
    
}
