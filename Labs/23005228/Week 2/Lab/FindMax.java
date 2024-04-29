package Lab;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 18/3/2024
 * Objective: Q5: Create Circle class and compare object.
 */

public class FindMax {
    
    static class Circle implements Comparable<Circle>{
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public int compareTo(Circle c){
            if(radius < c.radius)
                return -1;
            else if(radius == c.radius)
                return 0;
            else
                return 1;
        }
        
        @Override
        public String toString(){
            return "Circle radius: " + radius;
        }   
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        
        for(int i=0; i<list.length; i++){
            if(max.compareTo(list[i])<0){
                max = list[i];
            }
        }
        return max;       
    }
    
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3};
        System.out.println(max(intArray));
        String [] strArray = {"red", "green", "blue"};
        System.out.println(max(strArray));
        Circle [] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(circles));
    }
}
