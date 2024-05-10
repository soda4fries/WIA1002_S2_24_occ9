/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author xinph
 */
public class Q3 {
    
    private Node3 head;
    private Node3 tail;
    private int size;
    
    public Q3() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addLast(char data){
        //1. create object tmp and set pointer of the previous node
        Node3 tmp = new Node3(data, null, tail);
        
        //2. set tail.next point to object tmp
        if(tail != null) {
            tail.next = tmp;
        }
        
        //3. now tmp become tail
        tail = tmp;
        
        //4. if no head, then tmp set to be a head
        if(head == null) { 
            head = tmp;
        }
        
        size++;//5. increase number of node
        System.out.println("adding: "+data);
    }
    
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        Node3 tmp = head;
        while(tmp != null){
            System.out.print(tmp.data);
            System.out.print(" ");
            tmp = tmp.next;
        }
    }
    
    class Node3 {
        char data;
        Node3 next;
        Node3 prev;
    
        public Node3(char data, Node3 next, Node3 prev) {
            this.data = data;
            this.next = null;
            this.prev = null;
        
        }
    }
    
    public static void main(String[] args) {
        Q3 list = new Q3();
        char[] existingList = {'a', 'b', 'c'};
        for (char data : existingList) {
            list.addLast(data); // Add each character from the existing list
        }
        list.addLast('z');
        list.iterateForward();
    }
}
