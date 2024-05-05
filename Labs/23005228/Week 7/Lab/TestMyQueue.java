package LabA;
// Q1b
public class TestMyQueue {
    public static void main(String[] args) {
        // a. Initialize queue
        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});

        // b. Add new items
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        // c. Display the queue
        System.out.println("Queue: " + fruitQ);

        // d. Show top item
        System.out.println("Top item: " + fruitQ.peek());

        // e. Get queue size
        System.out.println("Queue size: " + fruitQ.getSize());

        // f. Delete Durian
        fruitQ.dequeue();

        // g. Get item at index 2
        System.out.println("Item at index 2: " + fruitQ.getElement(2));

        // h. Check if queue contains Cherry
        System.out.println("Contains Cherry: " + fruitQ.contains("Cherry"));

        // i. Check if queue contains Durian
        System.out.println("Contains Durian: " + fruitQ.contains("Durian"));

        // j. Display queue using isEmpty() condition
        System.out.println("Queue is empty: " + fruitQ.isEmpty());
    }
}
