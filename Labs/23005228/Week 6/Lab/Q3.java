/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 * Q3
 * @author xinph
 */
public class Q3 {
    
    public static void main(String[] args) {
        
        MyStack<Integer> S = new MyStack<>();
        
        for (int i = 1; i <= 14; i++) { // assume number of positive integers is 14
            S.push(i);
        }

        int sum = 0;
        while (!S.isEmpty()) {
            sum += S.pop();
        }

        System.out.println("Sum of every element in stack is " + sum);
    }
}
