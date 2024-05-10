/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author xinph
 */
public class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;
    
    public Node(E element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public Node(E element) {
        this(element, null, null);
    }
}
