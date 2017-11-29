/**
 * @(#)LinkedListDemo.java
 *
 * This file will allow you to make a linked list and then clone it
 * You are allowed to make a deep clone (correct) or a shalow clone (incorrect)
 * The program shows the addresses of the head nodes for each list.  
 * When a shallow clone is chosen, both lists have the same head node.
 * When a deep clone is chosen, the lists have different head node addresses.
 *
 * Afer you make the first list, exit and a clone option will be displayed.
 * If you chose clone, you can modify the cloned list.
 * It is interesting to put mmm in the first list then shallow cone.
 * If you add aaa, zzz to the shallow clone you will see an error.
 * This error does not occur with the deep clone.
 *
 * @author Kenneth L Moore
 * @version 1.00 2010/3/2
 */
import java.util.Scanner;

public class LinkedListDemo {
          
    public static void main(String[] args) {
         MyLinkedList ll = new MyLinkedList(); 
         MyLinkedList llClone = new MyLinkedList(); 
         Scanner console = new Scanner(System.in); 
         String str = null;
         
         int menu = 0;
         do{
         	menu = doMenu();
	        switch (menu) {
	        	case 0:  break;
	            case 1:  System.out.println("Enter String"); str = console.nextLine(); ll.add(str); break;
	            case 2:  System.out.println(ll);break;
	            default: System.out.println("Invalid choice");break;
	        }
         	
         }while(menu != 0);
         
         // Test good clone vs bad clone
         System.out.println("Clone? 1 = Yes, 0 = No\n");
         menu = console.nextInt();
         if(menu==1){
           	 llClone = (MyLinkedList)ll.clone();
           	 System.out.println("You are now working with a clone");
	         System.out.println("address of the original head node " +ll.getHead());
	         System.out.println("address of the cloned head node " + llClone.getHead());           	 
	         System.out.println("Original == Cloned is " + ll.equals(llClone));		         	
	         do{
	         	menu = doMenu();
		        switch (menu) {
		        	case 0:  break;
		            case 1:  System.out.println("Enter String"); 
		            	     do{
		            	     	str = console.nextLine();
		            	     }while(str.equals("\n") || str.equals(""));
		            	     llClone.add(str); 
		            	     break;
		            case 2:  System.out.println(llClone);break;
		            default: System.out.println("Invalid choice");break;
		        }
	         	
		     }while(menu != 0);
	         System.out.println("Original List\n" + ll);
	         System.out.println("Cloned List\n" + llClone);
	         System.out.println("Original == Cloned is " + ll.equals(llClone));	                  	
         }

         
         
    }
    
    // reduce clutter in main
    public static int doMenu(){
    	Scanner console = new Scanner(System.in); 
    	int choice = 0;
    	System.out.println(" Linked List Menu: \n");
    	System.out.println(" 0: Exit");
    	System.out.println(" 1: Add");
    	System.out.println(" 2: Show");
    	choice = console.nextInt();
    	return choice;
    }
}
