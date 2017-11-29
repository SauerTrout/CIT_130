/*Damian Bouch
Sept 22, 2017
Assignment one for CIT 130
Counter Class
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CounterClass {
        
    private int counterInt;
    
    //Initialize value
    public CounterClass()
    {
        counterInt = 0;
        System.out.println("Counter initialized at: " + this.counterInt);        
    }
    
    public CounterClass(int input)
    {
        counterInt = input;
        System.out.println("Counter initialized at: " + this.counterInt);
    }
    
    //Getter
    public int GetCounter()
    {
        System.out.println("Counter retrieved: " + this.counterInt);
        return this.counterInt;
    }
    
    //Setter
    public void SetCounter(int inputOne)
    {
        counterInt = inputOne;
        System.out.println("Counter is now: " + this.counterInt);
                
    }
    
    //equals method override
    public boolean equals(CounterClass inputTwo)
    {
        return (this.GetCounter() == inputTwo.GetCounter());
    }
    
    public void WriteEquals()
    {
        System.out.println("********Values are equal");
        System.out.println("");
    }
    
    public void WriteUnequal()
    {
        System.out.println("********Values are not equal");
        System.out.println("");
    }
    
    public void CompareValues(CounterClass inputOne, CounterClass inputTwo)
    {
        if(inputOne.equals(inputTwo))
        {
            System.out.println("Class objects are equal");
        }
        else
        {
            System.out.println("Class objects are not equal");
        }
    }
    
    //CounterClass object to string
    private String ToString(CounterClass inputOne)
    {
        return Integer.toString(inputOne.counterInt);
    }
    
    public void AddToInt(int inputOne)
    {
        int returnValue = (inputOne + 1);
        counterInt = (returnValue);
        System.out.println("Integer changed to " + ToString(this));
    }
    
    public void SubtractFromInt(int inputOne)
    {
        if(inputOne > 0)
        {
            int returnValue = (inputOne - 1);
            counterInt = (returnValue);
            System.out.println("Integer changed to " + ToString(this));
        }
        else
        {
            System.out.println("Cannot count below 0000!");
        }
    }
    
    
    
}

