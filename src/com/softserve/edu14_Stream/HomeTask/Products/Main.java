package com.softserve.edu14_Stream.HomeTask.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){

        List<Product> products = createList();
        System.out.println("Origin list: "+products);

        System.out.println();
        LocalDate date = LocalDate.now().minusYears(1);
        products = filterSortedList(products, "Phone", 3000, date);
        System.out.println("Filtered and sorted list: "+products);
    }

    public static List<Product> createList(){
        List<Product> products= new ArrayList<>();

        products.add(new Product("Phone", LocalDate.of(2018,10,13),5000));
        products.add(new Product("Laptop", LocalDate.of(2020,9,25),45000));
        products.add(new Product("Phone", LocalDate.of(2022,1,8),12000));
        products.add(new Product("Headphones", LocalDate.of(2018,12,1),700));
        products.add(new Product("Phone", LocalDate.of(2010,4,30),2800));
        products.add(new Product("Laptop", LocalDate.of(2015,5,13),20000));
        products.add(new Product("Phone", LocalDate.of(2022,10,13),7000));
        products.add(new Product("Headphones", LocalDate.of(2021,6,17),500));
        products.add(new Product("Phone", LocalDate.of(2019,12,23),3700));
        products.add(new Product("Laptop", LocalDate.of(2023,1,5),50000));
        products.add(new Product("Headphones", LocalDate.of(2020,8,7),1000));
        products.add(new Product("Phone", LocalDate.of(2022,9,18),5000));
        products.add(new Product("Headphones", LocalDate.of(2021,7,7),750));
        products.add(new Product("Phone", LocalDate.of(2022,5,5),2999));
        products.add(new Product("Laptop", LocalDate.of(2018,3,3),55000));
        products.add(new Product("Phone", LocalDate.of(2017,11,11),7000));
        products.add(new Product("Headphones", LocalDate.of(2017,4,14),1200));
        products.add(new Product("Phone", LocalDate.of(2020,12,13),3100));
        products.add(new Product("Headphones", LocalDate.of(2020,2,15),650));
        products.add(new Product("Phone", LocalDate.of(2022,11,8),15000));

        return products;
    }

    public static List<Product> filterSortedList(List<Product> products, String category, double price, LocalDate date){
        products = products.stream()
                .filter(product -> product.getCategory().equals(category) & product.getPrice()>price & product.getDateOfManufactured().isBefore(date))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        return products;
    }
}
