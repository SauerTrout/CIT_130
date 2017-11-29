/*
Damian Bouch
CIT 130
Week 7
Due: October 28, 2017
 */
//package bouch_week_7;
import java.util.Scanner;
public class Bouch_week_7 {

    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("########################################################################");
        System.out.println("Beginning Towers of Hanoi Assignment");
        System.out.println("########################################################################");
        
        TowersOfHanoi towersGameOne = new TowersOfHanoi();
        //towersGameOne.FetchStarterDisks();
        int myDisks = towersGameOne.FetchStarterDisks();
        
        System.out.println("     |           |         |");
        System.out.println("    |||          |         |");
        System.out.println("   |||||         |         |");
        System.out.println("startingPole tempPole targetPole");
        
        towersGameOne.moveDisk(myDisks, "startingPole", "tempPole", "targetPole");   
        
        System.out.println("########################################################################");
        System.out.println("Beginning UML Assignment");
        System.out.println("########################################################################");
        
        System.out.println("What would you like for starting, lowest value??");
        int startInput = myScanner.nextInt();
        System.out.println("What would you like for ending, higher value??");
        int endInput = myScanner.nextInt();
        
        CounterController counterController = new CounterController(startInput, endInput); 
        counterController.Start();
        
    }    
}
