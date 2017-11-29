/**
 * @(#)RunMyMathClass.java
 *
 *
 * @author 
 * @version 1.00 2010/3/18
 */
import java.lang.Double;

public class RunMyMathClass {

    public static void main(String[] args) {
       System.out.println(MyMathClass.<Double>stdDev(3.14159));
       System.out.println(MyMathClass.<Integer>stdDev(3));
    }
}
