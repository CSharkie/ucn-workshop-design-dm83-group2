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
    /**
     * instance variables
     */  
    private AddressBook person;

    /**
     * Constructor for objects of class PersonControler
     */
    public PersonControler()
    {
        person = AddressBook.getInstance();
    }
    
    /**
     * Remove a person by its id
     */
    public void removePerson(int id)
    {
        person.removePerson(id);
    }
    
    /**
     * Create a new person
     */
    public void createPerson(int id, String name, String address, int postalCode, String city, String phone)
    {
        person.createPerson(id,name,address,postalCode,city,phone);
    }
    
    /**
     * Change the name of a person
     */
    public void  updatePersonName(int searchId, String name)
    {
        person.updatePersonName(searchId, name);
    }
    
    /**
     * Change the address of a person
     */
    public void updatePersonAddress(int searchId, String address)
    {
        person.updatePersonAddress(searchId, address);
    }   
    
    /**
     * Change the postal code of a person
     */
    public void updatePersonPostalCode(int searchId, int postalCode)
    {
        person.updatePersonPostalCode( searchId, postalCode);
    }
    
    /**
     * Change the city of a person
     */
    public void updatePersonCity(int searchId, String city)
    {
        person.updatePersonCity(searchId, city);
    }
    
    /**
     * Change the phone number of a person
     */
    public void updatePersonPhone(int searchId, String phone)
    {
        person.updatePersonPhone(searchId, phone);
    }
    
    /**
     * Print person details
     */
    public void print(int searchId)
    {
        person.print(searchId);
    }
    
    /**
     * Print all persons details
     */
    public void printAll()
    {
        person.list();
    }
    
    
    
    
    
    
}
