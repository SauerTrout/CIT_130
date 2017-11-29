/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
//package bouch_binary_search_2;

public class SearchMethods<T,S>
{
    public <T extends Comparable, S extends Comparable> void BinarySearch(T[] inputArray, T searchValue)
    {
        boolean found = false;
        for(int i = 0; i < inputArray.length; i++)
        {
            T search = inputArray[i];
            if(searchValue.compareTo(search) == 0)
            {
                System.out.println(searchValue.toString() + " is at index " + i);
                found = true;
            }
        }
        if(found == false)
        {
            System.out.println(searchValue + " was not found");
        }
    }    
}
