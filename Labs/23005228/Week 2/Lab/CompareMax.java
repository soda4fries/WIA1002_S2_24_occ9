package Lab;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 18/3/2024
 * Objective: Q2: Create generic static method.
 */

public class CompareMax {
    
    public static <T extends Comparable<T>> T maximum (T a, T b, T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
        
    }
    
    public static void main(String[] args) {
        System.out.println("Max numbers for int: "+maximum(2,3,4));
        System.out.println("Max numbers for double: "+maximum(7.0,3.9,4.3));
    }
    
}
