package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 17/3/2024
 * Objective: Q1: Create generics class and method.
 */

public class Container <T> {
    
    public Container(){  
    }
    
    private T t;
    
    public void add(T s){
        this.t = s;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container <Integer> integer = new Container <> ();
        Container <String> str = new Container <> ();
        integer.add(50);
        str.add("Java");
        System.out.println(integer.retrieve());
        System.out.println(str.retrieve());      
    }
   
}
