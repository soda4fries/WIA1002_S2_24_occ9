/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 * 
 * @author xinph
 */
public class Q2 <E> {
    
    Node <E> head;
    Node <E> tail;
    private static int size;
    
    public boolean contains(E e) {
        Node <E> current = head;
        for (int i=0; i<size; i++) {
            System.out.println(current.element);
            if (e.equals(current))
                return true;
                current = current.next;
        }
        return false;
    }  
}

