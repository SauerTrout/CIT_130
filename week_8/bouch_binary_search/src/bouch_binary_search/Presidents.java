/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
package bouch_binary_search;
import java.util.Date;
public class Presidents
{
    private String presName;
    private int yearsServed;
    
    public Presidents()
    {
        
    }
    
    public Presidents(String nameIn, int yearIn)
    {
        presName = nameIn;
        yearsServed = yearIn;
    }
    
    public String GetPresName()
    {
        return this.presName;
    }
    
    public int GetYears()
    {
        return this.yearsServed;
    }
    
    public int compareTo(Object obj)
    {
        Presidents pres = (Presidents)obj;
        return (this.yearsServed - pres.yearsServed);
    }
   
}
