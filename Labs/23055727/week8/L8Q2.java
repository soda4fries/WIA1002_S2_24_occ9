package week8;

import java.util.*;

public class L8Q2 {
    public static void main(String[] args) {
        // Priority Queues initialization
        PriorityQueue<String> pq1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        // Convert PriorityQueues to Sets to perform set operations
        Set<String> set1 = new HashSet<>(pq1);
        Set<String> set2 = new HashSet<>(pq2);

        // Union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Difference
        Set<String> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        Set<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);

        // Print results
        System.out.println("Priority Queue 1: " + pq1);
        System.out.println("Priority Queue 2: " + pq2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (Set1 - Set2): " + difference1);
        System.out.println("Difference (Set2 - Set1): " + difference2);
    }
}

