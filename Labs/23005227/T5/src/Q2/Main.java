/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author panglang
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList <Character> list = new DoublyLinkedList<>();
        list.addFirst('a');
        list.add(1, 'b');
        list.addLast('c');
        list.addLast('z');
        
        list.print();
    }
}
