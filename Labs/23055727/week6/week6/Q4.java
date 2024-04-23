package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        MyStack<Character> s = new MyStack<>();

        s.push('r');
        s.push('a');
        s.push('c');
        s.push('e');
        s.push('c');
        s.push('a');
        s.push('r');

        if (isPalindrome(s))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not");
    }


    public static boolean isPalindrome(MyStack<Character> c){
        boolean x = false;

        MyStack<Character> d = c.clone();

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(d.toString());

        StringBuilder resultBuilder = new StringBuilder();
        while (matcher.find()) {
            resultBuilder.append(matcher.group());
        }
        
        String result = resultBuilder.toString();

        StringBuilder reverseBuilder = new StringBuilder();

        while (!d.isEmpty())
            reverseBuilder.append(d.pop());

        String reverse = reverseBuilder.toString();

        if (result.equals(reverse))
            x = true;
        
        

        return x;
    }
}
