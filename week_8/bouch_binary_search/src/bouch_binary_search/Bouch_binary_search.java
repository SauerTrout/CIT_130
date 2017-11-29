/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
package bouch_binary_search;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Bouch_binary_search 
{
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) 
    {        
        OrderedPair op1 = new OrderedPair(12,17);
        OrderedPair op2 = new OrderedPair(17,6);       
        OrderedPair op3 = new OrderedPair(6,8);       
        OrderedPair op4 = new OrderedPair(34,1);       
        OrderedPair op5 = new OrderedPair(59,16);

        ArrayList<OrderedPair> opList = new ArrayList<>();
        opList.add(op1);
        opList.add(op2);
        opList.add(op3);
        opList.add(op4);
        opList.add(op5);
        
        //Please help -- dying of confusion
        int searchResult = BinarySearch<OrderedPair>.FindValue(opList, 0, 4, 17); //Should find this value at index 1
        
        Students studentOne = new Students("James",92);
        Students studentTwo = new Students("Mary",95);
        Students studentThree = new Students("Bobbie",82);
        Students studentFour = new Students("Emily",100);
        Students studentFive = new Students("Joey",88);
        
        ArrayList<Students> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        studentList.add(studentFive);

        //Also dying here
        int studentResult = BinarySearch<Students>.FindValue(studentList, 0, 4, "Emily"); //Should find this value at index 3
              
               
    }    
}
