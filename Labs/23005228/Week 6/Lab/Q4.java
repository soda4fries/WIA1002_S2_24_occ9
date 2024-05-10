/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Checking for palindrome string ...");
        System.out.print("Enter a string: ");
        String value = input.nextLine();

        MyStack<Character> stack = new MyStack<>();
        
        for (int i = 0; i < value.length(); i++) {
            stack.push(value.charAt(i));
        }

        String afterPop = "";
        while (!stack.isEmpty()) {
            afterPop += stack.pop().toString();
        }

        if (value.equalsIgnoreCase(afterPop)) {
            System.out.println("Is a Palindrome!");
        }
        else {
            System.out.println("Not a palindrome!");
        }
    }
}
