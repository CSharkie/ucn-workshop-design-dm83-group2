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
    
    public static void start()
    {
        updateMenu();
    }
    
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
                    
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) .");
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
                    
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) .");
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
                    
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) .");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            case 4: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) .");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            case 5: {
                String i = "";
                while(!i.equals("1"))
                {
                    Scanner keyboard = new Scanner(System.in);
                    
                    System.out.println();
                    System.out.println(" (1) Return");
                    System.out.println(" (Enter) .");
                    String var = keyboard.nextLine();
                          i=var;
                }
                new DvdUpdateUI();
                break;
            }
            default: {
                System.out.println(" Invalid selection, please try again! ");
                break;
            }
        }
    }
    }
    
    private static int writeUpdateMenu()
    {
        Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** UpdateMenu ***");
            System.out.println(" (1) ");
            System.out.println(" (2) ");
            System.out.println(" (3) ");
            System.out.println(" (4) ");
            System.out.println(" (5) ");
            System.out.print("\n Make your choise: ");
            int choise = keyboard.nextInt();
            return choise;
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
    
}
