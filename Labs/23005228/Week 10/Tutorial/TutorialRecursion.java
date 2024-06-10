/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 * 1. StackOverflowError occurs because the recursion will continue infinitely, f(0), f(-1), f(-2) and so on.
 * 2. f() only can accept n<=0
 * 
 */
public class TutorialRecursion {
    public static void main(String[] args) {
        System.out.println("Test Q3");
        String s = "Hello";
        String reversed = reverseString(s);
        System.out.println("Reversed string: " + reversed);
        System.out.println("\nTest Q4");
        int n = 5;
        int result = sum(n);
        System.out.println("Sum: " + result);
        System.out.println("\nTest Q5");
        printDigit(4567);
        
    }
    
    // Q3
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    
    // Q4
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
    
    // Q5
    public static void printDigit(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            printDigit(n / 10);
            System.out.print(" " + (n % 10));
        }
    }

  
}
