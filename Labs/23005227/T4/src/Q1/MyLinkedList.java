/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author panglang
 */
public class MyLinkedList <E> {
    Node <E> head;
    Node <E> tail;
    private static int size;

    public MyLinkedList() {
    }
    
    
//        Condition to consider:
//        Whether the list contains any node.
//        If it doesn't, the tail should be set to this new node.
//
//        Set the next of this firstNode to the current head.
//        Set the head to this firstNode.
    
    public void addFirst(E e){
        Node <E> newNode = new Node <>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }
    
    
//        Condition to consider:
//        Whether the list contains any node.
//        If it doesn't, both the head and tail should be set to this new node.
//
//        Set the next of the current node to this new node.
//        Set the tail to this new node.
    
    public void addLast(E c){
        if (tail == null){
            head  = tail = new Node<>(c);
        }
        else {
            tail.next = new Node<>(c);
            tail = tail.next;
        }
        size++; 
    }
    
    
//        Condition to consider:
//        Whether the index is less than 0 or greater than the size of the list.
//        If so, we can either throw an exception or append the node to the respective end of the list.
//
//        If the index is 0, invoke the addFirst method.
//        If the index is equal to the size of the list, invoke the addLast method.
//        Otherwise, search for (index-1)th node and assign it to current.
//        Set the next of this new node to the node after the current.
//        Set the next of the current to this new node.
    
    public void add(int index, E e) {
        if (index == 0) 
            addFirst(e); 
        else if (index >= size) 
            addLast(e);
        else {
            Node <E> current = head;
            for (int i=1; i<index; i++)
                current = current.next;
            Node <E> temp = current.next;
            current.next = new Node <>(e);
            (current.next).next = temp;
            size++;
        }
    }
        
//        Condition to consider:
//        Whether the list contains any node.
//        If it doesn't, null is returned.
//        Whether the list contains only one node.
//        If so, set both the head and tail to null and return the item of that node.
//
//        Set the head to the node after the current head.
//        Return the item of the initial head.
    
    public E removeFirst(){
        if (size == 0)
            return null;
        else {
            Node <E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }
    
//        Condition to consider:
//        Whether the list contains any node.
//        If it doesn't, null is returned.
//        Whether the list contains only one node.
//        If so, set both the head and tail to null and return the item of that node.
//
//        Assign the node before the tail to current.
//        Set the next of the current to null.
//        Return the item of the initial tail.
    
    public E removeLast(){
        if (size == 0)
            return null;
        else if (size == 1){
            Node <E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node <E> current = head;
            for (int i=0; i<size-2; i++)
                current = current.next;
            Node <E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
//        Condition to consider:
//        Whether the index is less than 0 or greater than or equal to the size of the list.
//        If so, we can either throw an exception or return null.
//
//        If the index is 0, invoke the removeFirst method.
//        Otherwise, search for (index-1)th node and assign it to current.
//        Set the next of the current to the node after the next of the current.
//        Return the item of the node after the initial current.
    public E remove (int index){
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node <E> previous = head;
            for (int i=0; i<index; i++)
                previous = previous.next;
            Node <E> current = previous.next;
            size--;
            return current.element;
        }
    }
}
