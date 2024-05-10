/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author xinph
 */
public class Q1<E> {
    /*a. if index=0, the system updates head with new element and return previous head element
         if index!=0,the system iterates through the list until the node before the index given, 
         it updates the element at the index and returns the original element*/
    
    //b. Insert a node at the middle of the list
    
    //c. 
       
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
     
    public Q1() {
        size = 0;
        this.head=null;
        this.tail=null;
    } 
    
    public void xyz(int index, E e) {
        
        
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(); // Index out of bounds
            
        } else if (index == 0) {
            Node<E> tmp = new Node(e, head, null);
            if(head != null ) 
                head.prev = tmp;
            head = tmp; 
            if(tail == null) 
                tail = tmp;
            size++;
            
            
        } else if (index == size){
            Node<E> tmp = new Node(e, null, tail);
            if(tail != null ) 
                tail.prev = tmp;
            tail = tmp; 
            if(head == null) 
                head = tmp;
            size++;
            
            
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node<E> insert = new Node<>(e, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
            
        }
    }
}