package Model;
import java.util.ArrayList;

/**
 * A class of DVD that consists of attrubutes 
 * connected with the DVD requirements.
 */
public class DVD
{
    // instance variables - replace the example below with your own
    private int id;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copies;
    private static DVD instance;
    

    /**
     * Constructor for objects of class DVD
     */
    public DVD(int id,String title,String artist,String publicationDate)
    {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copies = new ArrayList<Copy>();
    }
    
    /**
     * Creates a static instance.
     */
    
    public static DVD getInstance(int id,String title,String artist,String publicationDate)
    {
        
        if(instance == null)
        {
            instance = new DVD(id,title,artist,publicationDate);
        }
        return instance;
    }
    
    /**
     * Sets ID [for the DVD.
     */
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Returns the id of the DVD.
     */
    
    public int getId()
    {
        return id;
    }
    
    /**
     * Sets a title to the DVD.
     */
    
    public void title(String title)
    {
        this.title = title;
    }
    
    /**
     * Returns the title of DVD.
     */
    
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Sets name of an artist.
     */
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    /**
     * Returns the artists of the DVD.
     */
    
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Sets publication date.
     */
    
    public void setPublicationDate(String publicationDate)
    {
        this.publicationDate = publicationDate;
    }
    
    /**
     * returns the publication date.
     */
    
    public String getPublicationDate()
    {
        return publicationDate;
    }
    
    /**
     * Adds copy from class Copy.
     */
    
    public void addCopy(Copy newCopy)
    {
        copies.add(newCopy);
    }
    
    /**
     * Removes DVD copy form a DVD object.
     */
    
    public void removeDVDcopy(int serialNumber)
    {
        Copy copy = getCopy(serialNumber);
        copies.remove(copy);
    }
    
    /**
     * Checks for copy and returns it, or gives null if 
     * a copy does not exist.
     */
    
    
    public Copy getCopy(int id)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        
        while(!found && index < copies.size())
        {
            Copy copy = copies.get(index);
            if(copy.getSerialNumber()==id){
                found = true;
                index2 = index;
            }
            index++;
        }
        
        if(found == true )
        {
            return copies.get(index2);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Creates a new copy.
     */
    
    public void createCopy(int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        if(checkId(serialNumber)==false) {
            System.out.println("Serial Number already exist.");
        }
        else {
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice,period);
        addCopy(copy);
             } 
    }
    
    /**
     * Checks for availability of a copy.
     */
    
    
    public boolean getCopyAvability(int SerialNumber)
    {
        boolean x = false;
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber() == SerialNumber && copy.getAvability())
            x = true;
        }
        return x;
    }
    
    /**
     * Checks Id.
     */
    
        public boolean checkId(int id)
    {
     
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber() == id)
            return false;
        }
        
        return true;
    }
    
    /**
     * Prints information about the copy by
     * first inserting the id of it.
     */
    
    public void printCopy(int id)
    {
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber() == id)
            {
                copy.print();
            }
        }
    }
    
    /**
     * Prints all copies of a DVD.
     */
    
    public void printCopy()
    {
        for(Copy copy: copies)
        {
            
            
                copy.print();
            
        }
    }
    
    /**
     * Changes the availability of the copy.
     */
    
    public void changeCopyAvability(int serialNumber)
    {
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber()== serialNumber)
            {
                copy.changeAvability();
            }
        }
    }
    
    /**
     * Extends the period of lending.
     */
    
    public void extendPeriod(int serialNumber,int addDays)
    {
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber()==serialNumber)
            {
                copy.extendPeriod(addDays);
            }
        }
    }
    
    /**
     * Prints information about about the DVD and
     * numbers of copies.
     */    
    public void print()
    {   
        int copiesNo = copies.size();
        System.out.println("*******************************");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Publication Date " + publicationDate);
        System.out.println("Number of copies available: " + copiesNo );
        System.out.println("*******************************");
        
    }
    
    
           
    
    
}