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
    
    public void removePerson(int id)
    {
        Person p = getPerson(id);
        addressBook.remove(p);
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

    
}
