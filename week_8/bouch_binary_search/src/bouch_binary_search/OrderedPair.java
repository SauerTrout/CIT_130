/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
package bouch_binary_search;

public class OrderedPair<T> implements Comparable
{
    private int firstProp;
    private int secondProp;
    
    public OrderedPair()
    {
        
    }
    
    public OrderedPair(int numOne, int numTwo)
    {
        firstProp = numOne;
        secondProp = numTwo;
    }
    
    public int GetFirst()
    {
        return firstProp;
    }
    
    public int GetSecond()
    {
        return secondProp;
    }
    
    public int compareTo(Object obj)
    {
        OrderedPair op = (OrderedPair)obj;
        return (this.firstProp - op.firstProp);
    }
       
    public void WriteCompares(Object obj)
    {
        OrderedPair op = (OrderedPair)obj;
        System.out.println("This: " + this.firstProp + "  obj: " +  op.firstProp);
    }
    
    

    
}
