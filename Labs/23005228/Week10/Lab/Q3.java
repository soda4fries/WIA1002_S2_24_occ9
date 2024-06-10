/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class Q3 {
    
    public static long exponent(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * exponent(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(exponent(10, 3)); 
    }

}
