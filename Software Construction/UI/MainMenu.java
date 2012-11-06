package UI;
import Controller.*;
import java.util.Scanner;
/**
 * Write a description of class MainMenu here.
 * 
 * @author (Ricki Jensen) 
 * @version (2010.10.30)
 */
public class MainMenu
{
   
   private DVDControler DVDControler;
   
   public MainMenu()
   {
       System.out.println("Singelton Opgave");
       dvdControler =  new DVDControler();
       mainMenuStart();
   }
    public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choise = writeMainMenu();
            if(choise == 1)
            {
                startOpretCD();
            }
            else{
                 if(choise == 2){ 
                        startFindCD();
                 }
                 else{
                     if(choise == 3){
                      writeToFile();
                      continue;
                     }//end if
                     else {
                        if (choise == 4) {
                            readFromFile();
                            continue;
                        }
                        else {
                          writeEnd();
                          exit = true;
                        }
                      }
                 }
              }
          }// end else
       }//end else
    
   private int writeMainMenu()
    {       
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** MainMenu ***");
            System.out.println(" (1)Address Book");
            System.out.println(" (2)DVDs");
            System.out.println(" (3)Loan");
            System.out.println(" (4)Close");
            System.out.print("\n Make your choise: ");
            
            int choise = keyboard.nextInt();
            
            return choise;
    }
    
    private void startOpretCD()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Indtast titel ");
       String indTitel = keyboard.nextLine();
       System.out.println("Indtast nr ");
       int indNr = keyboard.nextInt();
       cdSamlingCtr.opretCD(indNr,indTitel);       
    }

    private void startFindCD()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Indtast titel ");
       String indTitel = keyboard.nextLine();
       cdSamlingCtr.printCD(indTitel);
       pause();
    }
    
    private void writeToFile() 
    {
        cdSamlingCtr.writeToFile();
    }
    
    private void readFromFile() 
    {
        cdSamlingCtr.readFromFile();
    }
    
    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }
    private void pause()
    {
       Scanner keyboard = new Scanner(System.in);
       String vent = keyboard.nextLine();
    }
    
 }
