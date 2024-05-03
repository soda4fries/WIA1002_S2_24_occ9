/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 * @param <E>
 */
public class MyGeneric<E> {
    E e;
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>(25);
        
        strObj.setE("Hello, World");
        
        System.out.println(strObj.getE() + " " + intObj.getE());
    }
    
    MyGeneric(){
         
     }
     MyGeneric(E e){
         this.e = e;
     }
     E getE(){
         return e;
     }
     void setE (E e){
         this.e = e;
     }
    
}
