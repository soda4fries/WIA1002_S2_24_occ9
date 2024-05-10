/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabB;

/**
 * Q1
 * @author xinph
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q1 {
    
    public static void main(String[] args) {
        
        int[] intArray = {4, 8, 1, 2, 9, 6, 3, 7};
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        System.out.print("Original array: ");
        for(int i = 0; i < intArray.length; i++){
            priorityQueue.offer(intArray[i]);
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        // toString()
        System.out.println("Display all elements: " + priorityQueue.toString());

        // poll()
        System.out.println("Retrieve and remove first element: " + priorityQueue.poll());
        
        // add()
        priorityQueue.add(5);
        System.out.println("Add new element 5: " + priorityQueue.toString());
        
        // toArray()
        Object[] array = priorityQueue.toArray();
        System.out.println("Convert to array: " + Arrays.toString(array));
        
        // peek()
        System.out.println("Retrieve first element: " + priorityQueue.peek());
        
        // contains()
        System.out.println("Is the queue contains element 1: " + priorityQueue.contains(1));
        
        // size()
        System.out.println("Size: " + priorityQueue.size());
        
        // isEmpty()
        System.out.println("Remove elements until empty:");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removing: " + priorityQueue.poll());
        }
        
        // Sort in reverse order
        priorityQueue.clear(); // Clear the PriorityQueue
        
        // Insert elements from intArray to priorityQueue
        for(int i = 0; i < intArray.length; i++){
            priorityQueue.offer(intArray[i]);
        }
        
        // Create a reverse sorted PriorityQueue
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        // Transfer elements from priorityQueue to reversePriorityQueue
        reversePriorityQueue.addAll(priorityQueue);
        
        System.out.println("Reverse Sorted Priority Queue: " + reversePriorityQueue.toString());
    }
}


