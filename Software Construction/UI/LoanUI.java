package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class LoanUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoanUI
{
    private static LoanControler loanControler;

    /**
     * Constructor for objects of class LoanUI
     */
    public LoanUI()
    {
        loanControler = new LoanControler();
    }
    
    /**
     * Method to start the Loan Menu
     */
    public static void start()
    {
        loanMenu();
    }
    
    /**
     * Method for the options in the menu list
     */
    public static void loanMenu()
    {
        boolean exit = false;
        while(!exit)
        {
            int choise = writeLoanMenu();
            switch(choise) {
                case 1: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        createPerson();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Create a new person.." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 2: {
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
                    new LoanUI();
                    break;
                }
                case 3: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        createCopy();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Create another copy." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 4: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        makeLoan();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Create a new Loan." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 5: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        expandPeriod();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Expand another Loan." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 6: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        returnCopy();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Return another Loan." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 7: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        printLoanenDvd();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Print details about another Loan." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 8: {
                    String i="";
                    while(!i.equals("1"))
                    {
                        Scanner keyboard = new Scanner(System.in);
                        printAll();
                        System.out.println();
                        System.out.println(" (1) Return");
                        System.out.println(" (Enter) Print again the list of Persons that have Loans." );
                        String var = keyboard.nextLine();
                        i=var;
                    }
                    new LoanUI();
                    break;
                }
                case 9: {
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
     * Method to print the Loan menu options
     */
    public static int writeLoanMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n\n\f *** Loan Menu ***");
        System.out.println(" (1) Create Person");
        System.out.println(" (2) Create DVD");
        System.out.println(" (3) Create Copy of a DVD");
        System.out.println(" (4) Create Loan");
        System.out.println(" (5) Expand Loan");
        System.out.println(" (6) Return Copy");
        System.out.println(" (7) Print Loan");
        System.out.println(" (8) Print the list of Loans");
        System.out.println(" (9) Return");
        System.out.print("\n \n Make your choice: ");
        int choise = keyboard.nextInt();
        return choise;
    }
    
    /**
     * Method for the persons id
     */
    public static int inputPersonsID()
    {   
        boolean ok = false;
        int id = 0;
        while(!ok)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println(" Write Person Id:  ");
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
     * Method for the persons name
     */
    public static String inputName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Name:  ");
        String name = keyboard.nextLine();
        return name;
    }

    /**
     * Method for the persons postal code
     */
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

    /**
     * Method for the persons city
     */
    public static String inputCity()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write City:  ");
        String city = keyboard.nextLine();
        return city;
    } 

    /**
     * Method for the persons phone number
     */
    public static String inputPhone()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();  
        System.out.println(" Write Phone Number:  ");
        String phone = keyboard.nextLine();
        return phone;
    } 

    /**
     * Method for the persons address
     */
    public static String inputAddress()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Address: ");
        String address = keyboard.nextLine();
        return address;
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
            System.out.println(" Write the Period for loan in days:  ");
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
     * Method to create a new person
     */
    private static void createPerson()
    {
        int id = inputPersonsID();
        String name = inputName();
        String address = inputAddress();
        int postalCode = inputPostalCode();
        String city = inputCity();
        String phone = inputPhone();
        loanControler.createPerson(id, name, address, postalCode, city, phone);
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
        loanControler.createDVD(id, title, artist, publicationDate);
    }
    
    /**
     * Method to create a new copy
     */
    private static void createCopy()
    {
        int id = inputDvdID();
        int serialNumber = inputSerialNumber();
        int period = inputPeriod();
        String purchaseDate = inputPurchaseDate();
        double purchasePrice = inputPurchasePrice();
        loanControler.createCopy(id, serialNumber, purchaseDate, purchasePrice, period);
    }
    
    /**
     * Method to create a new loan
     */
    private static void makeLoan()
    {
        int personId = inputPersonsID();
        int dvdId = inputDvdID();
        int serialNumber = inputSerialNumber();
        loanControler.makeLoan(personId, dvdId, serialNumber);
    }
    
    /**
     * Method for returning a loaned copy
     */
    private static void returnCopy()
    {
        int personId = inputPersonsID();
        int dvdId = inputDvdID();
        int serialNumber = inputSerialNumber();
        String purchaseDate = inputPurchaseDate();
        loanControler.returnCopy(personId, dvdId, serialNumber, purchaseDate);
    }
    
    /**
     * Method for extending the loan period
     */
    private static void expandPeriod()
    {
        int personId = inputPersonsID();
        int serialNumber = inputSerialNumber();
        int period = inputPeriod();
        loanControler.extendPeriod(personId, serialNumber, period);
    }
    
    /**
     * Method for printing a loan with the id of a person
     */
    private static void printLoanenDvd()
    {
        int personId = inputPersonsID();
        loanControler.printLoanenDvd(personId);
    }
    
    /**
     * Method to print the list with all persons that have loaned dvd's
     */
    private static void printAll()
    {
        loanControler.printPersonsWithDvds();
    }
    
}
