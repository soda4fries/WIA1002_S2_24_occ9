package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 17/3/2024
 * Objective: Q8: Using the <?> wildcard, implement a generic method that displays the list. 
 */
import java.util.ArrayList;
public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>(); 
        ArrayList<Double> milesPerHour = new ArrayList<>(); 
        
        numOfCars.add(10);
        numOfCars.add(15);
        numOfCars.add(20);
        numOfCars.add(25);
        
        milesPerHour.add(60.5);
        milesPerHour.add(65.5);
        milesPerHour.add(70.5);
        milesPerHour.add(75.5);
        
        System.out.println("Number of cars:");
        display(numOfCars);

        System.out.println("\nMiles per hour:");
        display(milesPerHour);
    }
    
    public static void display(ArrayList<?> list){
        for (Object value: list){
            System.out.print(value + " ");
        }
    }
}
