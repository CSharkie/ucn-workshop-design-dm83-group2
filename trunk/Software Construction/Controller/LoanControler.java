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
    private Loan loan;
   

    /**
     * Constructor for objects of class LoanControler
     */
    public LoanControler()
    {
       loan = Loan.getInstance();
    }
    
    public void createDVD(int id, String title, String artist, String publicationDate)
    {
        loan.createDVD(id, title, artist, publicationDate);
    }
    
    public void createCopy(int id,int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        loan.createCopy(id,serialNumber,purchaseDate,purchasePrice,period);
    }
    
    public void makeLoan(int personId,int dvdId, int serialNumber)
    {
        loan.makeLoan(personId,dvdId,serialNumber);
    }
    
    public void returnCopy(int personId,int dvdId,int serialNumber,String purchaseDate)
    {
        loan.returnCopy(personId,dvdId,serialNumber,purchaseDate);
    }
    
    public void createPerson(int id, String name, String address, int postalCode, String city, String phone)
    {
        loan.createPerson(id,name,address,postalCode,city,phone);
    }
    
    public void printLoanenDvd(int personId)
    {
        loan.printLoanenDvd(personId);
    }
    
    public void printPersonsWithDvds()
    {
        loan.printPersonsWithDvds();
    }
    
    public void extendPeriod(int personId,int serialNumber,int addDays)
    {
        loan.extendPeriod(personId,serialNumber,addDays);
    }
    
    public int getPeriod(int personId,int serialNumber)
    {
        return loan.getPeriod(personId,serialNumber);
    }
    
    
        
}
