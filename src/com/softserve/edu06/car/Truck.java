package com.softserve.edu06.car;

public class Truck extends Car{

    public Truck(){
        model = " ";
        maxSpeed = 0;
        yearOfManufacture = 0;
    }

    public Truck(String model, int maxSpeed, int yearOfManufacture){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void run() {
        System.out.println("Назва моделі: " + model + ", максимальна швидкість: " + maxSpeed + ", рік випуску: " + yearOfManufacture );
    }

    @Override
    public void stop() {
        System.out.println("Даний тип авто не знайдено");
    }
}
