/*
  Chicken menu item, inherites from Food.
 */
package dailymenufa17;


public class Chicken extends Food{
    private String desc;
    
    public Chicken(){
        super();
        desc = "UNSPECIFIED";
    }
    
    public Chicken(String d){
        super("CHICKEN");
        desc = d;
    }
    
    public void setDesc(String d){desc = d;}
    public String getDesc(){return desc;}
    
    public String toString(){
        return "Protein " + getName() + "\nDescription " + getDesc();
    }
}
