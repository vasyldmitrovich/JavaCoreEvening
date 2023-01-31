package com.softserve.edu14_Stream.HomeTask.Employees;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        List<Employee> employees = createList();

        Optional<String> name = mostPopularName(employees.stream());
        if (name.isPresent()) {
            System.out.println("Most popular name: " + name.get());
        }
        else {
            System.out.println("Most popular name not found");
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees){

        Optional<Map.Entry<String,Long>> o = employees.collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        Optional<String> name = Optional.empty();
        if (o.isPresent()){
                name = Optional.of(o.get()
                .getKey());
        }

        return name;
    }

    public static List<Employee> createList(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Taras"));
        employees.add(new Employee("Olga"));
        employees.add(new Employee("Bogdan"));
        employees.add(new Employee("Taras"));
        employees.add(new Employee("Maria"));
        employees.add(new Employee("Bogdan"));
        employees.add(new Employee("Taras"));

        return employees;
    }
}
