/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

import java.util.NoSuchElementException;

/**
 *
 * @author panglang
 */
public class SList <E> {
    SNode <E> head;
    SNode <E> tail;
    int size;

    public SList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    // Append a new element at the end of the list.
    public void appendEnd(E e){
        SNode <E> temp = new SNode (e, null, tail);
        if (tail != null) tail.next = temp;
        tail = temp;
        if (head == null) head = temp;
        size++;
        System.out.println("appending " + e);
    }
    
    // Eliminate the first element in the list.
    public E removeInitial(){
        if (size == 0) throw new NoSuchElementException();
        SNode <E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleting " + temp.element);
        return temp.element;
    }

    // Search for an element and returns true if this list contains the searched element
    public boolean contains(E e){
        for (SNode <E> current = head; current != null; current = current.next){
            if (current.element.equals(e)){
                return true;
            }
        } return false;
        
        /*
            SNode<E> current = head; // Start from the head node
            while (current != null) {
                if (current.element.equals(e)) {
                    return true; // Element found, return true
                } current = current.next; // Move to the next node
            }
            return false; // Element not found in the list
        */
    }
            
    // Empty all elements in the list and return a statement that reports that the list is empty.
    public void clear(){
        SNode <E> temp = head;
        while (head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        } temp = null;
        tail.prev = tail.next = null;
        size = 0;
    }

    // Display all values from the list in a successive order.
    public void display(){
        SNode <E> current = head;
        while (current != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println(" ");
        /*
        for (SNode <E> current = head; current != null; current = current.next){
            System.out.print(current.element + " ");
        }
        System.out.println(" ");
        */
    }
    
   
    
    
}
