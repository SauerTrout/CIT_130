/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
package bouch_binary_search;

public class Students implements Comparable
{
    private String studentName;
    private int gradeAverage;
    
    public Students()
    {
        
    }
    
    public Students(String nameIn,int gradeIn)
    {
        studentName = nameIn;
        gradeAverage = gradeIn;
    }
    
    public String GetName()
    {
        return this.studentName;
    }
    
    public int GetGrade()
    {
        return this.gradeAverage;
    }
    
    //Current usage of compareTo in main()
    public int compareTo(Object obj)
    {
        Students s1 = (Students)obj;
        return (this.gradeAverage - s1.gradeAverage);
    }
    
    //What I want to do
    /*public int compareTo(Object obj)
    {
        Students s1 = (Students)obj;
        return (this.studentName - s1.studentName);
    }*/
    
}
