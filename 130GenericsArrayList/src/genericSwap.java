
public class genericSwap<T> {

    public genericSwap() {
    }
    public void swap(T a, T b){
    	T temp = a;
    	a = b;
    	b = temp;
    	System.out.println("Leaving swap a "+a+" b "+b);
    }


}