/*
   Base class for fish and chicken menu items.
 */
package dailymenufa17;

// this class must be abstract because toString is abstract;
public abstract class Food {
    private String name;
    
    public Food(){name = "DEFAULT";}
    
    public Food(String n){name = n;}
    
    public String getName(){return name;}
    
    public void setName(String n){name = n;}
    
    // no body makes this method abstract 
    // which means it must be implemented in the derived class
    public abstract String toString();
    
}
