/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;

/**
 *
 * @author panglang
 */
public class Node <E> {
    E element;
    Node <E> next;

    public Node() {
    }
    
    public Node(E element) {
        this.element = element;
    }
}
