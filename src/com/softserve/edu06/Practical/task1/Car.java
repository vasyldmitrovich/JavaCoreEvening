package Practical.task1;
/*1. Create abstract class Car with model, maxSpeed and yearOfManufacture
        properties and run() and stop() methods.
        2. Develop classes Truck and Sedan which extend class Car.
        3. In main method create array of Car’s objects. Add to this array some
        trucks and sedans and print info about it.

 */
abstract public class Car {
protected String model;
protected int maxSpeed;
protected int yearOfManufacture;

public Car(String model, int maxSpeed, int yearOfManufacture){
    this.model=model;
    this.maxSpeed=maxSpeed;
    this.yearOfManufacture=yearOfManufacture;
}

abstract void run();
    abstract void stop();

    @Override
    public String toString() {
        return "model: '" + model + '\'' +
                ", maxSpeed: " + maxSpeed +
                ", yearOfManufacture: " + yearOfManufacture;
    }
}
