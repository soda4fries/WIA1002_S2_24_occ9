/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class FindMax {
    public static void main(String[] args) {
        String[] s = {"a", "z", "Hello, World", "zz"};
        Integer[] i = {0,1,-1};
        
        System.out.println(FindMax.max(i));
        System.out.println(FindMax.max(s));
        
    }
    
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (E element : list)
            if (max.compareTo(element) < 0)
                max = element;
        return max;
        
    }
}

@SuppressWarnings("rawtypes")
class Circle<V extends Comparable<V>> implements Comparable {
    V radius;
    Circle(V v){
        radius = v;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(Object o) {
        if (this == o)
            return 0;
        else if (o == null || getClass() != o.getClass())
            throw new IllegalArgumentException("Not comparing two Circles");
        Circle<?> c = (Circle<?>) o;
        return radius.compareTo((V)c.radius);
    }
    
}
