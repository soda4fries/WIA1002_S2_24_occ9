/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author panglang
 */
public class TestSList {
    public static void main(String[] args) {
        SList <String> list = new SList<>();
        list.appendEnd("Linked list");
        list.appendEnd("is");
        list.appendEnd("easy");
        list.display();
        
        System.out.println("");
        list.removeInitial();
        list.display();
        
        System.out.println("The list contains \'difficult\': " + list.contains("difficult"));
        
        list.clear();
        list.display();
    }
    
}
