package com.softserve.edu06.car;

public class AppCar {
    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars[0] = new Truck("Ford", 210, 2010);
        cars[1] = new Truck("Hania", 240, 2015);
        cars[2] = new Sedan("Citroen", 240, 2016);
        cars[3] = new Sedan("Toyota", 230, 2020);

        UserEnter.UserEnter("Введіть тип авто truck або sedan: ");

        if(UserEnter.inform.equals("sedan")){
               cars[2].run();
               cars[3].run();

            }else if(UserEnter.inform.equals("truck")){
                cars[0].run();
                cars[1].run();
            }else{
                Car c = new Truck();
                c.stop();
            }
    }
}
