package com.softserve.edu05.HomeTasks5;

public class Car {
    private Models model;
    private int year;
    private double engineCapacity;

    public Car(Models model, int year, double engineCapacity) {
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public int getYear() {
        return year;
    }

    public static void belongYear(int year, Car ... cars){
        boolean isFind = false;
        boolean firstWas= false;
        for (Car car:cars
             ) {
            if(car.getYear()==year) {
                if (!firstWas){
                    firstWas = true;
                    System.out.println("There are cars "+year+" year of production:");
                }
                isFind = true;
                System.out.println(car);
            }
        }

        if (!isFind){
            System.out.println("There aren't any cars belong "+year+" year of production");
        }
    }

    public static void orderCarsByYear(Car ... cars){
        Car tmpCar;

        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i+1; j < cars.length; j++) {
                if (cars[i].getYear()>cars[j].getYear()){
                    tmpCar = cars[i];
                    cars[i]= cars[j];
                    cars[j] = tmpCar;
                }
            }

        }

        System.out.println("Ordered cars by year:");
        for (Car car: cars
             ) {
            System.out.println(car);

        }
    }
}
