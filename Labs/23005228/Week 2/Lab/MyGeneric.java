package Lab;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 18/3/2024
 * Objective: Q1: Create generic class.
 */

public class MyGeneric <T> {
    private T e;
    
    public MyGeneric(){
        
    }
    
    public MyGeneric(T e){
        this.e = e;
    }
    
    public void setE(T e){
        this.e = e;
    }

    public T getE() {
        return e;
    }
    
    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric <> ();
        MyGeneric <Integer> intObj = new MyGeneric <> ();
        strObj.setE("Number of students in class: ");
        intObj.setE(25);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
    
    
    
}
