/*
Damian Bouch
CIT 130, Section Z02B
Week 9 Generics
Due: November 18, 2017
 */
package bouch_week_9;

import java.util.ArrayList;
public class Bouch_week_9 
{
    public static void main(String[] args) 
    {        
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        
        listInteger.add(2);
        listInteger.add(13);
        listInteger.add(8);
        listInteger.add(21);
        listInteger.add(7);
        
        double intResult = TestMathClass.FindStdDev(listInteger);

        System.out.println("Standard Devation is: " + intResult);
        
        ArrayList<Double> list = new ArrayList<Double>();
        
        list.add(8.4);
        list.add(12.0);
        list.add(5.0);
        list.add(13.4);
        list.add(1.0);
        
        double dblResult = TestMathClass.FindStdDev(list);
        
        System.out.println("Standard Deviation is: " + dblResult);
        
        System.out.println("Finished");
    }
    
}
