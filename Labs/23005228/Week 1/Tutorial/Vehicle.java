package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 9/3/2024
 * Objective: Q4: Write definition of an abstract class Vehicle.
 */

/*
- No. Vehicle is abstact, cannot be instantiated.
*/

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract double accelerate();
    
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    public double pedalToTheMetal(){
        if(currentSpeed != maxSpeed)
            accelerate();
        return 0;
    }
    
}
