package Lab_Q1;

import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> {
    private LinkedList<E> list;
    public MyQueue() {
         list = new LinkedList<>();
    }
    public MyQueue(E[] e) {
        list = new LinkedList<>();
        for (E value : e) {
            list.addLast(value);
        }
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
        return list.getFirst();
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
    @Override
    public String toString() {
        return list.toString();
    }
}
