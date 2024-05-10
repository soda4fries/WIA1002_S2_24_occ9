/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 * Q1b and 1c
 * @author xinph
 */
public class TestMyStack {
    public static void main(String[] args) {
        // 1b
        MyStack <Character> stack = new MyStack <Character>();
        
        stack.push('a');
        stack.push('b');
        stack.push('c');
        
        System.out.println(stack);
        
        System.out.println("Is element 'b' in the stack: " + stack.search('b'));
        
        System.out.println("Is element 'k' in the stack: " + stack.search('k'));
     
        // 1c
        MyStack <Integer> list = new MyStack <Integer>();
        
        list.push(1);
        list.push(2);
        list.push(3);
        
        System.out.println(list);
        
        System.out.println("Is element '6' in the stack: " + list.search(6));
    }

}
