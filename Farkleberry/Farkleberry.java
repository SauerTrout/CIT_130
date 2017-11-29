/**
 * @(#)Farkleberry.java
 *
 * Simulate a Farkleberry tree
 * Farkleberries grow in groups of 17 (I made that up)
 *
 * @author Kenneth L Moore
 * @version 1.00 2008/9/18
 */


public class Farkleberry {
	
	// private state variable.
    private int numBerries;
    
    // default constructor
    public Farkleberry() {
    	numBerries = 25672;
    }
    
    // arbitrary mutator
    public void add17(){
       setBerries(getBerries() + 17);
    }
    
    // mutator
    public void setBerries(int newBerries){
    	numBerries = newBerries;
    }
    
    // accessor
    public int getBerries(){
    	return numBerries;
    }
    
    // polymorph the toString? to be continued...
    public String toString(){
    	return "the current number of Farkleberries is " + numBerries;
    }
    
    // see your text for an explaination
    public boolean equals(Farkleberry f){ // fb1.equals(fb2)
   	  return this.getBerries() == f.getBerries(); // fb1.numBerries == fb2.numBerries
    }   
}