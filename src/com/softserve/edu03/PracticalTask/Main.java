package com.softserve.edu03.PracticalTask;

import static com.softserve.edu03.PracticalTask.Employee.getTotalSum;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Oleg", 11.5, 132);
        Employee employee2 = new Employee("Dima", 10.5, 156);
        Employee employee3 = new Employee("Sasha", 16.5, 144);
        getTotalSum();
    }
}
