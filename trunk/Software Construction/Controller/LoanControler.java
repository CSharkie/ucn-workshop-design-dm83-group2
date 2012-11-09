package Controller;
import Model.*;

/**
 * Write a description of class LoanControler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoanControler
{
    /**
     * instance variables
     */
    private Loan loan;
   

    /**
     * Constructor for objects of class LoanControler
     */
    public LoanControler()
    {
       loan = Loan.getInstance();
    }
    
    /**
     * Create a new dvd
     */
    public void createDVD(int id, String title, String artist, String publicationDate)
    {
        loan.createDVD(id, title, artist, publicationDate);
    }
    
    /**
     * Create a dvd copy
     */
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        loan.createCopy(id,serialNumber,purchaseDate,purchasePrice,period);
    }
    
    /**
     * Make a loan
     */
    public void makeLoan(int personId,int dvdId, int serialNumber)
    {
        loan.makeLoan(personId,dvdId,serialNumber);
    }
    
    /**
     * Return a copy
     */
    public void returnCopy(int personId,int dvdId,int serialNumber,String purchaseDate)
    {
        loan.returnCopy(personId,dvdId,serialNumber,purchaseDate);
    }
    
    /**
     * Create a new person
     */
    public void createPerson(int id, String name, String address, int postalCode, String city, String phone)
    {
        loan.createPerson(id,name,address,postalCode,city,phone);
    }
    
    /**
     * Print all loanen dvds of a person
     */
    public void printLoanenDvd(int personId)
    {
        loan.printLoanenDvd(personId);
    }
    
    /**
     * Print all persons that have at least 1 dvd rented
     */
    public void printPersonsWithDvds()
    {
        loan.printPersonsWithDvds();
    }
    
    /**
     * Extend the period of rented
     */
    public void extendPeriod(int personId,int serialNumber,int addDays)
    {
        loan.extendPeriod(personId,serialNumber,addDays);
    }
    
    /**
     * Print the loanen period
     */
    public int getPeriod(int personId,int serialNumber)
    {
        return loan.getPeriod(personId,serialNumber);
    }
    
    
        
}
