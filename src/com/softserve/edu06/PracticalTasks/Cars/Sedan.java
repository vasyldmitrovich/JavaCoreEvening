package softserve.edu06.PracticalTasks.Cars;

import softserve.edu06.PracticalTasks.Cars.Car;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
    }

    @Override
    public void stop() {
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
