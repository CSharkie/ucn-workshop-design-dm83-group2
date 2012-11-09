package Model;
import java.util.ArrayList;

/**
 * Write a description of class DVD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public static DVD getInstance(int id,String title,String artist,String publicationDate)
    {
        
        if(instance == null)
        {
            instance = new DVD(id,title,artist,publicationDate);
        }
        return instance;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void title(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public void setPublicationDate(String publicationDate)
    {
        this.publicationDate = publicationDate;
    }
    
    public String getPublicationDate()
    {
        return publicationDate;
    }
    
    public void addCopy(Copy newCopy)
    {
        copies.add(newCopy);
    }
    
    public void removeDVDcopy(int serialNumber)
    {
        Copy copy = getCopy(serialNumber);
        copies.remove(copy);
    }
    
    
    
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
    
        public boolean checkId(int id)
    {
     
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber() == id)
            return false;
        }
        
        return true;
    }
    
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
    
    public void printCopy()
    {
        for(Copy copy: copies)
        {
            
            
                copy.print();
            
        }
    }
    
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