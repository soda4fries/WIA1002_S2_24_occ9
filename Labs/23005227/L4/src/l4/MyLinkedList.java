/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

/**
 *
 * @author panglang
 */
public class MyLinkedList <E>{
    Node <E> head;
    Node <E> tail;
    private int size = 0;

    public MyLinkedList() {
    }
    
    public void addFirst(E e){
        Node <E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }
       
    public void addLast(E e){
        if (tail == null){
            head = tail = new Node<>(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
        
    public void add(int index, E e){
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node <E> current = head;
            for (int i=0; i<index; i++)
                current = current.next;
            Node <E> temp = current.next;
            current.next = new Node<>(e);
            current.next.next = temp;
            size++;
        }
    }
        
    public E removeFirst(){
        if (size == 0) return null;
        else {
            Node <E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }
        
    public E removeLast(){
        if (size == 0) return null;
        else if (size == 1){
            Node <E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node <E> current = head;
            for (int i=0; i<size-2; i++)
                current = current.next;
            Node <E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        } 
    }
    
    public E remove(int index){
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size -1) return removeLast();
        else {
            Node <E> previous = head;
            for (int i=0; i<index; i++)
                previous = previous.next;
            Node <E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public boolean contains(E e){
        for (Node <E> current = head; current != null; current = current.next){
            if (current.element.equals(e)){
                return true;
            }
        }
        return false;
    }        
        
    public E get(int index){
        if (index < 0 || index > size){
            return null;
        }
        Node <E> current = head;
        for (int i=0; i<index; i++){
            current = current.next;
        }
        return current.element;
    }
    
    public E getFirst(){
        if (head == null)
            return null;
        return head.element;
    }
    
    public E getLast(){
        if (tail == null)
            return null;
        return tail.element;
    }
    
    public int indexOf(E e){
        int i = 0;
        for (Node <E> current = head; current != null; current = current.next){
            if (current.equals(e))
                return i;
            i++;
        }
        return -1;   
    }
    
    public int lastIndexOf(E e){
        int index = -1;
        int i = 0;
        if (e == null){
            for (Node <E> current = head; current != null; current = current.next){
                if (current.element == e)
                    index = i;
                i++;
            }
            return i;
        } else {
            for (Node <E> current = head; current != null; current = current.next){
                if (current.element.equals(e))
                    index = i;
                i++;
            }
        } return i;
    }
    
    public E set(int index, E e){
        if (index < 0 || index > size){
            return null;
        }
        Node <E> current = head;
        for (int i=0; i<index; i++){
            current = current.next;
        }
        E oldValue = current.element;
        current.element = e;
        return oldValue; 
    }
    
    public void clear(){
        head = tail = null;
        size = 0;
    }
    
    public void print(){
        String s = "";
        for (Node <E> current = head; current != null; current = current.next){
            System.out.print(current.element + " ");
        } System.out.println("");
    }
    
    public void reverse(){
        String s = "";
        for (Node <E> current = head; current != null; current = current.next){
            s = current.element + " " + s;
        } System.out.println(s);
    }
    
    
    
    public E getMiddleValue(){
        //fast is 2x speed of slow, when fast reaches the end, slow will be in the middle
        if (head == null)
            return null;
        
        Node <E> fast = head;
        Node <E> slow = head;
        
        if (head.next == null){
            return head.element;
        }
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.element;
        
        /*
        int index = size / 2;
        Node <E> current = head;
        for (int i=0; i<index; i++){
            current = current.next;
        } 
        return current.element;
        */
    }
    
    
    
    
    
    public static boolean detectLoop(Node head){
        // Add code here
        Node fast = head;
        Node slow = head;
        
       while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    
    int getNthFromLast(Node <E> head, int n){
    	// Your code here
    	int count = 0;
    	Node <E> temp = head;
    	while (temp.next != null){
    	    count++;
    	    temp=temp.next;
    	}
    	n = count-n+1;
    	if (n<0){
    	    return -1;
    	}
    	while (n != 0){
    	    head = head.next;
    	    n--;
    	} 
    	return head.element;
    }
    
    //https://youtu.be/D7y_hoT_YZI?si=YphpRIpKQOTSXxHi
    Node reverseList(Node head)
    {

        Node prev = null; // Previous node initially null
        Node current = head; // Current node initially head
        
        // Traverse through the linked list
        while (current != null) {
            Node nextNode = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current node
            current = nextNode; // Move current to next node
        }
        
        // Update head to the last node (prev)
        head = prev;
        
        return head; // Return the new head of the reversed list
    }
    
    Node removeDuplicates(Node head){
	// Your code here	
	    if (head == null || head.next == null){
	        return head;
	    }
	    
	    Node current = head; 
	    while (current != null && current.next != null){
	        if (current.element == current.next.element){
	            current.next = current.next.next;
	        } else {
	            current = current.next;
	        }
	    } 
	    return head;
    }
    
    public Node removeDuplicates(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        seen.add((Integer) head.element);
        Node current = head;

        while (current.next != null) {
            if (seen.contains(current.next.element)) {
                current.next = current.next.next;
            } else {
                seen.add((Integer) current.next.element);
                current = current.next;
            }
        }
        return head;
    }
    
    //delete node of x
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	    if (head == null) return null;
	    
	    if (head.data == x) return head.next;

        Node current = head;
        while (current.next != null && current.next.data != x){
            current = current.next;
        }
        
        if (current.next.data == x){
            current.next = current.next.next;
        }
        
        return head;
    }
    
    boolean isCircular(Node head)
    {
        if (head == null){
            return true;
        }
	    // Your code here	
	    Node current = head;
	    while (current.next != null){
	        current = current.next;
	        if (current.next == head){
	            return true;
	        }
	    }
	    
	    return false;

    }
}
