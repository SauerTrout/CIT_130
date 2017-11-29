package bouch_sieveoferastosthenes;
//Name: Damian Bouch
//Class: CIT 130
//Section: Z02B
//Week 3, Assignments 1 and 2
public class Converters 
{
    //These methods will allow easy flow between data types
    public static int ConvertToInteger(double doubleOne)
    {
        return (int)doubleOne;
    }   
    
    public static int ConvertStringToInteger(String stringOne)
    {
        return Integer.parseInt(stringOne);
    }
    
    public static double ConvertToDouble(int integerOne)
    {
        return (double)integerOne;
    }
    
    
}
