/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author panglang
 */
public class LinkedList <E> {
    private Node <E> head;
    private Node <E> tail;
    private int size;
    
    private static class Node <E> {
        E element;
        Node <E> next;
    }
    
    public void addLast(E e){
        Node <E> newNode = new Node<>();
        if (tail == null){
            // If the list is empty, set both head and tail to the new node
            head = tail = newNode;
        } else {
            // If the list is not empty, add the new node after the current tail
            tail.next = newNode;
            // Update tail to point to the new last node
            tail = tail.next;
        }
        size++;
    }
    
    public E xyz (int index, E e) { 
        if (index < 0 || index >= size) 
            return null;
        else if (index == size-1) {
            this.addLast(e);
            return null;
        } else {
            Node <E> current = head;
            for (int i = 1; i < index - 1; i++)
                current = current.next;
            E temp = current.next.element;
            current.next.element = e;
            return temp;
        }
    }
}
/*
a) Based on the above source code, explain what the lines of code do from line 10 – 21.
If the index is at the end of the linked list (or beyond), the method adds the new element e to the end of the list 
using the addLast method. Then it returns null, indicating that no element was replaced.

If the index is at the beginning of the linked list, the method updates the element of the head node with the new element e. 
It stores the old element of the head node in temp, then returns temp.element, which is the old element that was replaced.

For any other index (neither the beginning nor the end), the method iterates through the linked list until it reaches the node 
just before the specified index. Then it updates the element of the node at the specified index with the new element e. 
It returns the element of the node that was replaced.


b) What is the main purpose of the method xyz()?
set method which update an element at specific index in a singly linked list

c) Obviously, there are some bugs in the source code. Debug the code and make it concise and simpler.
*/