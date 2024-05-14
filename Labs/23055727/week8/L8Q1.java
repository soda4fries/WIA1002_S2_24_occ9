package week8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class L8Q1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] numbers = {4,8,1,2,9,6,3,7};
        for (int number : numbers)
            queue.add(number);

        System.out.println(queue.toString());
        System.out.println("Removed first element: " + queue.poll());
        if (queue.add(5))
            System.out.println("Added new element : 5");
        Object[] newArray = queue.toArray();
        System.out.println("Priority queue as array:");
        for (Object element : newArray)
            System.out.println(element);
        System.out.println("First element in the queue" + queue.peek());
        if (queue.contains(1))
            System.out.println("Queue contains 1");
        else
            System.out.println("Queue does not contain 1");
        System.out.println("Queue current size: " + queue.size());

        System.out.println("Original sorting: " + queue);
        List<Integer> elements = new ArrayList<>(queue);
        PriorityQueue<Integer> reversed = new PriorityQueue<>(Collections.reverseOrder());
        reversed.addAll(elements);
        System.out.println("Reversed ordering: " + reversed);

        System.out.println("The queue will be emptied out using a while loop and .isEmpty()");
        while(!queue.isEmpty()){
            System.out.println(queue);
            queue.poll();
        }

    }
}
