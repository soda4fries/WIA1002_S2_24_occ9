
package Q4;

//abstract classes - some of the method cannot be implemented

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        //initialize current speed
        this.currentSpeed = 0.00;
    }
    
    public abstract void accelerate();
    
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    public void pedalToTheMetal(){
        do {
            accelerate();
        } while (getCurrentSpeed() != getMaxSpeed());
    }
    
}
