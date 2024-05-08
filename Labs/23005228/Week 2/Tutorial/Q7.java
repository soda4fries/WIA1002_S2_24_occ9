package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 17/3/2024
 * Objective: Q7: Declare a method header for generic method.
 */

import java.util.ArrayList;
public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>(); 
        ArrayList<Object> transportation = new ArrayList<>(); 
    }
    
    public static <T> void allTransportation(ArrayList<? extends T> list1, ArrayList<? super T> list2){
        
        
    }
   
            
    
}
