/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.Q3;

/**
 *
 * @author xinph
 */
public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(10);
        doublyLinkedList.add(2, 2);
        doublyLinkedList.addLast(100);
        doublyLinkedList.remove(3);//cannot remove index of 3 if no add 100

        System.out.println();
        doublyLinkedList.iterateForward();
        System.out.println("");
        doublyLinkedList.iterateBackward();

        System.out.println("\nsize of current Doubly Linked List: " + doublyLinkedList.size());
        System.out.println("succesfully clear 3 node(s)");
        doublyLinkedList.clear();

        System.out.println("\nsize of current Doubly Linked List: " + doublyLinkedList.size());
    }
}
