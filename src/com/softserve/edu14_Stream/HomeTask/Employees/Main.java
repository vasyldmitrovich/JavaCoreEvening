package com.softserve.edu14_Stream.HomeTask.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        List<Employee> employees = createList();
    }

//    public static Optional<String> mostPopularName(Stream<Employee> employees){
//
////        public static <T> Set<T> findDuplicateByGrouping(List<T> list) {
////
////            return list.stream()
////                    .collect(Collectors.groupingBy(Function.identity()
////                            , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
////                    .entrySet().stream()                 // Map -> Stream
////                    .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
////                    .map(Map.Entry::getKey)
////                    .collect(Collectors.toSet());
////
////        }
//
//    }

    public static List<Employee> createList(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Taras"));
        employees.add(new Employee("Olga"));
        employees.add(new Employee("Bogdan"));
        employees.add(new Employee("Taras"));
        employees.add(new Employee("Maria"));

        return employees;
    }
}
