package com.softserve.edu14.Homework.Homework_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppMain {

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.map(Employee::getEmployeeName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sam", 24));
        employees.add(new Employee("Sam", 11));
        employees.add(new Employee("Igor", 17));
        employees.add(new Employee("Dima", 27));
        employees.add(new Employee("Sam", 2));
        employees.add(new Employee("Igor", 77));
        employees.add(new Employee("Oleg", 56));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println(mostPopularName(employees.stream()));
    }
}
