package com.softserve.edu14.homeWork.Employee;

import java.util.ArrayList;
import java.util.stream.*;


public class AppEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Oleg" , "marketing", 31));
        employees.add(new Employee("Iryna" , "accounting", 21));
        employees.add(new Employee("Volodymyr" , "production", 35));
        employees.add(new Employee("Oleg" , "storage", 42));

        Stream<Employee> employeeStream = employees.stream();

        Employee.mostPopularName(employeeStream);

    }
}
