
public class swapByArray  {

    public swapByArray() {
    }
    public static void swap(int[] a){
    	// not allowed
    	int temp = a[0];
    	a[0] = a[1];
    	a[1] = temp;
    	System.out.println("Leaving swap a[0] "+a[0]+" a[1] "+a[1]);
    }


}