package Model;


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

    /**
     * Constructor for objects of class DVD
     */
    public DVD()
    {
        
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
    
        
    
    
}