package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class AddressBookUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddressBookUI
{
    private static PersonUpdateUI personUI;
    private static PersonControler personController;
    
    /**
     * Constructor for objects of class AddressBookUI
     */
    public AddressBookUI()
    {
        personController = new PersonControler();
    }
    
    public static void start()
    {
        addressMenu();
    }
    
    public static void addressMenu()
    {
        boolean exit=false;
        while (!exit)
        {
        int choise = writeAddressBookMenu();
        switch(choise) {
            case 1: {
                String i="";
                while (!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    getPerson();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Search for another person.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new AddressBookUI();
                exit = true;
                break;
            }
            case 2: {
                String i="";
                while (!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    createPerson();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Create a new person.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new AddressBookUI();
                exit = true;
                break;
            }
            case 3: {
                String i="";
                while (!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    removePerson();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Remove another person.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new AddressBookUI();
                exit = true;
                break;
            }
            case 4: {
                startPersonUpdate();
                exit = true;
                break;
            }
            case 5: {
                String i="";
                while (!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    listPersons();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Print the list again.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new AddressBookUI();
                exit = true;
                break;
            }
            case 6: {
                MainMenu.mainMenuStart();
                exit = true;
                break;
            }
            default: {
                System.out.println(" Invalid selection, please try again! ");
                break;
            }
        }
    }
    }
    
    public static int writeAddressBookMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n\n\f *** AddressBook Menu ***");
        System.out.println(" (1) Show information about person");
        System.out.println(" (2) Create person");
        System.out.println(" (3) Remove person");
        System.out.println(" (4) Update person");
        System.out.println(" (5) List all persons");
        System.out.println(" (6) Return");
        System.out.print("\n \n Make your choice: ");
        int choise = keyboard.nextInt();
        return choise;
    }
    
    private static void startPersonUpdate()
    {
        personUI = new PersonUpdateUI();
        personUI.start();
    }
    
    public static int inputPersonsID()
    {   
        boolean ok = false;
        int id = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Id:  ");
            try{
                id = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return id;
    }

    public static String inputName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Name:  ");
        String name = keyboard.nextLine();
        return name;
    }

    public static int inputPostalCode()
    {
        boolean ok = false;
        int postalCode = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Postal Code:  ");
            try{
                postalCode = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return postalCode;
    }

    public static String inputCity()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write City:  ");
        String city = keyboard.nextLine();
        return city;
    } 

    public static String inputPhone()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Phone Number:  ");
        String phone = keyboard.nextLine();
        return phone;
    } 

    public static String inputAddress()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Address: ");
        String address = keyboard.nextLine();
        return address;
    }

    private static void getPerson()
    {
        int searchId = inputPersonsID();
        personController.print(searchId);
    }
    
    private static void createPerson()
    {
        int id = inputPersonsID();
        String name = inputName();
        String address = inputAddress();
        int postalCode = inputPostalCode();
        String city = inputCity();
        String phone = inputPhone();
        personController.createPerson(id, name, address, postalCode, city, phone);
    }

    private static void removePerson()
    {
        int searchId = inputPersonsID();
        personController.removePerson(searchId);
    }
    
    private static void listPersons()
    {
        personController.printAll();
    }
    
}
