/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class MinMax {
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    
    public static <V extends Comparable<V>> String minmax(V[] v){
        V min = v[0];
        V max = v[0];
        for (V value : v){
            if (min.compareTo(value) > 0)
                min = value;
            if (max.compareTo(value) < 0)
                max = value;
        }
        return "Min = " + min + " Max = " + max;
    }
    
    
}
