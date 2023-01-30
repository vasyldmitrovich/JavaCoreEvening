package Practical.task1;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture){
        super(model,maxSpeed,yearOfManufacture);
    }
    @Override
    void run() {
        System.out.println("Truck starts");
    }



    @Override
    void stop() {
        System.out.println("Truck stops");
    }

    @Override
    public String toString() {
        return "Truck " + super.toString();
    }
}
