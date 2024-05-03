/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class MinMaxTwoDArray {
    public static void main(String[] args) {
        Integer[][] numbers = {{4,5,6},{1,2,3}};
        System.out.println("Max: " + MinMaxTwoDArray.max(numbers));
        System.out.println("Min: " + min(numbers));
    }
    
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for (E[] array : list)
            for (E element : array)
                if (max.compareTo(element) < 0)
                    max = element;
        return max;
    }
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        for (E[] array: list)
            for (E element : array)
                if (min.compareTo(element) > 0)
                    min = element;
        return min;
    }
}
