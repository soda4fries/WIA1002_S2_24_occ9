/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class Container<T> {
    private T t;
    
    public static void main(String[] args) {
        Container<Integer> i = new Container<>();
        Container<String> s = new Container<>();
        i.add(50);
        s.add("Java");
        
        System.out.println("Container 'i' contains: " + i.retrieve());
        System.out.println("Container 's' contains: " + s.retrieve());
    }
    
    Container(){};
    public void add(T t){
        this.t = t;
    }
    public T retrieve(){
        return t;
    }
    
}
