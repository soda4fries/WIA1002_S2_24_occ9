/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

/**
 *
 * @author panglang
 */
public class TestLinkedList {
    public static void main(String[] args) {
        //a. Append the following : a, b, c, d, e
        MyLinkedList <Character> l = new MyLinkedList<>();
        for (char i='a'; i<='e'; i++)
            l.addLast(i);
        
        //b. Print all the elements in the list. 
        l.print();
        
        //c. Reverse all the elements in the list. 
        l.reverse();
        
        //d. Retrieve the number of elements in the list.
        int size = l.lastIndexOf(l.getLast());
        System.out.println("Size of the list: " + size);
        
        //e. Retrieve the first and last value.
        System.out.println("First value: " + l.getFirst());
        System.out.println("Last value: " + l.getLast());
        
        System.out.println("Middle value of the list: " + l.getMiddleValue());
        
        //f. Delete the third value.
        System.out.println("List after removing element index 3");
        l.remove(3);
        l.print();
        
        //g. Retrieve the index location for the second and third value
        System.out.println("Second value: " + l.get(1));
        System.out.println("Third value: " + l.get(2));
        
        //h. Checks if the list has the value ‘c’
        System.out.println("List contains character \'c\' : " + l.contains('c'));
        
        //Replace the items individually with the following: j,a,v,a
        l.set(0, 'j');
        l.set(1, 'a');
        l.set(2, 'v');
        l.set(3, 'a');
        l.print();
        System.out.println("Middle value of the list: " + l.getMiddleValue());
        
    }
    
}
