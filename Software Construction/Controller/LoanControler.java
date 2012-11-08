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
    private AddressBook addressBook;
    private DVD dvd;
    private DVDcontainer dvdContainer;
    private Person person;

    /**
     * Constructor for objects of class LoanControler
     */
    public LoanControler()
    {
       
        addressBook = AddressBook.getInstance();
        dvdContainer = DVDcontainer.getInstance();
    }
    
    public void createRentWithId(int searchId, int dvdId, int searchSerialNumber, int id, String date, String period, String status)
    {
        Person person = addressBook.getPerson(searchId);
        Copy rentedCopy = dvdContainer.getDvd(dvdId).getCopy(searchSerialNumber);
        Loan newLoan = new Loan(id, date, period, status, rentedCopy, person);
        loanContainer.addLoan(newLoan);
    }
    
    public void createRentWithName(String searchName, int dvdId, int searchSerialNumber, int id, String date, String period, String status)
    {
        Person person = addressBook.getPersonName(searchName);
        Copy rentedCopy = dvdContainer.getDvd(dvdId).getCopy(searchSerialNumber);
        Loan newLoan = new Loan(id, date, period, status, rentedCopy, person);
        loanContainer.addLoan(newLoan);
    }

    /**
     * returnDvd changes a rent object's status to Returned
     */
    
    public void returnRent(int serialNumber)
    {
        Loan loan2 = loanContainer.findLoan(serialNumber);
        loan2.setStatus("Returned");

    }
    
    /**
     * showLoanInfo prints the info connected to a rent object
     */
    
    public void showLoanInfo(int loanId)
    {
        loanContainer.showLoanInfo(loanId); 
    }
    
}
