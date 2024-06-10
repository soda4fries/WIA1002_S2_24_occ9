/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class Q1 {
    
    public static String substituteAI(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            char firstChar = (str.charAt(0) == 'a') ? 'i' : str.charAt(0);
            return firstChar + substituteAI(str.substring(1));
       }
    }

    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted")); // Output: flibbergisted
        System.out.println(substituteAI("Astronaut")); // Output: Astroniut
    }

}
