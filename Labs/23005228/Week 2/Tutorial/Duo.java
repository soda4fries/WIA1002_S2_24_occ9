package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 17/3/2024
 * Objective: Q5: Create generic class.
 *            Q6: Declare and create two objects.
 */

public class Duo <A, B> {
    private A first;
    private B second;
    
    public Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    Duo <String, Integer> sideShape = new Duo <> ("Rectangle",9);
    Duo <Double, Double> points = new Duo <> (3.5,6.5);
    
}
