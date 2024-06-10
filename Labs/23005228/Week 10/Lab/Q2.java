/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class Q2 {
    
    public static void permuteString(String str) {
        permuteStringHelper("", str);
    }

    private static void permuteStringHelper(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permuteStringHelper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        permuteString("ABC");
  
    }

}
