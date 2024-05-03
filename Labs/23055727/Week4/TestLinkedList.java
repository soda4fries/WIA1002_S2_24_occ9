/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        
        list.print();
        list.reverse();
        
        System.out.println(list.lastIndexOf('e'));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
        list.remove(2);
        list.print();
        
        System.out.println(list.indexOf('b'));
        System.out.println(list.indexOf('d'));
        
        if(list.contains('c'))
            System.out.println("Has c");
        else
            System.out.println("does not have c");
        
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');
        
    }
}
