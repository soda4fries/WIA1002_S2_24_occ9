/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author xinph
 */
import java.util.*;
public class Tutorial7b {
    /*1. 
    Queue:
    - Queue is a linear data structure
    - Follows First In First Out (FIFO) algorithm to serve the elements
    - Enqueue and dequeue done in O(1)
    - Used in algorithms such as Breadth First Search.
    
    Priority Queue:
    - Priority Queue is an extension of Queue with priority factor embedded
    - Serves the element with higher priority first
    - Enqueue and dequeue done in O(log n) using binary heaps
    - Used in algorithms such as Dijkstra’s Algorithm, Prim’s Algorithms, CPU Scheduling
    */
    
    /*
    2. Three real life example using priority queue:
    - Operating systems scheduling processes based on their priority levels
    - Airport security check-in queues where first-class passengers have higher priority
    - Emergency room triage in hospitals, where patients with more critical conditions are treated first
    */
    
    /*
    3. Output
    peek() gives us: C++
    The queue elements:
    C++
    Fortran
    Java
    Python
    After poll():
    Fortran
    Python
    Java
    After remove():
    Fortran
    Python
    Priority queue contains Ruby or not?: false
    Value in array: 
    Value: Fortran
    Value: Python
    */
    
    public static void main(String args[]){
        
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        
        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");
        
        System.out.println("peek() gives us: "+ pQueue.peek()); //(a)
        System.out.println("The queue elements:"); //(b)
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next()); //(b)
        pQueue.poll();
        System.out.println("After poll():"); //(c)
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next()); //(c)
        pQueue.remove("Java");
        System.out.println("After remove():"); //(d)
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next()); //(d)
        boolean b = pQueue.contains("Ruby");
        System.out.println ( "Priority queue contains Ruby or not?: " + b); //(e)
        Object[] arr = pQueue.toArray();
        System.out.println ( "Value in array: "); //(f)
        for (int i = 0; i<arr.length; i++)
            System.out.println ( "Value: " + arr[i].toString()) ;
    }
}
/*
4.
a) compares strings based on their lengths
b) output:
   Ali
   Jason
   Muhamad
*/
