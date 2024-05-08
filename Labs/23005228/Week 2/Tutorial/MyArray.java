package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 17/3/2024
 * Objective: Q2: Create array and generic method.
 */

public class MyArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Jane", "Tom", "Bob"};
        Character[] charArray = {'a', 'b', 'c'};
        
        listAll(intArray);
        listAll(strArray);
        listAll(charArray);
        
    }
    public static <T> void listAll(T[] array) {
        for (T value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
