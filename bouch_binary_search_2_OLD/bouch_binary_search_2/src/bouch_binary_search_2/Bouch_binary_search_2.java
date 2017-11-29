/*
Binary Search
Author: Damian Bouch
CIT 130 Z02B
Due: November 11, 2017
 */
//package bouch_binary_search_2;

import java.util.ArrayList;

public class Bouch_binary_search_2 {

    public static void main(String[] args) 
    {
        Student studentOne = new Student("James",92);
        Student studentTwo = new Student("Mary",95);
        Student studentThree = new Student("Bobbie",82);
        Student studentFour = new Student("Emily",100);
        Student studentFive = new Student("Joey",88);
        Student studentLeftOut = new Student("Jimbob",75);
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        studentList.add(studentFive);
        
        SearchMethods<ArrayList, Student> searchMethods = new SearchMethods<ArrayList, Student>();
        
        searchMethods.BinarySearch(studentList.toArray(new Student[studentList.size()]), studentOne);  //Should print that it was found at index 0
        searchMethods.BinarySearch(studentList.toArray(new Student[studentList.size()]), studentLeftOut); 
        
        //Starting work on second type
        
        Stocks stockOne = new Stocks("Big Shops, Inc",46.2);
        Stocks stockTwo = new Stocks("Portfolio Builders",100.26);
        Stocks stockThree = new Stocks("Duck Calls R Us",74.5);
        Stocks stockFour = new Stocks("Master Java Generics, Inc",78.45);
        Stocks stockFive = new Stocks("Book Buyers Unlimited",126.2);
        Stocks stockLeftOut = new Stocks("Shrubcutters",89);
        
        ArrayList<Stocks> stockList = new ArrayList<Stocks>();
        stockList.add(stockOne);
        stockList.add(stockTwo);
        stockList.add(stockThree);
        stockList.add(stockFour);
        stockList.add(stockFive);        
        
        SearchMethods<ArrayList, Stocks> stockSearch = new SearchMethods<ArrayList, Stocks>();
        
        stockSearch.BinarySearch(stockList.toArray(new Stocks[stockList.size()]), stockFour);  //Should print that it was found at index 3
        stockSearch.BinarySearch(stockList.toArray(new Stocks[stockList.size()]), stockLeftOut);  //Should print that it was found at index 3        
        System.out.println("Finished");
    }
    
}
