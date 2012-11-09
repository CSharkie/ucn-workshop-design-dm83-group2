package Model;
import java.util.ArrayList;

/**
 *A class for crating Person objects.
 */

public class Person
{
    private int id;
    private String name;
    private String address;
    private int postalCode;
    private String city;
    private String phone;
    private ArrayList<Copy> loanDVDs;
    

    /**
     * Constructor for objects of class Person
     */
    public Person(int id, String name, String address, int postalCode, String city, String phone)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
        loanDVDs = new ArrayList<Copy>();
    }
    
    /**
     * Returns the person's id.
     */
    
    public int getId()
    {
        return id;
    }
    
    /**
     * Returns the name of a person.
     */
    
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the address of a person.
     */
    
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Returns the postal code.
     */
    
    public int getPostalCode()
    {
        return postalCode;
    }
    
    /**
     * Returns information about the city.
     */
    
    public String getCity()
    {
        return city;
    }
    
    /**
     * Returns information about phone number.
     */
    public String getPhone()
    {
        return phone;
    }
    
    /**
     * Sets id of a person.
     */
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Sets name of a person
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets address of a person.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * Sets a postal code.
     */
    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }
    
    /**
     * Sets a new city.
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Sets a phone number.
     */
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    /**
     * Checks number of loans.
     */
    
    public boolean getNumberOfLoans()
    {
        if(loanDVDs.size()>0)
        return true;
        else
        return false;
    }
     
    /**
     * Prints all of the information about a person.
     */
    
     public void print()
    {
        System.out.println("ID:          " + id);
        System.out.println("Name:        " + name);
        System.out.println("Address:     " + address);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("City:        " + city);
        System.out.println("Phone:       " + phone);
    }
    
    /**
     * Print DVD all of the dvds that are lent.
     */
    
    public void printLoanDvds()
    {
        if(loanDVDs.size()>0)
        {
        for(Copy copy: loanDVDs)
        {
            copy.print();
        }
    }
    else
        System.out.println("No dvds have been loan");
    }
    
    /**
     * Creates a loan. Moves the copies inside the Array List of Person.
     */
       public void createLoanenDvd(int serialNumber, String purchaseDate,double purchasePrice,int period)
    {
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice,true,period);
        addLoanDvd(copy);
    }
    
    /**
     * Prints the dvds that are lent.
     */
    
    public void printLoanenDvd()
    {
        for(Copy copy: loanDVDs)
        {
                copy.print();
        }
    }
    
    /**
     * Extends the loan period.
     */
    
    public void extendPeriod(int serialNumber,int addDays)
    {
        for(Copy copy: loanDVDs)
        {
                if(copy.getSerialNumber()==serialNumber)
                {
                    copy.extendPeriod(addDays);
                }
        }
    }
    
    /**
     * Returns the period of the loan.
     */
    public int getPeriod(int serialNumber)
    {
        
       for(Copy copy: loanDVDs)
        {
                if(copy.getSerialNumber()==serialNumber)
                {
                     return copy.getPeriod();
                }
            }
            return 0;
     }
     
     /**
      * Adds a new loan.
      */
        
    public void addLoanDvd(Copy newLoan)
    {
        loanDVDs.add(newLoan);
    }
    
    /**
     * Checks if the copy is available.
     */
    public boolean checkLoanenCopy(int serialNumber,String purchaseDate)
    {
        boolean x = false;
        for(Copy copy: loanDVDs)
        {
            if(copy.getSerialNumber()==serialNumber && copy.getPurchaseDate().equals(purchaseDate))
            x= true;
        }
        return x;
    }
    
    /**
     * Removes a copy.
     */
    
    public void removeCopy(int serialNumber,String purchaseDate)
    {
        boolean exist = false;
        Copy copy2 = new Copy();
        for(Copy copy : loanDVDs)
        {
            if(copy.getSerialNumber()==serialNumber && copy.getPurchaseDate().equals(purchaseDate))
           { exist = true;
            copy2 = copy;
           }
        }
        
        if(exist = true)
        {
            removeCopy(copy2);
        }
    
    }
        
    public void removeCopy(Copy copy)
    {
        loanDVDs.remove(copy);
    }
   
    /**
     * Checks if the person has at leat one copy rented.
     */
    public boolean numberOfPersonDvds()
    {
        if(loanDVDs.size()>0)
        return true;
        else
        return false;
    }
            
    
}
