/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author panglang
 */
public class DoublyLinkedList <E> {
    private Node <E> head;
    private Node <E> tail;
    private int size;

    public DoublyLinkedList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    private static class Node <E> {
        E element;
        Node <E> next;
        Node <E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public void addFirst(E element){
        Node <E> temp = new Node(element, head, null);
        if (head != null) head.prev = temp;
        head = temp;
        if (tail == null) tail = temp;
        size++;
        System.out.println("adding: " + element);
    }
    
    public void addLast(E element){
        Node <E> temp = new Node<>(element, null, tail);
        if (tail != null) tail.next = temp;
        tail = temp;
        if (head == null) head = temp;
        size++;
        System.out.println("adding: " + element);
    }
    
    public void add(int index, E element){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(element);
        else if (index == size)
            addLast(element);
        else {
            Node <E> temp = head;
            for (int i=0; i<index; i++){
                temp = temp.next;
            }
            Node <E> insert = new Node (element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        } 
    }
    
    public void print(){
        String s = "";
        for (Node <E> current = head; current != null; current = current.next){
            System.out.print(current.element + " ");
        } 
    }
    
    public E remove(int index){ 
        E element = null;
        if (index < 0 || index >= size)
            return null;
        else {
            // Initializes a temporary node temp with the reference to the head of the linked list. 
            // This temporary node will be used to traverse the list to the node at the specified index.
            Node <E> temp = head;
            // This loop iterates through the linked list until temp points to the node at the specified index. 
            // It moves temp forward index times by updating temp to its next node on each iteration.
            for (int i=0; i<index; i++)
                temp = temp.next;  
            // Retrieves the element stored in the node that will be removed. 
            // This line stores the element in a variable element for later return.
            element = temp.element;
            // Updates the prev reference of the node after temp. By accessing temp.next, it gets the node after temp. 
            // Then it updates the prev reference of that node to point to the node before temp, effectively removing temp from the list.
            temp.next.prev = temp.prev;
            // Updates the next reference of the node before temp. 
            // It accesses temp.prev to get the node before temp, then updates its next reference to point to the node after temp, again effectively removing temp from the list.
            temp.prev.next = temp.next;
            // Clears the references of temp to make it disconnected from the rest of the list, preparing it for garbage collection.
            temp.next = null;
            temp.prev = null;
            // Decrements the size of the linked list to reflect the removal of one element.
            size --;
        }
        return element;
    }
    
}


