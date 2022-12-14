package softserve.edu06.PracticalTasks.Cars;

public class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Nissan", 140, 2000);
        Sedan sedan2 = new Sedan("Renault", 160, 2010);
        Truck truck1 = new Truck("Man", 120, 2008);
        Truck truck2 = new Truck("Iveco", 130, 2017);
        Car[] cars = {sedan1, sedan2, truck1, truck2};

        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
