package Model;


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

    /**
     * Constructor for objects of class Loan
     */
    public Loan(int id, String date, String period, String status, Copy rentedCopy, Person person)
    {
        this.id = id;
        this.date = date;
        this.period = period;
        this.status = status;
        this.rentedCopy = rentedCopy;
        this.person = person;
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
    
}
