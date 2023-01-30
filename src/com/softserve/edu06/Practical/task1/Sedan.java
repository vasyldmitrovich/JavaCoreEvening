package Practical.task1;

public class Sedan extends Car{

    public Sedan(String model, int maxSpeed, int yearOfManufacture){
        super(model,maxSpeed,yearOfManufacture);
    }
    @Override
    void run() {
        System.out.println("Sedan starts");
    }

    @Override
    void stop(){
        System.out.println("Sedan stops");
    }

    @Override
    public String toString() {
        return "Sedan " + super.toString();
    }
}
