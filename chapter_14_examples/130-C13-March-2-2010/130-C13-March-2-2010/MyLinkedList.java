/*
 *
 *   This linked list only has an add method.  In a fully functioning
 *   linked list you would have a delete, also.
 *   
 *   This implementation shows the use of an interface and an inner class (Node).
 *
 * @author Kenneth L Moore
 * @version 1.00 2010/3/2
 *
 */
import java.util.Scanner;


public class MyLinkedList implements Cloneable{
	
    // inner class to define a node   
    private class Node implements Comparable{
    	protected String data = null;
    	Node next = null;
	
		Node(){
		    next = null; data = null;
		}
		Node(String s){
			next = null; data = s;
		}

        Node(Node n){
        	setData(n.getData());
        	setNext(n.getNext());
        }
        
	    /*
	     * -1 if calling object comes before
	     *  0 if the calling object equals 
	     * +1 if the calling object comes after
	     */
		public int compareTo(Object o){
		   Node n = (Node)o;
		   String s = (String)n.getData();
		   return getData().compareTo(s);	
		}
		
        // mutators and accessors
        
		public String getData(){
			return data;
		}	
		public void setData(String s){
			data = s;
		}
		public Node getNext(){
			return next;
		}
		public void setNext(Node n){
			next = n;
		}
    }
    
    private Node head = null;
    private int nodeCount = 0; // use in equals for quick check.

    /*
	 Make a copy of the linked list
	 Normally you would not offer a shallow option in a clone method.
	*/
	public MyLinkedList clone(){
		MyLinkedList klone = null;
		int choice;
		try{
    		klone = (MyLinkedList)super.clone();
		}
		catch(Exception e){} // needed for call to super.
	    System.out.println("Shallow Clone(0) or Deep Clone(1)?");
	    Scanner console = new Scanner(System.in); 
	    choice = console.nextInt();
	    Node curr = null, klon = null;
	    if(choice == 1){
	    	curr = getHead();
	    	klone.setHead( new Node(curr));
			klon = klone.getHead();	    	
	    	while(curr != null){
	    		curr = curr.next;
	    		if(curr != null){
	    			klon.setNext(new Node(curr));
			    	klon = klon.getNext();	    			
	    		}
	    	}
	    }
		return klone;
	}
	
	// state check
	public boolean empty(){
		return head == null;
	}

    // add a node to the list
	public void add(String s){
		incNodeCount();
		if (empty()){
			head = new Node(s);
		}
		else{	
			Node curr = head;
			Node newNode = new Node(s);
			while(curr != null){
				
				// see if new node is new head
                if(curr == head){
                	   if(curr.compareTo(newNode)>0){
                	   head = newNode;
                	   newNode.next = curr;
                	   break;	
                	}		
                }				

				// See if new node belongs at end of list
				if(curr.next == null){
					curr.next = newNode;
					break;
				}

                // see if new node goes between
                if(curr.next.compareTo(newNode)>0){
                	newNode.next = curr.next;
                	curr.next = newNode;
                	break;
                }
                // continue to loop
				curr = curr.next;
			}
		}
    }
    
    // mutators and accessors
    
    private int getNodeCount(){
    	return nodeCount;
    }
    private void incNodeCount(){
    	nodeCount++;
    }
	public Node getHead()	{
		return head;
	}
	public void setHead(Node n)	{
		head = n;
	}
    
    // obligitory utility functions
    
	public String toString(){
		Node curr = head;
		String s = "\nList Contains:\n";
		while(curr != null){
			s += curr.data + "\n";
			curr = curr.next;
		}
		return s;
	}
	
	public boolean equals(Object o){
		MyLinkedList mll = (MyLinkedList)o;
		
		// equal lists have the same number of nodes
		if(getNodeCount() != mll.getNodeCount()){
		    System.out.println("Num Nodes mismatch");
			return false;
		}
		Node curr = getHead();
		Node comp = mll.getHead();
		
		// equal lists have the same data in each node
		while(curr != null){
			if(curr.compareTo(comp)!=0){
				System.out.println("Data Mismatch");
				return false;
			}
			curr = curr.next;
			comp = comp.next;
		}
		return true; // all tests passed.
	}
}