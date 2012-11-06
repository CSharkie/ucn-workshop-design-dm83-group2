package Model;
import java.util.ArrayList;

/**
 * Write a description of class AddressBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddressBook
{
    private ArrayList<Person> addressBook;
    private Person person;
    private static AddressBook instance;
    
    /**
     * Constructor for objects of class AddressBook
     */
    public AddressBook()
    {
        addressBook = new ArrayList<Person>();
    }
    
    /**
     * Singleton
     */
    public static AddressBook getInstance()
    {
        if(instance == null)
        {
            instance = new AddressBook();
        }
        return instance;
    }
    
    /**
     * Adds a person created with the Person Class to the AddressBook
     */
    public void addPerson(Person newPerson)
    {
        addressBook.add(newPerson);
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
     * Remove a person by id.
     */
    public void removePerson(int id)
    {
        Person person = getPerson(id);
        addressBook.remove(person);
    }
    
    /**
     * Updates a person name by the search id
     */
    public void updatePersonName(int searchId, String name)
    {
        Person person = getPerson(searchId);
        person.setName(name);
    }
    
    /**
     * Updates a person address by the search id
     */
    public void updatePersonAddress(int searchId, String address)
    {
        Person person = getPerson(searchId);
        person.setAddress(address);
    }
    
    /**
     * Updates a person postal code by the search id
     */
    public void updatePersonPostalCode(int searchId, int postalCode)
    {
        Person person = getPerson(searchId);
        person.setPostalCode(postalCode);
    }
    
    /**
     * Updates a person city by the search id
     */
    public void updatePersonCity(int searchId, String city)
    {
        Person person = getPerson(searchId);
        person.setCity(city);
    }
    
    /**
     * Updates a person phone by teh search id
     */
    public void updatePersonPhone(int searchId, String phone)
    {
        Person person = getPerson(searchId);
        person.setPhone(phone);
    }
    
    /**
     * Find a person by the id.
     */
    public Person getPerson(int id)
    {
        int index = 0;
        boolean found = false;
        int index2 = 0;
        
        while (!found && index < addressBook.size())
        {
            Person person = addressBook.get(index);
            if(person.getId() == id)
            {
                found = true;
                index2 = index;
            }
            index++;
        }
        if(found == true)
        {
            return addressBook.get(index2);
        }
        else
        {
            return null;
        }
    }
    
    /**
     * List the entire address book with all the details.
     */
    public void list()
    {
        for(Person person : addressBook)
        {
            person.print();
            System.out.println(" ");
        }
    }
    
    /**
     * Prints the details of a person by the id.
     */
    public void print(int id)
    {
        for(Person person : addressBook)
        {
            if(person.getId() == id)
            {
                person.print();
            }
        }
    }

    
}
