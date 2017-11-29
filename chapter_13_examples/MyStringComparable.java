/**
 * @author Kenneth Moore
 * @version 1.00 2010/3/4
 */
import java.util.*;

public class MyStringComparable implements Comparator<String>{  

     public int compare(String s1, String s2) {  

          return -s1.compareTo(s2);// reverse string order
     }  

 } 