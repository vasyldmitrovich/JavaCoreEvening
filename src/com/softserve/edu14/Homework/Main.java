package com.softserve.edu14.Homework;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        runProduct();
        runEmployee();
    }

    static void runProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 2017, 3900));
        products.add(new Product("Phone", 2020, 6700));
        products.add(new Product("LapTop", 2021, 13000));
        products.add(new Product("LapTop", 2021, 16000));
        products.add(new Product("Phone", 2017, 10700));
        products.add(new Product("Phone", 2022, 2700));
        products.add(new Product("Phone", 2021, 6900));
        products.add(new Product("LapTop", 2022, 23000));
        products.add(new Product("LapTop", 2022, 25000));
        products.add(new Product("LapTop", 2021, 66000));

        List<Product> sorted = products.stream()

                .filter(Product -> Product.getManufactureCategory().equals("Phone"))
                .filter(Product -> Product.getPrice() > 3000)
                .filter(Product -> Product.getDateOfManufacture() > 1)
                .sorted(new ProductComparator())
                .toList();

        System.out.println("Sorted by the price list of products belong to category Phone with\n" +
                "price > 3000, and the date of manufacture was more then 1 year ago:\n" + sorted);

    }
    static class ProductComparator implements Comparator<Product>{
        public int compare (Product a, Product b) {
            return a.getPrice()-b.getPrice();
        }
    }

    static void runEmployee() {
        Optional<String>name = mostPopularName(setEmployeeList());
        System.out.println("The most popular name: " + name);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Set<String> s = new HashSet<>();

        return employees
                .filter(e -> !s.add(e.getName().toUpperCase()))
                .findFirst()
                .map(Employee::getName);
    }

    static Stream<Employee> setEmployeeList () {
        Employee e1 = new Employee("Marta");
        Employee e2 = new Employee("Tom");
        Employee e3 = new Employee("Mark");
        Employee e4 = new Employee("Dean");
        Employee e5 = new Employee("Tom");
        Employee e6 = new Employee("Julia");

       return Stream.of(e1, e2, e3, e4, e5, e6);
    }
}
