package com.softserve.edu05.practicalTask;

public class Main {
    public static void main(String[] args) {
        FirstTask.arrayFunctions();

        Employee emp1 = new Employee("Jack", 1, 3);
        Employee emp2 = new Employee("Jacky", 2, 5);
        Employee emp3 = new Employee("Mike", 1, 1);
        Employee emp4 = new Employee("Max", 3, 2);
        Employee emp5 = new Employee("Elon", 5, 4);

        Employee.departmentCheck();
        Employee.sortEmployee();


    }
}
