package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class PersonUpdateUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonUpdateUI
{
    private PersonControler personController;

    /**
     * Constructor for objects of class PersonUpdateUI
     */
    public PersonUpdateUI()
    {
        personController = new PersonControler();
    }
    
    public void start()
    {
        updateMenu();
    }

    public void updateMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int choise = writeUpdateMenu();
        switch(choise) {
            case 1: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    updatePersonName();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Update another persons name.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new PersonUpdateUI();
                break;
            }
            case 2: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    updatePersonAddress();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Update another persons address.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new PersonUpdateUI();
                break;
            }
            case 3: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    updatePersonPostalCode();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Update another persons postal code.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new PersonUpdateUI();
                break;
            }
            case 4: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    updatePersonCity();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Update another persons city.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new PersonUpdateUI();
                break;
            }
            case 5: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    updatePersonPhone();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Update another persons phone.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new PersonUpdateUI();
                break;
            }
            case 6: {
                AddressBookUI.start();
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
    
    private int writeUpdateMenu()
    {
        Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Person Update Menu ***");
            System.out.println(" (1) Name");
            System.out.println(" (2) Address");
            System.out.println(" (3) Postal Code");
            System.out.println(" (4) City");
            System.out.println(" (5) Phone");
            System.out.println(" (6) Return");
            System.out.print("\n Make your choise: ");
            int choise = keyboard.nextInt();
            return choise;
    }
    
    public int inputPersonsID()
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

    public String inputName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Name:  ");
        String name = keyboard.nextLine();
        return name;
    }

    public int inputPostalCode()
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

    public String inputCity()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write City:  ");
        String city = keyboard.nextLine();
        return city;
    } 

    public String inputPhone()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Phone Number:  ");
        String phone = keyboard.nextLine();
        return phone;
    } 

    public String  inputAddress()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Address: ");
        String address = keyboard.nextLine();
        return address;
    }
    
    private void updatePersonName()
    {
        int searchId = inputPersonsID();
        String name = inputName();
        personController.updatePersonName(searchId, name);
    }
    
    private void updatePersonAddress()
    {
        int searchId = inputPersonsID();
        String address = inputAddress();
        personController.updatePersonAddress(searchId, address);
    }
    
    private void updatePersonPostalCode()
    {
        int searchId = inputPersonsID();
        int postalCode = inputPostalCode();
        personController.updatePersonPostalCode(searchId, postalCode);
    }
    
    private void updatePersonCity()
    {
        int searchId = inputPersonsID();
        String city = inputCity();
        personController.updatePersonCity(searchId, city);
    }
    
    private void updatePersonPhone()
    {
        int searchId = inputPersonsID();
        String phone = inputPhone();
        personController.updatePersonPhone(searchId, phone);
    }
    
}
