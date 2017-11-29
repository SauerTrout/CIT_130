/**
 * @(#)MyBinaryOut.java
 *
 *
 * @author Kenneth Moore
 * @version 1.00 2010/2/8
 */
import java.io.*;

public class MyBinaryOut extends java.lang.Exception {

    private String fname = "";

    public MyBinaryOut() {
    }

    public MyBinaryOut(String f) {
    	super("File Does Not Exist");    	
    	fname = f;
    }
    
    public ObjectOutputStream createBinaryFile() throws MyException{
    	ObjectOutputStream ooo = null;
    	try{
    	   // put ObjectOutputStream pw on this line
    	   // try with true, false and move true out one set of parenthesis	
    	   ooo = new ObjectOutputStream(new FileOutputStream(fname+".bin",false)); 
    	}
    	catch (IOException e){
    		System.out.println(e);
    		throw new MyException("The file could not be created.");
    	}
    	return ooo;
    }
    
    public String getFname(){
    	return fname;
    }
    public void setFname(String f){
    	fname = f;
    }
}