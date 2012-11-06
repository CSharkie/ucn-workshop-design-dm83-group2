package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu
{
   private static AddressBookUI addressUI;
   private static DvdUI dvdUI;
   private static RentUI rentUI;
   
    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu()
    {
        mainMenuStart();
    }
    
    public static void mainMenuStart()
    {
        boolean exit=false;
        while (!exit)
        {
            int choise = writeMainMenu();
            if(choise == 1)
            {
                startAddressBook();
            }
            else {
                if(choise == 2) {
                    startDvd();
                }
                else {
                    if(choise == 3) {
                        startRent();
                    } else {
                        writeEnd();
                        exit = true;
                    }
                }
            }
        }
    }
    
    private static int writeMainMenu()
    {       
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1) AddressBook");
            System.out.println(" (2) DVDs");
            System.out.println(" (3) Loan");
            System.out.println(" (4) Close");
            System.out.print("\n Make your choise: ");
            int choise = keyboard.nextInt();
            return choise;
    }
    
    private static void startAddressBook()
    {
        addressUI = new AddressBookUI();
        addressUI.start();
    }

    private static void startDvd()
    {
        //dvdUI= new DvdUI();
        //dvdUI.start();
    }
    
    private static void startRent()
    {
        //rentUI= new RentUI();
        //rentUI.start();
    }
    
    private static void writeEnd()
    {
        System.out.println(" The System is shutting down. ");
    }
                            
}
