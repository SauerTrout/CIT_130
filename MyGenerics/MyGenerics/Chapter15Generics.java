
package chapter15generics;

import java.util.*;

public class Chapter15Generics {


    public static void main(String[] args) {
        MyGeneric<Integer> mgo = new MyGeneric<Integer>();
        mgo.print(new Integer(42));
        MyGeneric<String> mgos = new MyGeneric<String>();
        mgos.print("a string");
        MyGenericConstrained<Integer,String> mgco =
                new MyGenericConstrained<Integer,String>();
        mgco.divideAndPrint(new Integer(55), "This is 55/2");
        /* Not allowed because String does not extend Number.
        MyGenericConstrained<String, Integer> mgco2 =
                new MyGenericConstrained<String, Integer>();
        */
        MyGenericConstrained<Double,String> mgco3 =
                new MyGenericConstrained<Double,String>();
        mgco3.divideAndPrint(new Double(20), "This is 20/2");
        // not strongly typed
        ArrayList a = new ArrayList(1000);
        a.add(new Integer(13));
        a.add("some string");
        a.set(0,"test");
        System.out.println(a.get(0));
        a.add(1,"test 2");
        System.out.println("size of a " + a.size());
        System.out.println(a);
        // strongly typed
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(new Integer(13));
        i.add(new Integer(3));
        i.add(new Integer(1));
        //i.add("some string"); // not allowed now.
        
        for(Integer x: i){// for each loop
            System.out.println(" value = " + x);
        }
    }
    
}
