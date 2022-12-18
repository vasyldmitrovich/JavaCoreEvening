package com.softserve.edu06.PracticalTasks.Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        run();
        int i = input("say your age");
        Main a = new Main();
        Sedan s = a.carSpeed(i);
        System.out.println(s);

    }
    public  static void run(){
        Sedan sedan1 = new Sedan("Nissan", 140, 2000);
        Sedan sedan2 = new Sedan("Renault", 160, 2010);
        Truck truck1 = new Truck("Man", 120, 2008);
        Truck truck2 = new Truck("Iveco", 130, 2017);
        Car[] cars = {sedan1, sedan2, truck1, truck2};

        for (Car car: cars) {
            System.out.println(car);
        }
    }

    public static int input(String string){
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        return result;
    }

    public Sedan carSpeed(int i){
        Sedan sedan = new Sedan();
        Sedan sedan1 = new Sedan("Nissan", 140, 2000);
        Sedan sedan2 = new Sedan("Renault", 160, 2010);
        Truck truck1 = new Truck("Man", 120, 2008);
        Truck truck2 = new Truck("Iveco", 130, 2017);
        Car[] cars = {sedan1, sedan2, truck1, truck2};

        for (Car car: cars) {
            if (car instanceof Sedan && car.maxSpeed == i){
                sedan = (Sedan) car;
            }
//            System.out.println(car);
        }
        return sedan;
    }
}
