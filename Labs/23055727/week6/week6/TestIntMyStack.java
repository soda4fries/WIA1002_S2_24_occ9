package week6;

import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        MyStack<Integer> stack = new MyStack<>();

        for (int j = 1; j <= i; j++)
            stack.push(j);
        
        System.out.println(stack);

        while(!stack.isEmpty())
            System.out.println(stack.pop());
        
            sc.close();
    }
}
