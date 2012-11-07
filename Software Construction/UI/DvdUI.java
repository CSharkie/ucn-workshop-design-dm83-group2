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
                case 1:{
                String i="";
                while(i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    createDVD();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Create a new DVD" );
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
                        System.out.println(" (Enter) Print another dvd");
                        String var = keyboard.nextLine();
                            i=var;
                    }
                }
                case 8: {
                MainMenu.mainMenuStart();
                exit = true;
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
    
    private static void createDVD()
    {
        int id = inputDvdID();
        String title = inputTitle();
        String artist = inputArtist();
        String publicationDate = inputPublicationDate();
        dvdControler.createDVD(id,title,artist, publicationDate);
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
    
    public static void printDvdDetails()
    {
        Scanner keyboard = new Scanner(System.in);
       
        int id = inputDvdID();
        dvdControler.printDvd(id);
    }
        
}
