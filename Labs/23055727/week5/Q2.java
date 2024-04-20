package week5;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        System.out.println("Enter your student namelist. Enter 'n' to end.....");
        while(true){
            String s = sc.nextLine();
            if (s.equals("n")){
                break;
            }
                
            list.add(s);
        }

        System.out.println("\nYou have entered the following students' name :");
        list.printList();
        System.out.println("\nThe number of students entered is :" + list.getSize());
        
        while (true){
            System.out.println("\nAre all the entered names correct? Enter 'r' to rename a student's name, or 'n' to proceed.");
            String s = sc.nextLine();
            if (s.equals("r")){
                String t;
                while (true){
                    System.out.println("\nEnter the existing student name that you want to rename :");
                    t = sc.nextLine();
                    if (list.contains(t))
                        break;
                    else
                        System.out.println("Please enter a valid name");
                }
                System.out.println("\nEnter the new name :");
                String u = sc.nextLine();
                list.replace(t, u);
                System.out.println("\nThe new student list is:");
                list.printList();
                break;
            } else if (s.equals("n"))
                break;
            else{
                System.out.println("\nInvalid Input!");
            }
        }

        while (true){
            System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes or 'n' to proceed");
            String s = sc.nextLine();
            if (s.equals("y")){
                String t;
                while (true){
                    System.out.println("\nEnter an existing student's name to remove :");
                    t = sc.nextLine();
                    if (list.contains(t))
                        break;
                }
                list.removeElement(t);
                System.out.println("\nThe number of updated student is :" + list.getSize());
                System.out.println("The updated students list is :");
                list.printList();
                break;
            } else if (s.equals("n")){
                System.out.println("\nThe number of students is :" + list.getSize());
                System.out.println("The final list of students is :");
                list.printList();
                break;
            }
            else
                System.out.println("\nInvalid Input!");
        }
        sc.close();
        System.out.println("\nALL student data captured complete. Thank you!");
    }
}

class SinglyLinkedList<E> {
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E e){
            item = e;
        }
        
    }

    Node<E> head, tail;
    int size;

    SinglyLinkedList(){
        head = tail = null;
        size = 0;
    }

    public void add(E e){
        if (head == null){
            head = new Node<>(e);
            head.next = null;
            tail = head;
            size++;
        }
        else {
            Node<E> n = new Node<>(e);
            tail.next = n;
            tail = n;
            size++;
        }
    }
    public void removeElement(E e){
        Node<E> ptr = head;
        if (head.item.equals(e)){
            head = head.next;
            if (head == null)
                tail = null;
            size--;
            return;
        }
        while (ptr.next != null){
            if(ptr.next.item.equals(e)){
                ptr.next = ptr.next.next;
                size--;
                return;
            }
            ptr = ptr.next;
        }
    }
    public void printList(){
        Node<E> ptr = head;
        while (ptr.next != null){
            System.out.print(ptr.item.toString() + ", ");
            ptr = ptr.next;
        }
        System.out.println(ptr.item.toString() + ". ");
    }
    public int getSize(){return size;}
    public boolean contains(E e){
        Node<E> ptr = head;
        while (ptr != null){
            if(ptr.item.equals(e)){
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }
    public void replace(E e, E newE){
        Node<E> ptr = head;
        while (ptr != null){
            if(ptr.item.equals(e)){
                ptr.item = newE;
                return;
            }
            ptr = ptr.next;
        }
    }
}

