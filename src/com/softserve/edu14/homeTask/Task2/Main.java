package com.softserve.edu14.homeTask.Task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Employee> employees = createEmployeesList();
        Optional<String> mostPopularName = getMostPopularName(employees.stream());
        if(mostPopularName.isPresent()){
            System.out.println("Most popular name is: " + mostPopularName.get());
        }else {
            System.out.println("List empty");
        }

    }

    public static Optional<String> getMostPopularName(Stream<Employee> employeeStream){
        return employeeStream
                .map(Employee::getEmployeeName)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey);
    }

    public static List<Employee> createEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sam", 21));
        employees.add(new Employee("Sam", 39));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Din", 32));
        employees.add(new Employee("David", 27));
        employees.add(new Employee("David", 28));
        employees.add(new Employee("Sam", 31));
        return employees;
    }
}
