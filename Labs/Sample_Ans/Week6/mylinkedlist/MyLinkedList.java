/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author hairul
 */
public class MyLinkedList<E> {
    Node<E> head, tail;
    int size = 0;    
    
     public MyLinkedList() {}  
     
     public MyLinkedList(E[] objects) {
         for(int i=0; i<objects.length; i++) {
             add(objects[i]);
         }
     }       
    
    //     a.	public void addFirst(E e)
    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
      Node<E> newNode = new Node<E>(e); // Create a new node
      newNode.next = head; // link the new node with the head
      head = newNode; // head points to the new node
      size++; // Increase list size

      if (tail == null) // the new node is the only node in list
        tail = head;
    }
    
    //b. public void addLast(E e)
    /** Add an element to the end of the list */
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

       
     public void add(E e) {
         add(size,e);
     }
     
   //c. public void add(int index, E e) 
    /** Add a new element at the specified index in this list
     * The index of the head element is 0 */
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

    //d. public E removeFirst()
    /** Remove the head node and
     *  return the object that is contained in the removed node. */
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

   //e.	public E removeLast()
    /** Remove the last node and
     * return the object that is contained in the removed node. */
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

    
   //f.	public E remove(int index)
    /** Remove the element at the specified position in this list.
     *  Return the element that was removed from the list. */
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

    //g. public void removeElement(E e)
    /** Remove the element by searching the specified position in this list of the given value.
     * If there are repeated elements, only the first element will be removed 
     *  Does not return anything. */
    public void removeElement(E e) {
        Node<E> current = head;
       
        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
               remove(i);
            }
        current = current.next;
        }             
    }
     
    //h. public boolean contains(E e)
    /** Check if the element of the given value is in the list.
     *  Returns true if item is in the list, false if not in the list. */
    public boolean contains(E e) {
        Node<E> current = head;
        
        for(int i=0; i<size; i++) {
           if(current.element.equals(e)) {
               return true;
           }    
         current = current.next;
        }
        return false;
    }
    
    //i. public void replace(E e, E newE)  // or set(E e, newE)
    /** Replace a specified item with a new item.
     *  Does not return anything. */
    public void replace(E e, E newE) {  
        Node<E> current = head; 
                
        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
               current.element = newE; 
            }
            current = current.next;
        }     
    }    
     
     //j. public void printList()  
    /** Display all items in the list.
     *  Does not return anything. */        
    public void printList() {
        Node<E> current = head;
        
        for(int i=0; i<size; i++) {
            System.out.print(current.element);   
            
            if(i==size-1) {
                System.out.print(". ");
            }
            else {
                System.out.print(", ");
            }
            
             current=current.next;
        }
        System.out.println();
    }
            
   //k. public int getSize()  
    /** Returns the number if items in the list.
     *  Returns an integer value. */
    public int getSize() {
        return size;
    }
    
//    public E get(int index) {
//      if(index < 0 || index > size-1)
//          return null;
//
//      Node<E> temp = head;
//
//      for(int i=0; i<index; i++) {
//         temp = temp.next;
//      }
//      return temp.element;
//    }
//
//    public E getFirst() {
//        if(size==0) {
//          return null;
//      }
//      else
//          return head.element;
//    }
//
//    public E getLast(){
//      if(size==0) {
//          return null;
//      }
//      else
//          return tail.element;
//    }
       
  }

