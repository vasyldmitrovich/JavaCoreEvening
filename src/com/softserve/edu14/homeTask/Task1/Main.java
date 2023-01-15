package com.softserve.edu14.homeTask.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Product> products = createProductsList();
        System.out.println(getPhones(products));
    }

    public static List<Product> createProductsList(){
        List<Product> products = new ArrayList<>();
        //create list of  products
        products.add(new Product("Phone", LocalDate.of(2021, 12,3),13500.00));
        products.add(new Product("Computer hardware", LocalDate.of(2021, 3,1),23500.00));
        products.add(new Product("Furniture", LocalDate.of(2020, 5,8),3500.00));
        products.add(new Product("Clothes", LocalDate.of(2023, 1,2),500.00));
        products.add(new Product("Phone", LocalDate.of(2020, 10,12),7500.00));
        products.add(new Product("Phone", LocalDate.of(2019, 8,4),10000.00));
        products.add(new Product("Furniture", LocalDate.of(2020, 5,23),23500.00));
        products.add(new Product("Furniture", LocalDate.of(2018, 3,17),3500.00));
        products.add(new Product("Phone", LocalDate.of(2023, 1,7),8500.00));
        products.add(new Product("Phone", LocalDate.of(2020, 11,5),2300.00));
        products.add(new Product("Phone", LocalDate.of(2023, 1,5),1500.00));
        products.add(new Product("Clothes", LocalDate.of(2019, 12,5),13000.00));
        return products;
    }


    //Obtain a sorted by the price list of products belong
    //to category Phone with price > 3000, and the date of manufacture was more than 1 year ago.
    public static List<Product> getPhones(List<Product> products){
        return products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getProductPrice() > 3000.00)
                .filter(product -> product.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getProductPrice))
                .collect(Collectors.toList());
    }

    
}
