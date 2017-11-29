/*
Damian Bouch
CIT 130, Section Z02B
Week 9 Generics
Due: November 18, 2017
 */
package bouch_week_9;

import java.util.ArrayList;
import java.lang.Number;
import java.lang.*;
import java.lang.System.*;
public class TestMathClass<T extends Number>
{
    private static boolean IsInteger(ArrayList testArray)
    {
/*        for(int count = 0; count < testArray.size(); count ++)
        {
            Object num1 = testArray.get(count);
            Integer num2 = (Integer)num1;
            int num3 = (int)num2;
            double num4 = (double)num3;
            double prodTemp = num4 * 10;
            String stringTemp = Double.toString(prodTemp);
            int stringLength = stringTemp.length();
            char lastIndex = stringTemp.charAt(stringLength - 1);
            System.out.println("Last index: " + lastIndex);
            if(lastIndex != '0')
            {
                return false;
            }
        }
  */      return true;
    }
    public static double FindStdDev(ArrayList inputArray)
    {
        double lengthOfArray = inputArray.size();
        double sumForMean = 0;
        double mean = 0;  
        double sigmaTotal = 0;
        double finalDivisor = lengthOfArray - 1;
        double stdDeviation = 0;
        
        double[] arrayForUse = new double[inputArray.size()];
        //System.out.println(inputArray.getClass().getName());
        if(inputArray.getClass().getName() == "Integer")
        {
            for(int count = 0; count < inputArray.size(); count++)
            {
                Object temp = inputArray.get(count);
                Integer temp2 = (Integer)temp;
                double temp3 = temp2.doubleValue();
            }

        }
        
        for(int count = 0; count < inputArray.size(); count++)
        {
        //    Object temp = inputArray.get(count);
        //    Integer temp2 = (Integer)temp;
        //    int temp3 = (int)temp2;
        //    double temp4 = (double)temp3;           
           
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
