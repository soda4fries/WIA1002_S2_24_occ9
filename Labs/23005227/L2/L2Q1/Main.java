package L2Q1;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generate 20 non-duplicate integer within 0-100");
        
        int n = 20; // Set the number of non-duplicate integers to generate
        NonDuplicate nonDuplicate = new NonDuplicate(n);

        // Using LinkedList
        System.out.println("Linked List Implementation ");
        LinkedList<Integer> linkedList = nonDuplicate.linked(n);
        System.out.println(linkedList);

        // Using ArrayList
        System.out.println("Array Implementation ");
        ArrayList<Integer> arrayList = nonDuplicate.array(n);
        System.out.println(arrayList);
        
    }
}



    
