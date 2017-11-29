/*
Damian Bouch
CIT 130, Section Z02B
Week 9 Generics
Due: November 18, 2017
 */
package bouch_week_9;

import java.util.ArrayList;
import java.lang.Number;
public class MyMathClass<T extends Number>
{
    public static double FindStdDev(ArrayList inputArray)
    {
        double lengthOfArray = inputArray.size();
        double sumForMean = 0;
        double mean = 0;  
        double sigmaTotal = 0;
        double finalDivisor = lengthOfArray - 1;
        double stdDeviation = 0;
        
        double[] arrayForUse = new double[inputArray.size()];
        for(int count = 0; count < inputArray.size(); count++)
        {
            arrayForUse[count] = (double)inputArray.get(count);
        }
        
        for(double element: arrayForUse)        
        {
            sumForMean += element;
            System.out.println(Double.toString(element) + " added");
        }
        
        mean = sumForMean/lengthOfArray;
        System.out.println("Mean is: " + Double.toString(mean));
        
        for(double element: arrayForUse)
        {            
            sigmaTotal += (Math.pow((element - mean),2));
        }
        
        stdDeviation = Math.sqrt(sigmaTotal/finalDivisor);      
        
        return stdDeviation;
    }
    
}
