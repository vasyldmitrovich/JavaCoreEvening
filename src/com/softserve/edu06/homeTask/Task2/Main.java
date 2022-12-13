package com.softserve.edu06.homeTask.Task2;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Employee employee = new Employee("Vladyslav", 19, 12000);
        System.out.println(employee.report());

        Developer developer = new Developer("Oleg", 22, 12000, "Java Developer");
        System.out.println(developer.report());
    }
}
