/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;
import java.util.ArrayList;
/**
 * Q1a
 * @author xinph
 */
public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();
    
    public void push(E o) {
        list.add(o);   
    }
    
    public E pop() {      
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;    
    }
    
    public E peek() {
        return list.get(getSize() - 1);   
    }
    
    public int getSize() {
        return list.size();   }

    public boolean isEmpty() {
        return list.isEmpty();  
    }
  
    @Override
    public String toString() {
       return "stack: " + list.toString();
    }
    
    public boolean search (E o){    
        return list.contains(o);
    }

    public E get(int i) {
        if (i >= 0 && i < getSize()) {
            return list.get(i);
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + getSize());
        }
    }
}
