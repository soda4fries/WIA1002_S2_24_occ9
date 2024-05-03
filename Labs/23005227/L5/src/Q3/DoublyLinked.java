/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import java.util.NoSuchElementException;

/**
 *
 * @author panglang
 */
public class DoublyLinked <E> {
    private Node <E> head;
    private Node <E> tail;
    private int size;
    
    public DoublyLinked(){
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void addFirst(E element){
        Node <E> temp  = new Node(element, head, null);
        if (head != null) head.prev = temp;
        head = temp;
        if (tail == null) tail = temp;
        size++;
        System.out.println("adding: " + element);
    }
    
    public void addLast(E element){
        Node <E> temp = new Node(element, null, tail);
        if (tail != null) tail.next = temp;
        tail = temp;
        if (head == null) head = temp;
        size++;
        System.out.println("adding: " + element);
    }
    
    public void add(int index, E element){
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) addFirst(element);
        else if (index == size) addLast(element);
        else {
            Node <E> temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
                if (temp == null) throw new IndexOutOfBoundsException();
            }
            Node <E> insert = new Node<>(element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        }
    }
    
    public E removeFirst(){
        if (size == 0) throw new NoSuchElementException();
        Node <E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast(){
        if (size == 0) throw new NoSuchElementException();
        Node <E> temp = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E remove(int index){
        E element = null;
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) element = removeFirst();
        else if (index == size-1) element = removeLast();
        else {
            Node <E> temp = head;
            for (int i=0; i<index; i++){
                temp = temp.next;
            } element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return element;
    }
    
    public void iterateForward(){
        System.out.println("iterating forward..");
        Node <E> temp = head;
        while (temp != null){
            System.out.println(temp.element);
            System.out.println(" ");
            temp = temp.next;
        }
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward..");
        Node <E> temp = tail;
        while (temp != null){
            System.out.println(temp.element);
            temp = temp.prev;
        }
    }
    
    public void clear(){
        Node <E> temp = head;
        while (head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.println("successfully clear " + size + "node(s)");
    }
    
    public int getSize(){
        return size;
    }
}
