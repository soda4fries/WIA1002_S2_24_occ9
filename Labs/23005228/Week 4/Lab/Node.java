/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}
