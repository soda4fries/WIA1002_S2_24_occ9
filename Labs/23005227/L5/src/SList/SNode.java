/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SList;

/**
 *
 * @author panglang
 */
public class SNode <E> {
    E element;
    SNode <E> next;
    SNode <E> prev; 

    public SNode(){
        this(null,null,null);
    }
    
    public SNode(E element) {
        this(element,null,null);
    }
    
    public SNode(E element, SNode<E> next, SNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
