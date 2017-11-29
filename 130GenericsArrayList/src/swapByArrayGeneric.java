/*
 *
 * Shows that you can not implement a generic array swap.
 *
 */
public class swapByArrayGeneric<T>  {

    public swapByArrayGeneric() {
    }
    // not allowed
    //public static T[] swap(T[] a){
    public T[] swap(T[] a){
    	// not allowed
    	T [] arr = new T[2];
    	arr[0] = a[0];
    	arr[1] = a[1];
    	int temp = a[0];
    	arr[0] = a[1];
    	arr[1] = temp;
    	System.out.println("Leaving swap a[0] "+a[0]+" a[1] "+a[1]);
    	return arr;
    }


}