
package LabA;
// Q1a
import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> list;

    // Constructor to initialize queue with elements from an array
    public MyQueue(E[] e) {
        list = new LinkedList<>();
        for (E item : e) {
            enqueue(item);
        }
    }

    // Default constructor
    public MyQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E getElement(int i) {
        return list.get(i);
    }

    public E peek() {
        return list.peek();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }
}
