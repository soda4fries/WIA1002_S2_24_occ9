package Lab;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 18/3/2024
 * Objective: Q4: Create generic method with array.
 */

public class Q4 {
    
    public static <T extends Comparable<T>> String Q4(T[] array) {
        T min = array[0];
        T max = array[0];
        
        for(int i=0; i<array.length; i++){
            if(min.compareTo(array[i])>0){
                min = array[i];
            }
            if(max.compareTo(array[i])<0){
                max = array[i];
            }
        }
        return "Min = " + min + " Max = " + max;
    } 
    
    public static void main(String[] args) {
        Integer [] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        String intStr = Q4(intArray);
        System.out.println(intStr);
        
        String strStr = Q4(strArray);
        System.out.println(strStr);
        
    }
    
    
}
