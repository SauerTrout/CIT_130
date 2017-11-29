/*
  Through inheritance make a daily menu and show it.
  This version adds polymorphism.
*/
package dailymenufa17;

public class DailyMenuFA17 {

    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken("Chicken Parmesan");
        Fish f1 = new Fish();
        Fish f2 = new Fish("Cod sandwich with FF");
        // using the objects
        System.out.println("From the Fish and Chicken Objects");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(f1);
        System.out.println(f2);
        Food [] fA = new Food[4];
        // using polymorphism
        System.out.println("\nFrom an Array");
        fA[0] = c1; fA[1]= c2; fA[2] = f1; fA[3] = f2;
        for(int i = 0; i < fA.length; i++)
            System.out.println(fA[i]);
    }
    
}
