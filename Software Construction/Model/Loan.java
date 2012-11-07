package Model;
import java.util.ArrayList;


/**
 * Write a description of class Loan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loan
{
    private int id;
    private String date;
    private String period;
    private String status;
    private Copy rentedCopy;
    private Person person;
    private DVD dvdCopies;
    private Copy copy;
    private ArrayList<Person> addressBook;
    private ArrayList<DVD>dvdList;
    private ArrayList<Copy>copies;
    
    

    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        this.id = id;
        this.date = date;
        this.period = period;
        this.status = status;
        this.rentedCopy = rentedCopy;
        this.person = person;
        addressBook = new ArrayList<Person>();
        dvdList = new ArrayList<DVD>();
        copies = new ArrayList<Copy>();
    }
    
    
    
    public int getId()
    {
        return id;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String getPeriod()
    {
        return period;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public Copy getRentedCopy()
    {
        return rentedCopy;
    }
    
    public Person getPerson()
    {
        return person;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setPeriod(String period)
    {
        this.period = period;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void setRentedCopy(Copy rentedCopy)
    {
        this.rentedCopy = rentedCopy;
    }
    
    public void setPerson(Person person)
    {
        this.person = person;
    }
    
        private void addPerson(Person newPerson)
    {
        addressBook.add(newPerson);
    }
    
    /**
     * Creates a person and add's it to the AddressBook and checks if the id already exists.
     */
    public void createPerson(int id, String name, String address, int postalCode, String city, String phone)
    {
        if(checkId(id)==false) {
            System.out.println("ID already exist.");
        }
        else {
        Person person = new Person(id, name, address, postalCode, city, phone);
        addPerson(person);
    }
    }
    
    /**
     * Check for id duplication.
     */
    public boolean checkId(int id)
    {
     
        for(Person person: addressBook)
        {
            if(person.getId() == id)
            return false;
        }
        
        return true;
    }
    
    
    
        public void createDVD2(int id, String title, String artist, String publicationDate,int copies)
    {
        if(checkIdDVD(id)==false) {
            System.out.println("ID already exist.");
        }
        else {
        DVD dvd = new DVD(id, title,artist,publicationDate,copies);
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
    public boolean checkIdDVD(int id)
    {
     
        for(DVD dvd: dvdList)
        {
            if(dvd.getId() == id)
            return false;
        }
        
        return true;
    }
    
        public void addCopy(Copy newCopy)
    {
        copies.add(newCopy);
    }
    
       public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice)
    {
        if(checkIdDVD(id)==true)
        {
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice);
        addCopy(copy);
    }
    else 
    { }
    }
    
    
    
}
