package com.softserve.edu06.homework.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 35, 3000);
        Developer developer = new Developer("Alex", 33, "Average Java developer", 5000);

        /*Create array Employee and add more objects to array. After that use cycle and in that cycle
        * use method .report() from object Employee*/

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
