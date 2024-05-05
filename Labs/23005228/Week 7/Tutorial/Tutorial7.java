
package Tutorial;

/**
1. Everyday Examples of a Queue:
- Supermarket checkout lines
- Waiting in line to board a bus or train
- Printer queue (printing jobs waiting in line)
- Ticket queues at amusement parks or movie theaters
- Difference between a Queue and Stack:

* 2. Queue:
- Follows the FIFO (First In, First Out) principle.
- Elements are inserted at the rear (enqueue) and removed from the front (dequeue).
   Stack:
- Follows the LIFO (Last In, First Out) principle.
- Elements are inserted and removed from the top of the stack.

3. Code Segment Analysis:
(a) Output for the input sequence true false false true true would be: 3 4 5 1 2
(b) No, it's not possible to have the output 1 3 5 4 2 because the elements are dequeued from the queue in the order they were enqueued, and the input sequence only affects whether a number is printed or enqueued.
(c) Input sequences that produce the output 1 2 3 4 5:
true true true true true
false false false false false
Any combination of true and false that results in all numbers being enqueued and then dequeued.

4. Hand Tracing Queue Operations:
After performing the given operations, the resulting queue X will contain the integers {5, 7, 9, 2, 4}.
(a) X.front(); will return 5.
(b) Y = X.dequeue(); X.enqueue(new Integer(10)); X.front(); will return 7.
(c) Y = X.dequeue(); will return 7.
(d) X.front(); will return 9.

5. Additional Operations for Linked List based Queue:
peek: Returns the element at the front of the queue without removing it.
contains: Checks if a certain element is present in the queue.
clear: Clears all elements from the queue.
 */

public class Tutorial7 {
    
}
