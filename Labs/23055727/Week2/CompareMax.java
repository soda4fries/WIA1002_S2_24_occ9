/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class CompareMax {
    public static void main(String[] args) {
        System.out.println(CompareMax.maximum("Boy", "Cat", "Apple"));
        System.out.println(CompareMax.maximum(23, 99, -5));
        System.out.println(CompareMax.maximum(1, 0, -1));
    }
    
    
    static <E extends Comparable<E>> E maximum(E e1, E e2, E e3) {
        if (e1.compareTo(e2) > 0)
            if(e1.compareTo(e3) > 0)
                return e1;
            else
                return e3;
        else
            if(e2.compareTo(e3) > 0)
                return e2;
            else
                return e3;
    }
    
}
