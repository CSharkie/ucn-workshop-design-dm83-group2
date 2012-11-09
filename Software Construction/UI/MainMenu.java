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
   private static LoanUI loanUI;
   
    /**
     * Method to start the main UI
     */
    public MainMenu()
    {
        mainMenuStart();
    }
    
    /**
     * Method for the options in the menu list
     */
    public static void mainMenuStart()
    {
        boolean exit=false;
        while (!exit)
        {
            int choise = writeMainMenu();
            switch(choise) {
            case 1:
            {
                startAddressBook();
                exit = true;
                break;
            }
            case 2:
            {
                startDvd();
                exit = true;
                break;
            }
            case 3:
            {
                startLoan();
                exit = true;
                break;
            }
            case 4:
            {
                writeEnd();
                exit = true;
                break;
            }
            default: 
            {
                System.out.println(" Invalid selection, please try again! ");
                break;
            }
        }
    }
    }
    
    /**
     * Method that writes the options of the menu
     */
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
    
    /**
     * Method to start the Address Book UI
     */
    private static void startAddressBook()
    {
        addressUI = new AddressBookUI();
        addressUI.start();
    }
    
    /**
     * Mothod to start the DVD UI
     */
    private static void startDvd()
    {
        dvdUI= new DvdUI();
        dvdUI.start();
    }
    
    /**
     * Method to start the Loan UI
     */
    private static void startLoan()
    {
        loanUI= new LoanUI();
        loanUI.start();
    }
    
    /**
     * Method to write the shutting down message
     */
    private static void writeEnd()
    {
        System.out.println(" The System is shutting down. ");
    }
                            
}
