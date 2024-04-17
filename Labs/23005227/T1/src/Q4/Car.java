
package Q4;
//instance variable
public class Car extends Vehicle {

    public Car(double maxSpeed) {
        super(maxSpeed);
    }
    
    public void accelerate(){
        currentSpeed += 10;
    }
    
}
