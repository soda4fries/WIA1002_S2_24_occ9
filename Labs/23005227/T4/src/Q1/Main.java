/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

/**
 *
 * @author panglang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1a
        MyLinkedList <Character> newList = new MyLinkedList<>();
        Node <Character> node1 = new Node<>('a');
        Node <Character> node2 = new Node <>('z');
        newList.head = node1;
        newList.tail = node2;
        
        //1c
        node1.next = node2;
        
        newList.addLast('c');
        newList.add(3,'d');
        newList.remove(1);
        
        
        
    }
    
}
