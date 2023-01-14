package com.softserve.edu14.homeTask;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        firstTask();
        Optional<String> s = mostPopularName(streamInitialize());
        s.ifPresent(System.out::println);
    }

    static void firstTask() {
        listInitialize().stream()
                .sorted((i, j) -> j.getPrice() - i.getPrice())
                .filter(i -> i.getCategory().equals("Phone"))
                .filter(i -> i.getPrice() > 3000)
                .filter(i -> i.getDate() > 1)
                .forEach(System.out::println);

    }

    static List<Product> listInitialize() {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int randomCategory = getRandomNumber(0, 100);
            int randomPrice = getRandomNumber(2500, 5000);
            int randomDate = getRandomNumber(0, 3);
            list.add(new Product(randomCategory > 50 ? "Phone" : "NotPhone", randomDate, randomPrice));
        }
        return list;
    }

    static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Set<String> set = new HashSet<>();

        return employees
                .filter(i -> !set.add(i.getName().toUpperCase()))
                .findFirst()
                .map(Employee::getName)
                .orElse(Optional.empty().toString()).describeConstable();
    }

    static Stream<Employee> streamInitialize() {
        Employee empl1 = new Employee("Din");
        Employee empl2 = new Employee("bob");
        Employee empl3 = new Employee("sam");
        Employee empl4 = new Employee("Sam");
        return Stream.of(empl1, empl2, empl3, empl4);
    }
}
