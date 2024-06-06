package Lab_Q1;

public class Tester {
    public static void main(String[] args) {
        String[] list1 = {"Durian", "Blueberry"};
        String[] list2 = {"Apple", "Orange", "Grapes", "Cherry"};
        // a)
        MyQueue<String> queue = new MyQueue<>(list1);

        // b)
        for (String fruits : list2) {
            queue.enqueue(fruits);
        }

        // c)
        System.out.println("Queue: " + queue);

        // d)
        System.out.println("Top element: " + queue.peek());

        // e)
        System.out.println("Size: " + queue.getSize() );

        // f)
        queue.dequeue();
        System.out.println("Queue: " + queue);

        // g)
        System.out.println("Element on position 2: " + queue.getElement(2));

        // h)
        System.out.println("Check 'Cherry': " + queue.contains("Cherry"));

        // i)
        System.out.println("Check 'Durian': " + queue.contains("Durian"));

        // j)
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}
