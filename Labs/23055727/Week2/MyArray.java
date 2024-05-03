/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class MyArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane","Tom","Bob"};
        Character[] alphabets = {'a','b','c'};
        
        System.out.println(listAll(numbers));
        System.out.println(listAll(names));
        System.out.println(listAll(alphabets));
        
    }
    
    public static <E> String listAll(E[] array){
        String s = "Array Elements: ";
        for (E element : array)
            s += element + " ";
        return s;
    }
    
}
