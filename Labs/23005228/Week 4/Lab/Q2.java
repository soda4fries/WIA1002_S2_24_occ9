/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class Q2 <E> {
    private Node<E> head;
    private Node<E> tail;
    private static int size;
    
    class Node <E>{
        E element;
        Node <E> next;
    
        public Node(E o) {
            this.element = o;
        }
    }

    public E getMiddleValue() {
        if (head == null) {
            return null; // Return null for empty list
        }
        Node<E> slowPointer = head;
        Node<E> fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.element;
    } 
}
