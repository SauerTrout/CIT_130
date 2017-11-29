/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Java is an object-oriented programming language. An object-oriented language
// View programs as consisting of objects

//Java is an interpreted languate
// True


//Quiz 2:
//To invoke a static method a calling object must be used: False
//Efficiency is lost in importing the entire package instead of just the classes: False:
//Valid arguments to System.out: all of the above
//Class NumberFormat: java.util.Locale
//readLine() does NOT return an integer value
//Strings may not be parsed into characters




public class Homework_Quizzes_1 {

    public static void main(String[] args) {
        String phrase = "Make hay while the sun is shining.";
        char c = phrase.charAt(10);
        System.out.println(c);
        
        
        double price = 2.50;
        double quantity = 5;
        double amountDue = 0;
        amountDue = price * quantity;
        System.out.println(amountDue);
        
        System.out.print("Java");
        System.out.println(" is \n fun");
        
    }
    
}
