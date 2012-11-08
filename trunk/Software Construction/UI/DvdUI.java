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

    public static void start()
    {
        dvdMenu();
    }
    
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
                exit = true;
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
                    exit = true;
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
                    exit = true;
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
                    exit = true;
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
                    exit = true;
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
                    exit = true;
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
    
    private static void startDvdUpdate()
    {
        dvdUpdateUI = new DvdUpdateUI();
        dvdUpdateUI.start();
    }
    
    public static int inputDvdID()
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
    
    public static int inputCopyID()
    {   
        boolean ok = false;
        int copyId = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Id:  ");
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
    
    public static String inputPurchaseDate()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Purchase Date: ");
        String purchaseDate = keyboard.nextLine();
        return purchaseDate;
    }
    
    public static double inputPurhcasePrice()
    {   
        boolean ok = false;
        double purchasePrice = 0.0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Serial Number:  ");
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
    
        public static String inputTitle()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Title: ");
        String title = keyboard.nextLine();
        return title;
    }
    
        public static String inputArtist()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Artist: ");
        String artist = keyboard.nextLine();
        return artist;
    }
    
    public static String inputPublicationDate()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Publication Date: ");
        String publicationDate = keyboard.nextLine();
        return publicationDate;
    }
    
    private static void createDVD()
    {
        int id = inputDvdID();
        String title = inputTitle();
        String artist = inputArtist();
        String publicationDate = inputPublicationDate();
        dvdControler.createDVD(id, title, artist, publicationDate);
    }
    
    public static void printDvdDetails()
    {
        int id = inputDvdID();
        dvdControler.printDvd(id);
    }
    
    private static void printAllDvd()
    {
        dvdControler.printAllDvd();
    }
    
    private static void createCopy()
    {
        int id = inputDvdID();
        int serialNumber = inputSerialNumber();
        String purchaseDate = inputPurchaseDate();
        double purchasePrice = inputPurhcasePrice();
        dvdControler.createCopy(id, serialNumber, purchaseDate, purchasePrice);
    }
    
    private static void removeDvd()
    {
        int id = inputDvdID();
        dvdControler.removeDVD(id);
    }
    
    private static void checkCopy()
    {
        int id = inputCopyID();
        int serialNumber = inputSerialNumber();
        dvdControler.printCopy(id, serialNumber);
    }
        
}