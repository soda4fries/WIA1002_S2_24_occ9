/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author xinph
 */
// Implementing removeLast()
public class Q3 <E>{
    
    Node<E> head;
    Node<E> tail;
    private static int size;
    
    public E removeLast() {
    if (size == 0) return null;
    else if (size == 1){ //only 1 node
        Node<E> temp = head;
        head = tail = null; 
        //reset to know
        size = 0;
        return temp.element; 
        //to know what we delete
    }
    else{
        Node<E> current = head;
        for (int i = 0; i < size - 2; i++)
            current = current.next;
        //stop 1 node before tail
        Node<E> temp = tail;
        //copy tail to temp b4 delete
        tail = current;
        //current become tail
        tail.next = null;
        //reset the next for tail to be null
        size--;
        return temp.element;
    }
}
    
}
