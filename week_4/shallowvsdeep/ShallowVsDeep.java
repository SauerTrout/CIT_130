

package shallowvsdeep;

/**
 *
 * @author kmoore
 */
public class ShallowVsDeep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shallow s = new Shallow();
        for(int i = 0; i < 10; i++)
            s.a[i] = i;
        Shallow sCopy = new Shallow(s);
        sCopy.a[2] = -11111;
        System.out.println("s");
        System.out.println(s);
        System.out.println("");
        System.out.println("sCopy");
        System.out.println(sCopy);

        
        Deep d = new Deep();
        for(int i = 0; i < 10; i++)
            d.a[i] = i;
        Deep dCopy = new Deep(d);
        dCopy.a[2] = -11111;
        System.out.println("d");
        System.out.println(d);
        System.out.println("");
        System.out.println("dCopy");
        System.out.println(dCopy);
        
    }
    
}
