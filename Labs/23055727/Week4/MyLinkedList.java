/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class MyLinkedList<E> {
    Node<E> head, tail;
    
    MyLinkedList(){};
    
    public void addFirst (E e){
        if (head == null){
            head = tail = new Node<E>(e,null);
        } else {
            head = new Node<E>(e,head);
        }
    }
    
    public void addLast(E e){
        if (head == null){
            head = tail = new Node<E>(e,null);
        } else {
            tail.next = new Node<E> (e,null);
            tail = tail.next;
        }
    }
    
    public void add (int index, E e){
        if (index < 0)
            throw new IndexOutOfBoundsException();
        else if (index == 0)
            addFirst(e);
        else
        {   if (head == null)
                throw new IndexOutOfBoundsException();
            int count = 0;
            Node<E> ptr = head;
            while (count < index-1){
                if (ptr.next == null)
                    throw new IndexOutOfBoundsException();
                count++;
                ptr = ptr.next;
            }
            ptr.next = new Node<>(e,ptr.next);
        }
    }
    
    public E removeFirst(){
        if (head == null)throw new NoSuchFieldError();
        E e = (E) head.element;
        head = head.next;
        if (head == null) tail = null;
        return e;
    }
    public E removeLast(){
        if (head == null)throw new NoSuchFieldError();
        E e = (E) tail.element;
        if (head.equals(tail)){
            head = tail = null;
        } else {
            Node<E> ptr = head;
            while (ptr.next != tail){
                ptr = ptr.next;
            }
            tail = ptr;
            tail.next= null;   
        }
        return e;
    }
    
    public E remove (int index){
        if (index < 0)
            throw new IndexOutOfBoundsException();
        else if (index == 0){
            E e = removeFirst();
            return e;
        }
        else
        {   if (head == null)
                throw new IndexOutOfBoundsException();
            int count = 0;
            Node<E> ptr = head;
            while (count < index-1){
                if (ptr.next == null)
                    throw new IndexOutOfBoundsException();
                count++;
                ptr = ptr.next;
            }
            E e =(E) ptr.next.element;
            ptr.next = ptr.next.next;
            return e;
        }
    }
    
    public boolean contains(E e){
        Node<E> ptr = head;
        while(ptr != null){
            if (ptr.element.equals(e))return true;
            ptr = ptr.next;
        }
        return false;
    }
    
    public E get(int index){
        if (index < 0)
            throw new IndexOutOfBoundsException();
        else if (index == 0){
            return (E)head.element;
        }
        else
        {   if (head == null)
                throw new IndexOutOfBoundsException();
            int count = 0;
            Node<E> ptr = head;
            while (count < index){
                if (ptr.next == null)
                    throw new IndexOutOfBoundsException();
                count++;
                ptr = ptr.next;
            }
            return (E)ptr.element;
        }
    }
    
    public E getFirst(){
        if (head == null)
            throw new NoSuchFieldError();
        return (E) head.element;
    }
    
    public E getLast(){
        if (tail == null)
            throw new NoSuchFieldError();
        return (E) tail.element;
    }
    
    public int indexOf(E e){
        Node<E> ptr = head;
        int count = 0;
        while(ptr != null){
            if (ptr.element.equals(e))return count;
            ptr = ptr.next;
            count++;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        Node<E> ptr = head;
        int count = 0;
        int index = -1;
        while(ptr != null){
            if (ptr.element.equals(e))index = count;
            ptr = ptr.next;
            count++;
        }
        return index;
    }
    
    public E set(int index, E e){
         if (index < 0)
            throw new IndexOutOfBoundsException();
        else if (index == 0){
            E copy = (E)head.element;
            head.element = e;
            return copy;
        }
        else
        {   if (head == null)
                throw new IndexOutOfBoundsException();
            int count = 0;
            Node<E> ptr = head;
            while (count < index){
                if (ptr.next == null)
                    throw new IndexOutOfBoundsException();
                count++;
                ptr = ptr.next;
            }
            E copy =(E)ptr.element;
            ptr.element = e;
            return copy;
        }
    }
    
    public void clear(){
        head  = null;
        tail = null;
    }
    public void print(){
        Node<E> ptr = head;
        while (ptr != null){
            System.out.print(ptr.element.toString() + " ");
            ptr = ptr.next;
        }
        System.out.println("");
    }
    public void reverse(){
        print(head);
        System.out.println("");
    }
    void print(Node<E> n){
        if (n == null)return;
        print(n.next);
        System.out.println(n.element.toString() + " ");
    }
    static class Node<E> {
        E element;
        Node<E> next;
        
        Node(){};
        Node(E e, Node<E> n){
            element = e;
            next = n;
        }
    }
    
    public E getMiddleValue(){
        Node<E> slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.element;
        
    }
    
}
