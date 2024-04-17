/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author panglang
 */
public class ArrayBagDemo {
    public static void main(String[] args) {
        ArrayBag <String> bag1 = new ArrayBag<>();
        ArrayBag <String> bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
                   
        System.out.println("bag1:");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);       
        
        System.out.println("\nbag2:");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);
        
        System.out.println("\nbag3, test the method union of bag1 and bag2:");
        //assign methods to array
        ArrayBag <String> bag3 = (ArrayBag<String>) bag1.union(bag2);
        displayBag(bag3);
        
        System.out.println("\nbag4, test the method intersection of bag1 and bag2:");
        ArrayBag <String> bag4 = (ArrayBag<String>) bag1.intersection(bag2);
        displayBag(bag4);
        
        System.out.println("\nbag5, test the method difference of bag1 and bag2:");
        ArrayBag <String> bag5 = (ArrayBag<String>) bag1.difference(bag2);
        displayBag(bag5);
    }
    
    private static void testAdd(BagInterface <String> aBag, String[] content){
        System.out.print("Adding ");
        for (String s : content){
            aBag.add(s);
            System.out.print(s + " ");
        }
        System.out.println("");
    }
    
    private static void displayBag(BagInterface<String> aBag){
        Object[] content = aBag.toArray();
        System.out.printf("The bag contains %s string(s), as follows: \n",content.length);
        for (Object item : content){
            System.out.print(item + " ");
        }
        System.out.println("");
    }
    
}
