package UI;
import java.util.Scanner;
import Controller.*;

/**
 * Write a description of class DvdUpdateUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DvdUpdateUI
{
    private static DVDcontroler dvdControler;

    /**
     * Constructor for objects of class DvdUpdateUI
     */
    public DvdUpdateUI()
    {
        dvdControler = new DVDcontroler();
    }
    
    
    /**
     * Method to start the DvD Update UI
     */
    public static void start()
    {
        updateMenu();
    }
    
    /**
     * Method for the options in the menu list
     */
    public static void updateMenu()
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
                    changeArtist();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Change another Artist name.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            case 2: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    changeTitle();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Change another Title.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            case 3: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    changePublicationDate();
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) Change another Publication Date.");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            case 4: {
                DvdUI.start();
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
     * Method to print the DvD Update menu options
     */
    private static int writeUpdateMenu()
    {
        Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** DVD Update Menu ***");
            System.out.println(" (1) Artist");
            System.out.println(" (2) Title");
            System.out.println(" (3) Publication Date");
            System.out.println(" (4) Return");
            System.out.print("\n Make your choise: ");
            int choise = keyboard.nextInt();
            return choise;
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
     * Method to change the artist
     */
    public static void changeArtist()
    {
        int id = inputDvdID();
        String artist = inputArtist();
        dvdControler.changeArtist(id, artist);
    }
    
    /**
     * Method to change the title
     */
    public static void changeTitle()
    {
        int id = inputDvdID();
        String title = inputTitle();
        dvdControler.changeTitle(id, title);
    }
    
    /**
     * Method to change te publication date
     */
    public static void changePublicationDate()
    {
        int id = inputDvdID();
        String publicationDate = inputPublicationDate();
        dvdControler.changePublicationDate(id, publicationDate);
    }
    
}
