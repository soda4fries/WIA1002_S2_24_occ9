package week7;

import java.util.LinkedList;

public class MyQueue <E extends Comparable<E>> {

    public static void main(String[] args) {

        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});
        String[] toAdd = {"Apple", "Orange", "Grapes", "Cherry"};
        for (String fruit : toAdd)
            fruitQ.enqueue(fruit);
        System.out.println("Fruit Queue Contents:\n" + fruitQ);
        System.out.println("The top item is: " + fruitQ.peek());
        System.out.println("The size of the queue is: " + fruitQ.getSize());
        System.out.println("The following fruit has been dequeued: " + fruitQ.dequeue());
        System.out.println("The item at index 2 is: " + fruitQ.getElement(2));
        System.out.println("Does the queue contain Cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Does the queue contain Durian? " + fruitQ.contains("Durian"));
        if (fruitQ.isEmpty())
        System.out.println("Queue is Empty :(");
        else
        System.out.println("Queue is not empty\n" + fruitQ);

// i. Check whether the queue consists of Durian
// j. Display the queue using the isEmpty() condition.

    }

    private LinkedList<E> list = new LinkedList<>();

    public MyQueue(E[] e) {
        for (E item : e)
            list.add(item);
    }

    public MyQueue(){
        return;
    }
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public E getElement(int i){
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String tostring(){
        return "Queue:\n" + list.toString();
    }
    
        
}
