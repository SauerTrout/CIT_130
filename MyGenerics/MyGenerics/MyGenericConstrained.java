
package chapter15generics;

public class MyGenericConstrained<T extends Number, U> {
    public void divideAndPrint(T p, U q){
        System.out.println("first part " + p.doubleValue()/2 + " second part " + q);
    }
}
