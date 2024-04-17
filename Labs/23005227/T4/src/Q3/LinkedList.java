/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author panglang
 */
public class LinkedList <E> {
    Node <E> head;
    Node <E> tail;
    private int size;
    
    public E removeLast(){
        if (size == 0) return null;
        else if (size == 1) {
            Node <E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node <E> current = head;
            for (int i = 0; i<size-2; i++)
                current = current.next;
            Node <E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    
}
