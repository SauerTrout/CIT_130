/**
 * @author Kenneth Moore
 * @version 1.00 2010/3/4
 */
import java.util.*;
import java.util.Collections;

public class c14 {
        
    public static void main(String[] args) {
    	ArrayList<String>greek = new ArrayList<String>(10);
    	greek.add("nu");
    	greek.add("ksi");
    	greek.add("omicron");
    	greek.add("pi");
    	greek.add("rho");
    	greek.add("sigma");
    	greek.add("tau");
    	greek.add("upsilon");
    	greek.add("psi");
    	greek.add("phi");
    	greek.add("chi");
    	greek.add("omega");
    	greek.add("mu");
    	greek.add("lambda");
    	greek.add("kappa");
    	greek.add("iota");
    	greek.add("theta");
    	greek.add("eta");
    	greek.add("zeta");
    	greek.add("alpha");
    	greek.add("kappa");
    	greek.add("beta");
    	greek.add("delta");
    	greek.add("gamma");
    	
    	System.out.println("Greek Letters Size = " + greek.size());
    	for(String g: greek)
    		System.out.println(g);
    		
    	System.out.println("\nSorted ");
    	Collections.sort(greek);
    	for(String g: greek)
    		System.out.println(g);
    		
    	greek.remove("zeta");
    	greek.remove("alpha");
    	greek.remove("kappa");
    	greek.remove("beta");
    	greek.remove("delta");
    	greek.remove("gamma");
    	System.out.println("\nAfter removal size = " + greek.size());
    	Collections.sort(greek);
    	System.out.println(greek);
    		
    		
    	System.out.println("\nSorted with MyStringComparable overriding default method");
    	Collections.sort(greek, new MyStringComparable());
    	System.out.println(greek);
    		
        Vector<String> gods = new Vector(5);
        gods.add("Thor");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Athena");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Zeus");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Styx");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Helios");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Leto");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Atlas");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        gods.add("Eurybia");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());        
        gods.add("Ophion");System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());        
        gods.add("Pallas"); System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());       
        gods.add("Prometheus"); System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());       
        gods.add("Selene"); System.out.println("After adding an element, Greek Gods size = " + gods.size() + " capacity " + gods.capacity());              
        	
        System.out.println("\nGreek Gods size = " + gods.size() + " capacity " + gods.capacity());
    	for(String d: gods)
    		System.out.println(d);
    		
    	Object [] array = gods.toArray();
    	
    	Arrays.sort(array);
        System.out.println("\nAfter array sort Greek Gods size = " + gods.size() + " capacity " + gods.capacity());
        for(String d: gods)
    		System.out.println(d);
        System.out.println("\nAfter array sort Array size = " + gods.size());    
        for(int i= 0; i < array.length; i++)
        	System.out.println((String)array[i]);
    }
}
