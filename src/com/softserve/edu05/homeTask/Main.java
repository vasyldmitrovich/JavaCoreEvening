package com.softserve.edu05.homeTask;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        run();
        FirstTask.checkMonth(scan);
        SecondTask.firstFiveSum(scan);
        ThirdTask.getPosMinAndEven(scan);
        CarRealisation.certainModelYear(scan);
        CarRealisation.orderCars();

    }
    public static void run(){
        CarRealisation car1 = new CarRealisation("Sport", 2014, 2.0);
        CarRealisation car2 = new CarRealisation("Hatchback", 2021, 1.4);
        CarRealisation car3 = new CarRealisation("Sedan", 2007, 1.8);
        CarRealisation car4 = new CarRealisation("Coupe", 2010, 2.2);
    }
}
