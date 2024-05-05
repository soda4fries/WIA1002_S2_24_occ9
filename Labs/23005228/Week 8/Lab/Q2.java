/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabB;

/**
 *Q2
 * @author xinph
 */
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;

public class Q2 {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        
        String[] array1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] array2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        queue1.addAll(Arrays.asList(array1));
        queue2.addAll(Arrays.asList(array2));
        
        // Union
        PriorityQueue<String> unionQueue = new PriorityQueue<>(queue1);
        unionQueue.addAll(queue2);
        System.out.println("Union: " + unionQueue.toString());
        
        // Difference
        PriorityQueue<String> differenceQueue = new PriorityQueue<>(queue1);
        differenceQueue.removeAll(queue2);
        System.out.println("Difference: " + differenceQueue.toString());
        
        // Intersection
        Set<String> intersectionSet = new HashSet<>(queue1);
        intersectionSet.retainAll(queue2);
        PriorityQueue<String> intersectionQueue = new PriorityQueue<>(intersectionSet);
        System.out.println("Intersection: " + intersectionQueue.toString());
    }
}

