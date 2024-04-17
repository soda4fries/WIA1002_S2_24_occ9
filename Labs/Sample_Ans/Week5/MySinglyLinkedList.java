import java.util.*;

public class MySinglyLinkedList<E> implements List<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;




    private static class Node<E> {
        E item;
        Node<E> next;


        Node(Node<E> next, E item) {
            this.next = next;
            this.item = item;
        }
    }
    MySinglyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void addFirst(E e) {
        if (isEmpty()) {
            head = tail = new Node<E>(null, e);
        } else {
            head = new Node<E>(head, e);
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        if (isEmpty()) {
            head = tail = new Node<E>(null, e);
        } else {
            tail.next =new Node<>(null, e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> current = head;
            int currIndex = 0;
            while (currIndex<index-1) {
                current=current.next;
                currIndex++;
            }
            current.next = new Node<>(current.next, e);
            size++;
        }

    }

    @Override
    public E removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        E copy = head.item;
        head = head.next;
        size--;
        if (isEmpty()) head=tail=null;
        return copy;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        E copy = tail.item;
        if (size == 1) {
            head = tail = null;
        } else {
            Node<E> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        size--;
        return copy;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) return removeFirst();
        if (index == size-1) return removeLast();
        Node<E> current = head;
        int currIndex = 0;
        while (currIndex < index-1) {
            current = current.next;
            currIndex++;
        }
        E copy = current.next.item;
        current.next = current.next.next;
        size--;
        return copy;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.item.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node<E> current = head;
        int currIndex = 0;
        while (currIndex < index) {
            current = current.next;
            currIndex++;
        }
        return current.item;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        return head.item;
    }

    @Override
    public E getLast() {
        if (isEmpty()) throw new NoSuchElementException();
        return tail.item;
    }

    @Override
    public int indexOf(E e) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.item.equals(e)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.item.equals(e)) lastIndex = index;
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    @Override
    public E set(int index, E e) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node<E> current = head;
        int currIndex = 0;
        while (currIndex < index) {
            current = current.next;
            currIndex++;
        }
        E copy = current.item;
        current.item = e;
        return copy;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void printReverse() {
        printReverse(head);
        System.out.println();
    }

    public void printReverse(Node<E> current) {
        if (current == null) return;
        printReverse(current.next);
        System.out.print(current.item + " ");
    }

    @Override
    public void reverseList() {
        Node<E> current = head;
        Node<E> prev= null;
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
    public E getMiddle() {
        Node<E> slow = head;
        Node<E> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow.item;
    }
}
