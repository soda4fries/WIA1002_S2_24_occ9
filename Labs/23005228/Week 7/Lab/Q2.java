package LabA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!queue.isEmpty()) {
            reversed.append(queue.remove());
        }

        return str.equals(reversed.toString());
    }
}

