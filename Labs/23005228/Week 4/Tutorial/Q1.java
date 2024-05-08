/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;


/**
 *
 * @author xinph
 */
public class Q1 {
    public static void main(String[] args) {
        // 1a
        MyLinkedList<Character> newList = new MyLinkedList<>();
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        newList.head = node1;
        newList.tail = node2;
        
        // 1c
        node1.next = node2;
        
        // 1d
        Node<Character> firstNode;
        newList.addFirst('0');
        
        // 1h
        newList.addLast('c');
        newList.add(3,'d');
        newList.removeFirst();
        newList.removeLast();
        newList.remove(1);

    }
    
}
