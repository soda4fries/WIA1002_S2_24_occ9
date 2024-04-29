/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
public class TestLinkedList {
    public static void main(String[] args) {
        
        MyLinkedList<String> list = new MyLinkedList<>();
        
        // a. Append elements
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        
        // b. Print all elements
        list.print();
        
        // c. Reverse all elements
        list.reverse();
        
        // d. Retrieve number of elements
        int size = list.size();
        
        // e. Retrieve first and last value
        String first = list.getFirst();
        String last = list.getLast();
        
        // f. Delete the third value
        list.remove(2);
        
        // g. Retrieve index locations
        int index2 = list.indexOf("b");
        int index3 = list.indexOf("c");
        
        // h. Check if the list has value 'c'
        boolean containsC = list.contains("c");
        
        // i. Replace items
        list.set(0, "j");
        list.set(1, "a");
        list.set(2, "v");
        list.set(3, "a");
    }
}

