/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author panglang
 */
public class LinkedList <E> {
    Node <E> head;
    Node <E> tail;
    private int size;

    public LinkedList() {
    }
    
    public void add(E e){
        Node <E> newNode = new Node <> (e);
        // If the list is empty, set the new node as the head
        if (head == null) head = newNode;
        else {
            // Traverse the list to find the last node
            Node <E> current = head;
            while (current.next != null){
                current = current.next;
            }
            // Set the next node of the last node to the new node
            current.next = newNode;
        }
        size++;
    }
               
    public void removeElement(E e){
        if (head == null) return;
        if (head.element.equals(e)){
            head = head.next;
            size--;
            return;
        }
        Node <E> previous = head;
        Node <E> current = head.next;
        while (current != null){
            if (current.element.equals(e)){
                previous.next = current.next;
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }        
    }
    
    public void printList(){
        if (size == 0){
            System.out.println("");
            return;
        }
        System.out.print(head.element);
        for (Node <E> current = head.next; current != null; current = current.next){
            System.out.print(", " + current.element);
        } System.out.println(".");
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        for (Node <E> current = head; current!= null; current = current.next){
            if (current.element.equals(e))
                return true;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        for (Node <E> current = head; current!= null; current = current.next){
            if (current.element.equals(e)){
                current.element = newE;
                break;
            }
        }
    }
}
