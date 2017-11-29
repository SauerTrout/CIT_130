/*
Damian Bouch
CIT 130
Week 7
Due: October 28, 2017
 */
//package bouch_week_7;
import java.util.Scanner;
public class TowersOfHanoi 
{    
    private int numberDisks = 1;
    
    Scanner myScanner = new Scanner(System.in);
    
    public void moveDisk(int numberOfDisks, String startingPole, String tempPole, String targetPole)
    {
        if(numberOfDisks == 1)
        { 
            System.out.println(startingPole + " to " + targetPole);
            return;
        }
        else
        {
            moveDisk((numberOfDisks - 1), startingPole, targetPole, tempPole);
            System.out.println(startingPole + " to " + targetPole);
            moveDisk((numberOfDisks -1), tempPole,startingPole,targetPole);
        }
    }
    
    public int GetStarterDisks()
    {
        return numberDisks;
    }
    
    public void SetStarterDisks(int inputOne)
    {
        this.numberDisks = inputOne;
    }
    
    public int FetchStarterDisks()
    {
        int myInput = 1;
        System.out.println("How many disks would you like to start with??");
        myInput = myScanner.nextInt();
        return myInput;
    }
    
}
