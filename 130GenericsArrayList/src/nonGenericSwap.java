// Strictly speaking, for references it's "pass reference by value"
// and for primitives it's just "pass by value"
public class nonGenericSwap {

    public nonGenericSwap() {
    }

    // Here we have a reference passed by value
    public static void swap(Integer a, Integer b){
    	Integer temp = new Integer(a);

    	// assigning a a new integer value only does so locally
    	a = new Integer(b);
    	b = new Integer(temp);

    	// local variable a now points to a new integer but a is only a copy
    	System.out.println("Leaving nonGeneric Integer swap a "+a+" b "+b);
    }


}