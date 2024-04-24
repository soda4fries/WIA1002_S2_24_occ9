package week6;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack);
        if(stack.search('b'))
            System.out.println("'b' is in the stack");
        else
            System.out.println("'b' is not in the stack");
        if(stack.search('k'))
            System.out.println("'k' is in the stack");
        else
            System.out.println("'k' is not in the stack");
        System.out.println();

        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2);
        if (stack2.search(6))
            System.out.println("6 is in the stack");
        else
            System.out.println("6 is not in the stack");
    }
}
