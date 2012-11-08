package Model;
import java.util.ArrayList;
/**
 * Write a description of class Person here.
 * 
 * @author 
 * @version 
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
    
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getPostalCode()
    {
        return postalCode;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
     public void print()
    {
        System.out.println("ID:          " + id);
        System.out.println("Name:        " + name);
        System.out.println("Address:     " + address);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("City:        " + city);
        System.out.println("Phone:       " + phone);
    }
    
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
    
       public void createLoanenDvd(int serialNumber, String purchaseDate,double purchasePrice)
    {
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice,true);
        addLoanDvd(copy);
    }
    
    public void printLoanenDvd(int id)
    {
        for(Copy copy: loanDVDs)
        {
            if(copy.getSerialNumber() == id)
            {
                copy.print();
            }
        }
    }
    
    public void addLoanDvd(Copy newLoan)
    {
        loanDVDs.add(newLoan);
    }
    
    
}
