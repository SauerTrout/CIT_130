/**
 * @(#)GenericsArrayList.java
 *
 * GenericsArrayList application
 *
 * @author
 * @version 1.00 2011/10/17
 */
import java.awt.*;
import java.util.*;
public class GenericsArrayList {


    public static void main(String[] args) {

    	// generate a random array list of user selected size
    	Random r = new Random();
    	Scanner s = new Scanner(System.in);
		ArrayList<myPoint> myPointArrayList = new ArrayList<myPoint>();
		ArrayList myArrayList = new ArrayList();
		System.out.println("enter the size of the array list to be generated");
		int size = s.nextInt();
		for(int i = 0; i < size; i++){
			myPoint p = new myPoint(r.nextInt()%10,r.nextInt()%10);
			myPointArrayList.add(p);
			myArrayList.add(p);
		}

		// show that you can change the object in an array list
		myPoint p = (myPoint)myArrayList.get(0); // try without cast
		p.setXY(42,42);
		System.out.println("myPointArrayList");

		// show the array list using the correct type
		for(myPoint mp : myPointArrayList)
			System.out.println(mp);

		// show the array list using type object.
		System.out.println("myArrayList");
		for(Object ap : myArrayList)
			System.out.println((myPoint)ap);

		// demonstrate a templated swap that does not swap
		genericSwap<Integer> g = new genericSwap<Integer>();
		Integer a = new Integer(2), b = new Integer(3);
		System.out.println("Before swap a "+a+" b "+b);
		g.swap(a,b);
		System.out.println("After swap a "+a+" b "+b);

		// second type demonstrate a templated swap that does not swap
		genericSwap<myPoint> g2 = new genericSwap<myPoint>();
		myPoint d = new myPoint(2,22), q = new myPoint(3,14);
		System.out.println("Before swap d "+d+" q "+q);
		g2.swap(d,q);
		System.out.println("After swap d "+d+" q "+q);

		// non-generics fail to swap also.
		System.out.println("Before nonGenericSwap a "+a+" b "+b);
		nonGenericSwap.swap(a,b);
		System.out.println("After nonGenericSwap a "+a+" b "+b);

		// a way to swap
		int [] x = {33,90};
    	System.out.println("Before swapByArray x[0] "+x[0]+" x[1] "+x[1]);
		swapByArray.swap(x);
    	System.out.println("After swapByArray x[0] "+x[0]+" x[1] "+x[1]);

    }


}
