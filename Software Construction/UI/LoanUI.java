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
    
    public static void start()
    {
        loanMenu();
    }
    
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
    
    public static String inputPurchaseDate()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println(" Write Purchase Date: ");
        String purchaseDate = keyboard.nextLine();
        return purchaseDate;
    }
    
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
    
    private static void createDVD()
    {
        int id = inputDvdID();
        String title = inputTitle();
        String artist = inputArtist();
        String publicationDate = inputPublicationDate();
        loanControler.createDVD(id, title, artist, publicationDate);
    }
    
    private static void createCopy()
    {
        int id = inputDvdID();
        int serialNumber = inputSerialNumber();
        int period = inputPeriod();
        String purchaseDate = inputPurchaseDate();
        double purchasePrice = inputPurchasePrice();
        loanControler.createCopy(id, serialNumber, purchaseDate, purchasePrice, period);
    }
    
    private static void makeLoan()
    {
        int personId = inputPersonsID();
        int dvdId = inputDvdID();
        int serialNumber = inputSerialNumber();
        loanControler.makeLoan(personId, dvdId, serialNumber);
    }
    
    private static void returnCopy()
    {
        int personId = inputPersonsID();
        int dvdId = inputDvdID();
        int serialNumber = inputSerialNumber();
        String purchaseDate = inputPurchaseDate();
        loanControler.returnCopy(personId, dvdId, serialNumber, purchaseDate);
    }
    
    private static void expandPeriod()
    {
        int personId = inputPersonsID();
        int serialNumber = inputSerialNumber();
        int period = inputPeriod();
        loanControler.extendPeriod(personId, serialNumber, period);
    }
    
    private static void printLoanenDvd()
    {
        int personId = inputPersonsID();
        loanControler.printLoanenDvd(personId);
    }
    
    private static void printAll()
    {
        loanControler.printPersonsWithDvds();
    }
    
}
