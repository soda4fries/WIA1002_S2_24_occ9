/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class T1Q4 {
    public static void main(String[] args) {
        Ferrari myCar = new Ferrari(255.75);
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());
        System.out.println("Max Speed: " + myCar.getMaxSpeed());
        System.out.println("Pedal to the Metal!!");
        myCar.pedalToTheMetal();
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());
    }
    
}

abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;
    Vehicle (double max){
    currentSpeed = 0.0;
    maxSpeed = max;
    }
    abstract void accelerate();
    double getCurrentSpeed(){
        return currentSpeed;
    }
    double getMaxSpeed(){
        return maxSpeed;
    }
    void pedalToTheMetal(){
        while(currentSpeed < maxSpeed)
            accelerate();
        if (currentSpeed > maxSpeed)
            currentSpeed = maxSpeed;
    }
}
class Ferrari extends Vehicle {
    
    Ferrari (double max){
        super(max);
    }

    @Override
    void accelerate() {
        currentSpeed += 45.25;
    }
    
}
