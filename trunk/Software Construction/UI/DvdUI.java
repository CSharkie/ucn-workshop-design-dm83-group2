package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class DvdUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DvdUI
{
 
    private static DVDcontroler dvdControler;
    private static DvdUpdateUI dvdUpdateUI;

    /**
     * Constructor for objects of class DvdUI
     */
    public DvdUI()
    {
        dvdControler = new DVDcontroler();
    }
    
    /**
     * Method to start he DvD UI
     */
    public static void start()
    {
        dvdMenu();
    }
    
    /**
     * Method for the options in the menu list
     */
    public static void dvdMenu()
    {
        boolean exit= false;
        while(!exit)
        {
            int choise = writeDvdMenu();
            switch(choise) {
                case 1: {
                    String i="";
                    while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    createDVD();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Create a new DVD." );
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUI();
                break;
            }
                case 2: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        printDvdDetails();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Print another dvd.");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                    new DvdUI();
                    break;
                }
                case 3: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        printAllDvd();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Print the list again.");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                    new DvdUI();
                    break;
                }
                case 4: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        createCopy();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Create another copy.");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                    new DvdUI();
                    break;
                }
                case 5: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        checkCopy();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Check again for copies.");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                    new DvdUI();
                    break;
                }
                case 6: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        removeDvd();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Remove another DvD.");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                    new DvdUI();
                    break;
                }
                case 7:
                {
                    startDvdUpdate();
                    exit = true;
                    break;
                }
                case 8: {
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
    
    /**
     * Method to print the DvD menu options
     */
        public static int writeDvdMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n\n\f *** DVD Menu ***");
        System.out.println(" (1) Create a DVD");
        System.out.println(" (2) Print DVD details");
        System.out.println(" (3) Print all DVDs");
        System.out.println(" (4) Add a copy");
        System.out.println(" (5) Check for copies");
        System.out.println(" (6) Remove DVD");
        System.out.println(" (7) Modify DVD");
        System.out.println(" (8) Return");
        System.out.print("\n \n Make your choice: ");
        int choise = keyboard.nextInt();
        return choise;
    }
    
    /**
     * Method to start the DvD Update UI
     */
    private static void startDvdUpdate()
    {
        dvdUpdateUI = new DvdUpdateUI();
        dvdUpdateUI.start();
    }
    
    /**
     * Method for the dvd id
     */
    public static int inputDvdID()
    {   
        boolean ok = false;
        int id = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write DvD Id:  ");
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
    
    /**
     * Method for the id of a copy
     */
    public static int inputCopyID()
    {   
        boolean ok = false;
        int copyId = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Copy Id:  ");
            try{
                copyId = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return copyId;
    }
    
    /**
     * Method for the copy serial number
     */
    public static int inputSerialNumber()
    {   
        boolean ok = false;
        int serialNumber = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Serial Number:  ");
            try{
                serialNumber = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return serialNumber;
    }
    
    /**
     * Method for the copy purchase date
     */
    public static String inputPurchaseDate()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Purchase Date: ");
        String purchaseDate = keyboard.nextLine();
        return purchaseDate;
    }
    
    /**
     * Method for the purchase price
     */
    public static double inputPurchasePrice()
    {   
        boolean ok = false;
        double purchasePrice = 0.0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Purchase Price:  ");
            try{
                purchasePrice = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return purchasePrice;
    }
    
    /**
     * Method for the loan period
     */
    public static int inputPeriod()
    {   
        boolean ok = false;
        int period = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write the Period for loan:  ");
            try{
                period = keyboard.nextInt();
                ok = true;
            }
            catch (Exception e)
            {
                System.out.println("You need to type in a number - try again!");
                String input = keyboard.nextLine();
            }
        }
        return period;
    }
    
    /**
     * Method for the dvd title
     */
        public static String inputTitle()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Title: ");
        String title = keyboard.nextLine();
        return title;
    }
    
    /**
     * Method for the dvd artist
     */
        public static String inputArtist()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Artist: ");
        String artist = keyboard.nextLine();
        return artist;
    }
    
    /**
     * Method for the dvd publication date
     */
    public static String inputPublicationDate()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Publication Date: ");
        String publicationDate = keyboard.nextLine();
        return publicationDate;
    }
    
    /**
     * Method to create a new dvd
     */
    private static void createDVD()
    {
        int id = inputDvdID();
        String title = inputTitle();
        String artist = inputArtist();
        String publicationDate = inputPublicationDate();
        dvdControler.createDVD(id, title, artist, publicationDate);
    }
    
    /**
     * Method to print a dvd details by the id
     */
    public static void printDvdDetails()
    {
        int id = inputDvdID();
        dvdControler.printDvd(id);
    }
    
    /**
     * Method to print the list of all the dvd's
     */
    private static void printAllDvd()
    {
        dvdControler.printAllDvd();
    }
    
    /**
     * Method to create a new dvd copy
     */
    private static void createCopy()
    {
        int id = inputDvdID();
        int serialNumber = inputSerialNumber();
        int period = inputPeriod();
        String purchaseDate = inputPurchaseDate();
        double purchasePrice = inputPurchasePrice();
        dvdControler.createCopy(id, serialNumber, purchaseDate, purchasePrice, period);
    }
    
    /**
     * Method to print details about a copy
     */
    private static void printCopy()
    {
        int id  = inputDvdID();
        dvdControler.printAllCopies(id);
    }
    
    /**
     * Method to remove a dvd
     */
    private static void removeDvd()
    {
        int id = inputDvdID();
        dvdControler.removeDVD(id);
    }
    
    /**
     * Method to check for a copy
     */
    private static void checkCopy()
    {
        int id = inputCopyID();
        int serialNumber = inputSerialNumber();
        dvdControler.printCopy(id, serialNumber);
    }
        
}
