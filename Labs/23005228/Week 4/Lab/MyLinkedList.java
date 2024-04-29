/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.NoSuchElementException;

/**
 *
 * @author xinph
 */
public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private static int size;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int size(){
        return size;
    }
    

    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // the new node is the only node in list
            tail = head;
    }


    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e); // Create a new for element e

        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        }
        else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }


    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        }
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }


    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }   
            return temp.element;
        }
    }


    public E removeLast() {
        if (size == 0) {
            return null;
        }
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
        }

        Node<E> temp = tail;
        tail = current;
        tail.next = null;
        size--;
        return temp.element;
        }
    }


    public E remove(int index) {   
        if (index < 0 || index >= size) {
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
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
    
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current.element;
    }

    public E getFirst() {
        if (size == 0)
            throw new NoSuchElementException("List is empty");
        return head.element;
    }

    public E getLast() {
        if (size == 0)
            throw new NoSuchElementException("List is empty");
        return tail.element;
    }

    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(e))
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int lastIndex = -1;
        int index = 0;
        while (current != null) {
            if (current.element.equals(e))
                lastIndex = index;
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    public E set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        E oldValue = current.element;
        current.element = e;
        return oldValue;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }
            
}

