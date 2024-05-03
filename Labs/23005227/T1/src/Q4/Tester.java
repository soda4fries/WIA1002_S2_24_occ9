
package Q4;

public class Tester {
    public static void main(String[] args) {
        Car c1 = new Car(50);
        System.out.println("Current Speed: " + c1.getCurrentSpeed());
        System.out.println("Max Speed: " + c1.getMaxSpeed());
        c1.pedalToTheMetal();
        System.out.println("Current Speed after max speed: " + c1.getCurrentSpeed());
    }  
}
