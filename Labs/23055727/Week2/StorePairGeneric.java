/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 * @param <V>
 * @param <K>
 */
public class StorePairGeneric<V extends Comparable<V>> implements Comparable<StorePairGeneric<V>> {
    private V first, second;
    @SuppressWarnings("unused")
    private V[] a;
    
    public StorePairGeneric(V first, V second) {
        this.first = first;
        this.second = second;
    }
    
    public V getFirst() {
        return first;
    }
    
    public V getSecond() {
        return second;
    }
    
    public void setPair(V first, V second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        else if (o == null || getClass() != o.getClass())
            return false;
        
        StorePairGeneric<?> other = (StorePairGeneric<?>) o;
        return first.equals(other.getFirst());
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(StorePairGeneric<V> o) {
        if (this == o)
            return 0;
        else if (o == null || getClass() != o.getClass())
            throw new IllegalArgumentException("Objects are not compatible");
        
        StorePairGeneric<?> other = (StorePairGeneric<?>) o;
        return this.first.compareTo((V)other.getFirst());
        
    } 

    public int compareTo(V o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Test {
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
        
        System.out.println(a.compareTo(c));
        System.out.println(b.equals(c));
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.equals(c));
    }
}
