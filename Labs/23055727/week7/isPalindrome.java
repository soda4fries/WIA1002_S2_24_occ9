package week7;

import java.util.LinkedList;

public class isPalindrome {
    public static void main(String[] args) {
        boolean n = checkForPalindrome("null");
        boolean r = checkForPalindrome("raCecar");
        if (n){
            System.out.println("null is a palindrome");
        } else { System.out.println("null is not a palindrome");}
        if (r) {
            System.out.println("raCecar is a palindrome");
        } else {System.out.println("raCecar is not a palindrome");}

    }

    static boolean checkForPalindrome(String s){
        MyQueue<Character> q = new MyQueue<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            q.enqueue(s.charAt(s.length()-1-i));
        }
        int i = 0;
        while (!q.isEmpty()){
            if (q.dequeue() != s.charAt(i++))
                return false;
        }
        return true;

    }
}


class MyQueue <E extends Comparable<E>> {


    private LinkedList<E> list = new LinkedList<>();

    public MyQueue(E[] e) {
        for (E item : e)
            list.add(item);
    }

    public MyQueue(){
        return;
    }
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public E getElement(int i){
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String tostring(){
        return "Queue:\n" + list.toString();
    }
    
        
}
