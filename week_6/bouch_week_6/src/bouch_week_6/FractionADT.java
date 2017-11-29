/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bouch_week_6;

//Necessary for getting user input via console
import java.util.Scanner;

public class FractionADT {
    //Setting properties
    private int numeratorOne;
    private int denomOne;
    
    Scanner myScanner = new Scanner(System.in);
    
    //Constructor w/ override option
    public FractionADT()
    {
        numeratorOne = 0;
        denomOne = 0;
    }
    
    public FractionADT(int inputNumerator, int inputDenominator)
    {
        numeratorOne = inputNumerator;
        denomOne = inputDenominator;
    }    
    
    public int FetchNumerator()
    {
        System.out.println("Please enter numerator: ");
        int userInput = myScanner.nextInt();
        return userInput;
    }
    
    public int FetchDenominator()
    {
        System.out.println("Please enter denominator: ");
        int userInput = myScanner.nextInt(); 
        try
        {            
            if(userInput == 0)
            {
                throw new DenominatorIsZeroException("DenominatorIsZeroException: May not provide 0 as denominator");
            }
        }
        catch(DenominatorIsZeroException denomExc)
        {
            String message = denomExc.getMessage();
            System.out.println(message);
            System.exit(0);
        }
        return userInput;
    }
    
    public int GetNumerator()
    {
        return this.numeratorOne;
    }
    
    public int GetDenominator()
    {
        return this.denomOne;
    }
           
    public void SetNumerator(int inputNumerator)
    {
        this.numeratorOne = inputNumerator;
    }
    
    public void SetDenominator(int inputDenom)
    {
        try
        {
            this.denomOne = inputDenom;
            if(this.denomOne == 0)
            {
                throw new DenominatorIsZeroException("DenominatorIsZeroException: may not divide by 0");            
            }
        }
        catch(DenominatorIsZeroException denomExc)
        {
            String message = denomExc.getMessage();
            System.out.println(message);
            FetchDenominator();
        }
    }
    
    public void SetFraction(int inputNumerator, int inputDenominator)
    {
        try
        {
            if(inputDenominator == 0)
            {
                throw new DenominatorIsZeroException("DenominatorIsZeroException: Denom may not be zero");                       
            }
            this.numeratorOne = inputNumerator;            
            this.denomOne = inputDenominator;
            
        }
        catch(DenominatorIsZeroException denomExc)
        {
            String message = denomExc.getMessage();
            System.out.println(message);
            System.exit(0);
        }
    }
    
    //Converting to string
    public String ToString()
    {
        return (Integer.toString(numeratorOne) + "/" + Integer.toString(denomOne));
    }
    
    public static boolean Equals(FractionADT fractionOne,FractionADT fractionTwo)
    {
        //Fetching quotient values for each of the FractionADT objects passed in
        double myNumeratorOne =  (double)fractionOne.numeratorOne;
        double myDenominatorOne = (double)fractionOne.denomOne;
        double myQuotientOne = (myNumeratorOne/myDenominatorOne);
        
        double myNumeratorTwo =  (double)fractionTwo.numeratorOne;
        double myDenominatorTwo = (double)fractionTwo.denomOne;
        double myQuotientTwo = (myNumeratorTwo/myDenominatorTwo);
        
        return (myQuotientOne == myQuotientTwo);
        
    }
    
}
