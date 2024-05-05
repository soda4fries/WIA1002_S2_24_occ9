/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 * Q2
 * @author xinph
 */
import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {
        
        MyStack<Integer> intStack = new MyStack<>();
        
        // a
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        // b
        for (int i = 1; i <= n; i++) {
            intStack.push(i);
        }

        System.out.println("Size of stack: " + intStack.getSize());

        System.out.println("Content of the stack: ");
        while (!intStack.isEmpty()) {
            System.out.print(intStack.pop() + " ");
        }
    }
}
