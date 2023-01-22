package com.softserve.edu06.Homework.Homework_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Oleg",21,20020.11),
                new Employee("Igor",21,8020.12),
                new Employee("Dima",21,10020.13),
                new Developer("Dima",21,"Average Java developer",30020.66),
        };
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
