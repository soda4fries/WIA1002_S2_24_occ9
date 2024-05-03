/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author panglang
 */
public class Test {
    public static void main(String[] args) {
        DoublyLinked <Integer> list = new DoublyLinked<>();
        list.addFirst(1);
        list.add(1, 10);
        list.addLast(100);
        list.add(2,2);
        list.remove(3);
        
        list.iterateForward();
        list.iterateBackward();
        System.out.println("Size of the current doubly linked list: " + list.getSize());
        list.clear();
        System.out.println("Size of the current doubly linked list: " + list.getSize());
        
    }
}
