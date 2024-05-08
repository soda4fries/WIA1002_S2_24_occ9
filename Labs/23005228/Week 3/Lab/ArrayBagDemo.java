package Lab;

import Lab.ArrayBag;
import Lab.BagInterface;
import java.util.Arrays;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 25/3/2024
 * Objective: Write a test program ArrayBagDemo.java to test the core methods add,
              getCurrentSize() and toArray of the class ArrayBag, and the three methods that you
              implemented in Question 2 to 4 (i.e. union, intersection and difference).
 */

public class ArrayBagDemo {
    public static void main(String[] args) {
        // Create two empty ArrayBag objects
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();

        // Fill bag1 and bag2 with a list of strings using testAdd method
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};


        // Display the contents of bag1 and bag2
        System.out.println("bag1:");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        
        System.out.println("\nbag2:");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        

        // Test the method union
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("\nbag3, test the method union of bag1 and bag2:");
        displayBag(bag3);

        // Test the method intersection
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("\nbag4, test the method intersection of bag1 and bag2:");
        displayBag(bag4);

        // Test the method difference
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("\nbag5, test the method difference of bag1 and bag2:");
        displayBag(bag5);
    }

    // Test the method add of ArrayBag
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        System.out.print("Adding ");
        for (String entry : content) {
            if (aBag.add(entry)) {
                System.out.print(entry + " ");
            } else {
                System.out.println("\nUnable to add " + entry + " to the bag.");
            }
        }
        System.out.println();
    }

    // Test the methods getCurrentSize() and toArray of ArrayBag
    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
        for (String entry : aBag.toArray()) {
            System.out.print(entry + " ");
        }
        System.out.println("\n");
    }
}