package Lab;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 18/3/2024
 * Objective: Q3: Create generic class, equals and compareTo method.
 */

public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
 
    @Override
    public boolean equals(Object obj){
        StorePairGeneric<T> other = (StorePairGeneric<T>) obj;
        return this.first.equals(other.first);
        
    }
    
    public int compareTo(StorePairGeneric<T> other){
        return this.first.compareTo(other.first);
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
       
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}
    
    
