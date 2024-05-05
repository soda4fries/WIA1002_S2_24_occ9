/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.Q2;

import java.util.Scanner;

/**
 *
 * @author xinph
 */
public class Q2 <E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public Q2() {
    }

    public void add(E e) {
        if (tail == null) {
            head = tail = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void removeElement(E e) {
        if (size == 0) {
            throw new IllegalStateException();
        }

        Node<E> current;
        if (head.element.equals(e)) {
            current = head;
            head = head.next;
        }
        else {
            Node<E> previous = head;
            while (!previous.next.element.equals(e)) {
                previous = previous.next;
            }
            current = previous.next;
            previous.next = current.next;
        }
        size--;
        System.out.println(current.element);
    }

    public void printList() {
        Node<E> current = head;
        String separator = "";
        while (current != null) {
            System.out.print(separator + current.element);
            current = current.next;
            separator = ", ";
        }
        System.out.println(".");
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace(E e, E newE) {
        Node<E> current = head;
        while (!current.element.equals(e)) {
            current = current.next;
        }
        current.element = newE;
    }  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q2<String> singlyLinkedList = new Q2<>();

        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            singlyLinkedList.add(input);
        }

        System.out.println("\nYou have entered the following students' name :");
        singlyLinkedList.printList();

        System.out.println("\nThe number of students entered is : " + singlyLinkedList.getSize());

        while (true) {
            System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("r")) {
                System.out.println("\nEnter the existing student name that u want to rename :");
                String oldName = scanner.nextLine();

                if (singlyLinkedList.contains(oldName)) {
                    System.out.println("\nEnter the new name :");
                    String newName = scanner.nextLine();
                    singlyLinkedList.replace(oldName, newName);
                }
                else {
                    System.out.println("Student name does not exist! Please enter another name!");
                }
                break;
            }
            else if (input.equalsIgnoreCase("n")) {
                break;
            }
            else {
                System.out.println("Invalid Input! Enter 'r' or 'n' only!");
            }
        }
        System.out.println("\nThe new student list is :");
        singlyLinkedList.printList();

        while (true) {
            System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")) {
                System.out.println("\nEnter a student name to remove :");
                String remove = scanner.nextLine();
                if (singlyLinkedList.contains(remove)) {
                    singlyLinkedList.removeElement(remove);
                }
                else {
                    System.out.println("Student name does not exist! Please enter another name!");
                }
                break;
            }
            else if (input.equalsIgnoreCase("n")) {
                break;
            }
            else {
                System.out.println("Invalid Input! Enter 'y' for yes and 'n' for no!");
            }
        }

        System.out.println("\nThe number of updated student is :" + singlyLinkedList.getSize());

        System.out.println("The updated students list is :");
        singlyLinkedList.printList();

        System.out.println("\nAll the student data captured complete. Thank you!");
    }
}
