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
    
    /**
     * Constructor for objects of class AddressBook
     */
    public AddressBook()
    {
        addressBook = new ArrayList<Person>();
    }
    
    public void addPerson(Person newPerson)
    {
        addressBook.add(newPerson);
    }
    
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
    
    public boolean checkId(int id)
    {
     
        for(Person person: addressBook)
        {
            if(person.getId() == id)
            return false;
        }
        
        return true;
    }
    
    public void removePerson(int id)
    {
        Person person = getPerson(id);
        addressBook.remove(person);
    }
    
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
    
    public void print()
    {
        for(Person person : addressBook)
        {
            person.print();
            System.out.println(" ");
        }
    }
    
    public void list(int id)
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
