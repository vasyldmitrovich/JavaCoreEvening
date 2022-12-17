package com.softserve.edu06.Homework.Employee;

public class MainEmployee {
    public static void main(String[] args) {

Employee e1 = new Employee("Yaroslav", 25, 2300 );
Employee e2 = new Developer("Dmytro", 33, "junior", 2000);

        System.out.println(e1.report());
        System.out.println(e2.report());
    }
}
