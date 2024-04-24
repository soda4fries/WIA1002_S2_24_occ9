package week5;

import java.util.NoSuchElementException;

public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<>();
        dlist.addFirst(1);
        dlist.addLast(10);
        dlist.addLast(100);
        dlist.add(2, 2);
        dlist.remove(3);
        dlist.iterateForward();
        dlist.iterateBackward();
        System.out.println("size of current Doubly Linked List: " + dlist.size);
        dlist.clear();

        System.out.println("size of current Doubly Linked List: " + dlist.size);

    }
}

class DoublyLinkedList<E> {
    private static class Node<E>{
        E item;
        Node<E> next, prev;

        Node(E e, Node<E> n, Node<E> p){
            item = e;
            next = n;
            prev = p;
        }
        @SuppressWarnings("unused")
        Node (E e){item = e;}
    }

    Node<E> head, tail;
    int size;

    DoublyLinkedList(){
        head = tail = null;
        size = 0;
    }

    public void addFirst(E element){
        Node<E> tmp = new Node<>(element, head, null);
        if (head!= null) {head.prev = tmp;}
        head = tmp;
        if (tail == null) {tail = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
    public void addLast(E element){
        Node<E> tmp = new Node<>(element, null, tail);
        if (tail!=null) {tail.next = tmp;}
        tail = tmp;
        if (head==null) {head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
    public void add(int index, E element){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index==0)
            addFirst(element);
        else if (index==size)
            addLast(element);
        else{
            Node<E> temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            Node<E> insert = new Node<>(element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        }
    }
    public void iterateForward(){
        System.out.println("iterating forward..");
        Node<E> tmp = head;
        while(tmp != null){
            System.out.print(tmp.item + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public void iterateBackward(){
        System.out.println("iterating backward..");
        Node<E> tmp = tail;
        while(tmp != null){
            System.out.print(tmp.item + " ");
            tmp = tmp.prev;
        }
        System.out.println();
    }
    public E removeFirst() {
        if (size==0) throw new NoSuchElementException();
        Node<E> tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.item);
        return tmp.item;
    }
    public E removeLast() {
        if (size==0) throw new NoSuchElementException();
        Node<E> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.item);
        return tmp.item;
    }
    public E remove(int index){
        E element = null;
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) element = removeFirst();
        else if (index == size-1) element = removeLast();
        else{
            Node<E> temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            element = temp.item;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next =null;
            temp.prev = null;
            size--;
        }
        return element;
    }
    public void clear(){
        Node<E> temp = head;
        while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
    }

}
