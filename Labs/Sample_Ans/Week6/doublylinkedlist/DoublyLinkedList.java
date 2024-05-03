/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;
import java.util.*;
/**
 *
 * @author Hairul
 */

public class DoublyLinkedList<E> {
 
    public static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;
 
        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        public Node(E element){
			this(element, null, null);
		}
    }
    
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
     
    public DoublyLinkedList() {
        size = 0;
        this.head=null;
        this.tail=null;
    }
    
    
    
    public int size() { return size; }
     
    
    public boolean isEmpty() { return size == 0; }
     
    public void addFirst(E element) {
        //create object tmp and set pointer of the new node
        Node<E> tmp = new Node<>(element, head, null);
        //set head.prev of current head to be linked to the new node
        if(head != null ) {head.prev = tmp;} 
        head = tmp; //now tmp become head
        //if no tail, then tmp set to be a tail
        if(tail == null) { tail = tmp;}
        size++;//increase number of node
        System.out.println("adding: "+element);
    }
     
    
    public void addLast(E element) {
        //create object tmp and set pointer of the previous node
        Node<E> tmp = new Node<>(element, null, tail);
        //set tail.next point to object tmp
        if(tail != null) {tail.next = tmp;}
        //now tmp become tail
        tail = tmp;
        //if no head, then tmp set to be a head
        if(head == null) { head = tmp;}
        size++;//increase number of node
        System.out.println("adding: "+element);
    }
     
    
    public void iterateForward(){
         
        System.out.println("\niterating forward..");
        Node<E> tmp = head;
        while(tmp != null){
            System.out.print(tmp.element);
              System.out.print(" ");
            tmp = tmp.next;
        }
    }
     
   
    public void iterateBackward(){
         
        System.out.println("\niterating backward..");
        Node<E> tmp = tail;
        while(tmp != null){
            System.out.print(tmp.element);
            System.out.print(" ");
            tmp = tmp.prev;
        }
    }
     
    
    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException();
       //copy head to node tmp
        Node<E> tmp = head;
        //head.next become a head
        head = head.next;
        //set pointer of prev of new head to be null
        head.prev = null;
        //reduce number of node
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
     
    
    public E removeLast() {
        if (size == 0) throw new NoSuchElementException();
         //copy tail to node tmp
        Node<E> tmp = tail;
        //tail.prev become a tail
        tail = tail.prev;
        //set pointer of next of new tail to be null
        tail.next = null;
       //reduce number of node
        size--;
        System.out.println("deleted: "+tmp.element);
        return  tmp.element;
    }
     
    public void add(int index, E element){
		//index can only be 0 ~ size()
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		if(index == 0)
			addFirst(element);
		else if(index == size)
			addLast(element);
		else{
                        /* set from head and begin traverse
                        stop on required position */
			Node<E> temp = head;
			for(int i=0; i<index; i++){
				temp = temp.next;
			}
                        /* create object insert and set pointer of the next pointer
                        to the temp node and also set pointer of the prev pointer
                        to the temp.prev node
                        */
			Node<E> insert = new Node<>(element, temp, temp.prev);
			//set pointer 'next' of the node temp.prev to new node insert
                        temp.prev.next = insert;
			//set pointer 'prev' of the node temp to new node insert
                        temp.prev = insert;
			size ++;
		}
	}
    
    public E remove(int index){
		E element = null;
		if(index < 0 || index >=size)
			throw new IndexOutOfBoundsException();
		if(index == 0)
			removeFirst();
		else if(index == size-1)
			removeLast();
		else{
			Node<E> temp = head;
			for(int i=0; i<index; i++){
				temp = temp.next;
			}
			element = temp.element;
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
			temp.next = null;
			temp.prev = null;
			size --;
		}
		return element;
	}
    
    public void clear(){
                int initial =size;
		Node<E> temp = head;
		while(head != null){
			temp = head.next;
			head.prev = head.next = null;
			head = temp;
		}
		temp = null;
		tail.prev = tail.next = null;
		size = 0;
                 System.out.println("successfully clear "+initial+" node(s)");
	}
    
    public static void main(String a[]){
         
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(10);
        doublyLinkedList.addLast(100);
        doublyLinkedList.add(2,2);
        doublyLinkedList.remove(3);
        doublyLinkedList.iterateForward();
        doublyLinkedList.iterateBackward();
        System.out.println("\nsize of current Doubly Linked List: " +doublyLinkedList.size()); 
        doublyLinkedList.clear();
        System.out.println("\nsize of current Doubly Linked List: " +doublyLinkedList.size()); 
    
    }
}
