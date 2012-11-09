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
    /**
     * instance variables
     */
    private int id;
    private String date;
    private String period;
    private Copy rentedCopy;
    private Person person;
    private DVD dvdCopies;
    private Copy copy;
    private static ArrayList<Person> addressBook;
    private static ArrayList<DVD>dvdList;
    private static ArrayList<Copy>copies;
    private static ArrayList<Copy>loanen;
    private static Loan loanContainer;
    private static Loan instance;
    
    

    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        this.id = id;
        this.date = date;
        this.period = period;
        this.rentedCopy = rentedCopy;
        this.person = person;
        addressBook = new ArrayList<Person>();
        dvdList = new ArrayList<DVD>();
        copies = new ArrayList<Copy>();
        loanen = new ArrayList<Copy>();
    }
    
      public static Loan getInstance()
    {
        if(instance == null)
        {
            instance = new Loan();
        }
        return instance;
    }
    
    /**
     * Get and Set methods
     */
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
     * Print person details
     */
        public void getPerson(int personId)
    {
        for(Person person: addressBook)
        {
            if(person.getId() == id)
            person.print();
        }
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
    
    /**
     * Create a dvd
     */
        public void createDVD(int id, String title, String artist, String publicationDate)
    {
        if(checkIdDVD(id)==false) {
            System.out.println("ID already exist.");
        }
        else {
        DVD dvd = new DVD(id, title,artist,publicationDate);
        addDvd(dvd);
        }
    }
    
    /**
     * Add a dvd to the Dvd List
     */
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
    
    /**
     * Check for copy id duplication
     */
     public boolean checkCopyId(int id,int serialNumber)
    {
     
        for(DVD dvd: dvdList)
        {
            if(dvd.getId() == id && dvd.checkId(serialNumber)==true)
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if a copy is available for loan
     */
    public boolean checkLoanenId(int personId,int serialNumber,String purchaseDate)
    {
        boolean x = false;
        for(Person person: addressBook)
        {
            if(person.getId() == personId && (person.checkLoanenCopy(serialNumber,purchaseDate))==true)
            x= true;
        }
        return x;
    }
    
    /**
     * Create a copy for an existing dvd
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
        dvd.createCopy(serialNumber,purchaseDate,purchasePrice,period);
        }
    }
    
    /**
     * Check for copy avability
     */
    public boolean checkCopyAvability(int id)
    {
        int i = 0;
        for(Copy copy: copies)
        {
            if(copy.getSerialNumber()== id) {i++;}
        }
        if(i>0) return false;
        else
        return true;
    }
    
    /**
     * Return a dvd by its id
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
     * Change the copy avability after it was rented
     */
    public void changeCopyAvability(int dvdId,int serialNumber)
    {
        for(DVD dvd: dvdList)
        {
            if(dvd.getId()== dvdId)
            dvd.changeCopyAvability(serialNumber);
        }
    }
    
    /**
     * Get a copy that is available
     */
    public boolean getCopyAvability(int dvdId,int serialNumber)
    {
        boolean x = false;
        for(DVD dvd: dvdList)
        {
        if(dvd.getId()==dvdId && dvd.getCopyAvability(serialNumber) == true)
        x = true;
    }
    return x;
    }
    
    /**
     * Add copy to a person
     */
    public void addCopyToPerson(int personId, Copy copy)
    {
        for(Person person: addressBook)
        {
            if(person.getId()==personId)
            person.addLoanDvd(copy);
        }
    }
    
    /**
     * Get a copy by its serial number
     */
   public Copy getCopy(int dvdId,int serialNumber)
   {
       Copy copy = new Copy();
       for(DVD dvd: dvdList)
       {
           if(dvd.getId()==dvdId)
           copy = dvd.getCopy(serialNumber);
        }
        return copy;
    }
    
    /**
     * Print all copies rented by a person
     */
    public void printLoanenDvd(int personId)
    {
        for(Person person: addressBook)
        {
            if(person.getId()==personId)
            person.printLoanenDvd();
        }
    }
   
    /**
     * Remove a copy
     */
   public void removeCopy(int personID,int serialNumber,String purchaseDate)
   {
       for(Person person: addressBook)
       {
           if(checkId(personID)==false)
           person.removeCopy(serialNumber,purchaseDate);
        }
    }
        
    /**
     * Make a loan
     */
    public void makeLoan(int personId,int dvdId, int serialNumber)
    {
        if(checkId(personId)==false &&  checkCopyId(dvdId,serialNumber)==true && checkIdDVD(dvdId) ==false && getCopyAvability(dvdId,serialNumber)==true )
        {
            System.out.println("Copy has been loaned.");
            changeCopyAvability(dvdId,serialNumber);
            copy = getCopy(dvdId,serialNumber);
            addCopyToPerson(personId,copy);
        }
            
        else
        System.out.println("Loan can't be made.");
    }
    
    /**
     * Return a copy
     */
    public void returnCopy(int personId,int dvdId,int serialNumber,String purchaseDate)
    {
        if(checkId(personId)==false && (checkLoanenId( personId,serialNumber, purchaseDate))==true)
        {
            System.out.println("The DVD has been returned");
            changeCopyAvability(dvdId,serialNumber);
            removeCopy(personId,serialNumber,purchaseDate);
        }
        else
        System.out.println( "You can't return the dvd");
        
    }
    
    /**
     * Print a person's dvds
     */
    public void printPersonsWithDvds()
    {   int i = 1;
        for(Person person: addressBook)
        {
            if(person.numberOfPersonDvds()==true)
            {
            System.out.println("****Person " + i + " ****");
            person.print();
            System.out.println("This person has rented:");
            person.printLoanenDvd();
            System.out.println("**********************");
            i++;
        }
            
        }
    }
    
    /**
     * Extend the period of rent
     */ 
    public void extendPeriod(int personId,int serialNumber,int addDays)
    {
        for(Person person: addressBook)
        {
            if(person.getId()==personId)
            {
                person.extendPeriod(serialNumber,addDays);
            }
        }
    }
    
    /**
     * Get period of rent
     */
    public int getPeriod(int personId,int serialNumber)
    {
        for(Person person: addressBook)
        {
            if(person.getId()==personId)
            {
               return person.getPeriod(serialNumber);
            }
        }
        return 0;
    }
        
    
    
}
