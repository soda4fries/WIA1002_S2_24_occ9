/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab.SList;

/**
 *
 * @author xinph
 */
public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Append a new element at the end of the list.
    public void appendEnd(E e) {
        if (tail == null) {
            tail = head = new SNode<>(e);
        }
        else {
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }

    // Eliminate the first element in the list.
    public E removeInitial() {
        if (size == 0) {
            return null;
        }

        SNode<E> temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp.element;
    }

    // Search for an element and returns true if this list contains the searched element
    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if ((current.element).equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Empty all elements in the list and return a statement that reports that the list is empty.
    public void clear() {
        while (size > 0) {
            removeInitial();
        }
    }

    // Display all values from the list in a successive order.
    public void display() {
        SNode<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        SList<String> sList = new SList<>();

        // Append the following values individually: “Linked list, is, easy.”
        sList.appendEnd("Linked list");
        sList.appendEnd("is");
        sList.appendEnd("easy");

        // Display these values.
        sList.display();

        // Remove the word “Linked list” and display the removed value.
        System.out.println("Removed value: " + sList.removeInitial());

        // Check if ‘difficult’ is in the list.
        System.out.println("Is 'difficult' in list? " + sList.contains("difficult"));

        // Clear the list.
        sList.clear();
        System.out.println("Clear list:");
        sList.display();
    }
}
