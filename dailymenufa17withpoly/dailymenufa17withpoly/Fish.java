/*
  Fish menu item, inherites from Food.
 */
package dailymenufa17;


public class Fish extends Food{
    private String desc;
    
    public Fish(){
        super();
        desc = "UNSPECIFIED";
    }
    
    public Fish(String d){
        super("FISH");
        desc = d;
    }
    
    public void setDesc(String d){desc = d;}
    public String getDesc(){return desc;}
    
    
    public String toString(){
        return "Protein " + getName() + "\nDescription " + getDesc();
    }
    
    
    
}
