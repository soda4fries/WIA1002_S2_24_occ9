package week6;

import java.util.ArrayList;

public class MyStack<E> implements Cloneable {
    ArrayList<E> stack = new ArrayList<>();

    public void push(E o){
        stack.add(o);
    }

    public E pop(){
        E o = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return o;
    }

    public E peek(){
        return stack.get(stack.size()-1);
    }

    public int getSize(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public boolean search(E o){
        return stack.contains(o);
    }
    @SuppressWarnings("unchecked")
    @Override
    public MyStack<E> clone() {
        try {
            MyStack<E> clonedStack = (MyStack<E>) super.clone();
            clonedStack.stack = (ArrayList<E>) this.stack.clone();
            return clonedStack;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should not happen
        }
    }
    @Override
    public String toString(){
        return stack.toString();
    }
}
