/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.SList;

/**
 *
 * @author xinph
 */
public class SNode <E>{
    E element;
    SNode<E> next;

    public SNode() {
    }

    public SNode(E e) {
        this.element = e;
        this.next = null;
    }
}
