package com.softserve.edu06.practicalTask.Task1;

public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Truck truck1 = new Truck("Renault", 140.00, 2000);
        Sedan sedan1 = new Sedan("Mercedes", 210.00, 2015);

        Car truck2 = new Truck("Volvo", 150.00, 2010);
        Sedan sedan2 = new Sedan("Audi", 220.00, 2017);

        Car[] cars = {truck1, sedan1, truck2, sedan2};

        for (Car car:cars){
            System.out.println(car);
            car.run();
            car.stop();
            System.out.println("---------------");
        }
    }
}

