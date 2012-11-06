package Controller;
import Model.*;


/**
 * Write a description of class PersonControler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonControler
{
    // instance variables - replace the example below with your own
    private AddressBook person;

    /**
     * Constructor for objects of class PersonControler
     */
    public PersonControler()
    {
        person = AddressBook.getInstance();
    }
    
    public void removePerson(int id)
    {
        person.removePerson(id);
    }
    

    public void createPerson(int id, String name, String address, int postalCode, String city, String phone)
    {
        person.createPerson(id,name,address,postalCode,city,phone);
    }
    
    public void  updatePersonName(int searchId, String name)
    {
        person.updatePersonName(searchId, name);
    }
    
    public void updatePersonAddress(int searchId, String address)
    {
        person.updatePersonAddress(searchId, address);
    }   
    
    public void updatePersonPostalCode(int searchId, int postalCode)
    {
        person.updatePersonPostalCode( searchId, postalCode);
    }
    
    public void updatePersonCity(int searchId, String city)
    {
        person.updatePersonCity(searchId, city);
    }
    
    public void updatePersonPhone(int searchId, String phone)
    {
        person.updatePersonPhone(searchId, phone);
    }
    
    public void print(int id)
    {
        person.print(id);
    }
    
    public void printAll()
    {
        person.list();
    }
    
    
    
    
    
    
}
