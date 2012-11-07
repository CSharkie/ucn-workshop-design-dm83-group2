package Model;
import java.util.ArrayList;

/**
 * Write a description of class LoanContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoanContainer
{
    private ArrayList<Loan> loanContainer;
    private AddressBook addressBook;
    private static LoanContainer instance;

    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
        loanContainer = new ArrayList<Loan>();
    }

    public static LoanContainer getInstance()
    {
        if(instance == null)
        {
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public void addLoan(Loan newLoan)
    {
        loanContainer.add(newLoan);
    }
    
    public Loan findLoan(int serialNumber)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        while(index < loanContainer.size() && !found)
        {
            Loan loan2 = loanContainer.get(index);
            if(loan2.getRentedCopy().getSerialNumber()==(serialNumber))
            {
                found = true;
                index2 = index;
            } else {
                index++;
            }
        }
        if(found == true)
        {
            return loanContainer.get(index2);
        } else {
            return null;
        }
    }
    
    public Loan findLoanWithId(int loanId)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        while(index < loanContainer.size() && !found)
        {
            Loan loan2 = loanContainer.get(index);
            if(loan2.getId() == loanId)
            {
                found = true;
                index2 = index;
            } else {
                index++;
            }
        }
        if(found == true)
        {
            return loanContainer.get(index2);
        } else {
            return null;
        }
    }
    
    public void showLoanInfo(int loanId)

    {
        Loan loan2 = findLoanWithId(loanId);
        Copy copy2 = loan2.getRentedCopy();
        Person person2 = loan2.getPerson();
        System.out.println("Titel of Dvd: " + copy2.getDvd().getTitle());
        System.out.println("Person name: " + person2.getName());
        System.out.println("Person ID: " + person2.getId());
        System.out.println("Loan ID: " + loan2.getId());
        System.out.println("Date of loan: " + loan2.getDate());
        System.out.println("Period of loan: " + loan2.getPeriod() + " days");
        System.out.println("Loan status: " + loan2.getStatus());
    }
    
}
