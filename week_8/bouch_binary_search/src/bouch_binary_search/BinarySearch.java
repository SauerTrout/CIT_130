/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
package bouch_binary_search;

public class BinarySearch<T> 
{
    public static <T extends Comparable> int  FindValue(T[] testingArray, int startingIndex, int finishingIndex, T searchValue)
    {
        for(int i = startingIndex; i <= finishingIndex; i++)
        {
            if(searchValue.compareTo(testingArray[i]) == 0)
            {
                System.out.println(searchValue + " is at index " + i);
                return 0;
            }
            else 
            {
                System.out.println(testingArray[i] + " is not in the array.");                
            }
        }    
        return -1;
    }    
}
