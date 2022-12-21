package com.softserve.edu06.MyProjects.Homework2;

import java.util.ArrayList;

/*Roman Sitko
* Lesson 6. Homework 2
* Employee, developer*/
public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Ross", 32, 10000.00, "Kotlin developer"));
        employees.add(new Developer("Andryi", 21, 20000.50, "Java developer"));
        for(Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
