/**
 * @(#)Exceptions.java
 *
 * Basic code relateed to exceptions.
 * Also, has some file I/O 
 *
 * @author Kenneth L Moore
 * @version 1.00 2010/2/6
 */

import java.util.Scanner;
import java.io.*;

public class Exceptions {
        
    
    public static void main(String[] args) {
    	Scanner userConsoleInput = new Scanner(System.in);
    	// code that only throws an exception
    	try{
    		throw new Exception("That is exceptional code!");
    		//System.out.println("Do I get here?"); // try putting this code in and see what happens
    	}
    	catch(Exception e){
    		
    		System.out.println(e);
    		
    		// without the preface java.lang.Exception:
    		System.out.println(e.getMessage());
    	}
    	
    	// throws the exception I designed
    	try{
    		throw new MyException("Using MyException");
    	}	
        catch(MyException e){
        	System.out.println(e);
        }
        
        // randomly throws either Exception or myException
        for(int i=0; i< 5; i++){
        	try{
        	
        	   if(Math.random() < 0.5)
        		  throw new Exception("In loop: Exception thrown"); 
        	   else
        		  throw new MyException("In loop: MyException thrown"); 
        	}
        	
        	// note the order of the catch blocks - try reversing them.
        	catch(MyException e){
        	   System.out.println(e);        		
        	}
        	catch(Exception e){
        	   System.out.println(e);        		
        	}
        	finally{
        		System.out.println("Phew, through the try catch");
        	}
        }
        
        // now to try some file stuff.
        boolean dofile = true;
        String yn = "n", fname = "", bt = "b";
        PrintWriter textOut = null;
        ObjectOutputStream binaryOut = null;
        MyTextOut mto = null;
        MyBinaryOut mbo = null;
        do{
        	
        	// try Ken.txt where Ken.txt is already a folder
        	System.out.println("Enter the name of the Text file - do not include the extention.");
        	
        	// user enters file name sans extention which will be added in Text or Binary class
        	fname = userConsoleInput.nextLine();
        	
        	// see if user wants text or binary file and take action
        	System.out.println("Binary or Text (b/t)");
        	bt = userConsoleInput.nextLine();
        	if(bt.equals("b")){
        		System.out.println("You have chosen Binary");
        		mbo = new MyBinaryOut(fname);
        		try{
        		   binaryOut = mbo.createBinaryFile();
        		}
        		catch (MyException e){
        			System.out.println(e);
        		}
        		finally{
        			try{
             			binaryOut.writeInt(new Integer(42));
           			}
           			catch(IOException e){
           				System.out.println(e);
           			}
        		}
        	}
        	else if(bt.equals("t")){
        		System.out.println("You have chosen Text");
        		mto = new MyTextOut(fname);
        		try{
        		   textOut = mto.createTextFile();
        		}
        		catch (MyException e){
        			System.out.println(e);
        		}
        		finally{
        		   Scanner scanFile = null;
        		   System.out.println("Writing to File");
        		   textOut.println("42");
        		   textOut.println("The answer to life, the universe, everything.");
        		   textOut.println("3.14159");
        		   textOut.close(); // remove this line - what happens?
        		   textOut.flush();
        		   try{
            		   scanFile = new Scanner(new FileInputStream(fname+".txt")); // put scanner in front
        		   }
        		   catch(FileNotFoundException e){
        		   }
        		   System.out.println(scanFile.nextLine());
        		   System.out.println(scanFile.nextLine());
        		   System.out.println(scanFile.nextLine());        		   
        		}
        	}
        	else
        		System.out.println("What kind of bizzare choice is " + bt);
        		
        	// see if user wants to continue
        	System.out.println("Would you like to do another file? (y/n)");
        	yn = userConsoleInput.nextLine();
        	if(yn.equals("n"))
        		dofile = false;
        }while(dofile);
    }  
}

