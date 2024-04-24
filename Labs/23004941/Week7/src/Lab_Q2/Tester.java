package Lab_Q2;
import Lab_Q1.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String list = sc.next();
        System.out.println("Is a Palindromic? " + isPalindromic(list));
    }
    public static boolean isPalindromic(String list) {
        MyQueue<Character> queue = new MyQueue<>();
        int mid = list.length()/2;
        for (int i= list.length()-1; i>= 0; i--) {
            queue.enqueue(list.charAt(i));
        }
        String output = "";
        while (!queue.isEmpty()) {
            output += queue.dequeue();
        }
        return output.equalsIgnoreCase(list);
    }


}
