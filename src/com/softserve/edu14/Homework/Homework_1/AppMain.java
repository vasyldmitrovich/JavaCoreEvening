package com.softserve.edu14.Homework.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Agricultural production", "17_02_1700", 11111));
        products.add(new Product("Film production", "28_04_2001", 222222));
        products.add(new Product("Jewellery making", "24_06_2007", 333));
        products.add(new Product("Electronics manufacturing services", "20_08_2014", 1111));
        products.add(new Product("Optical manufacturing and testing", "16_10_2017", 144111111));
        products.add(new Product("Plastics industry", "12_12_1980", 44444));
        products.add(new Product("Shipbuilding", "08_03_1993", 1155511));
        products.add(new Product("Agricultural production", "04_06_1967", 991));
        products.add(new Product("Musical instrument construction", "01_09_1949", 122211));
        products.add(new Product("Food processing", "30_12_1914", 1111));
        products.add(new Product("Agricultural production", "27_04_1917", 1111456));
        products.add(new Product("Shipbuilding", "24_08_1939", 111771));
        products.add(new Product("Agricultural production", "21_12_1945", 4565411));
        products.add(new Product("Food processing", "18_01_196", 654643));
        products.add(new Product("Agricultural production", "15_03_1911", 11754));
        products.add(new Product("Shipbuilding", "12_05_1973", 11546411));
        products.add(new Product("Agricultural production", "09_07_2011", 87));
        products.add(new Product("Musical instrument construction", "06_09_2012", 16765));
        products.add(new Product("Musical instrument construction", "03_11_1994", 11456));
        products.add(new Product("Agricultural production", "01_07_2022", 1176556));

        for (Product product : products) {
            System.out.println(product);
        }
        //Obtain a sorted by the price list of products belong to category Musical instrument construction with
        //price < 100000, and the date of manufacture under 2000 year.
        var products2 = products.stream()
                .filter(e -> e.manufactureCategory().equals("Musical instrument construction"))
                .filter(e -> e.price() < 100000)
                .filter(e -> e.dateOfManufacture().getYear() < 2000)
                .toList();
        System.out.println("\n-------------------------------------------------------------------------------------");
        for (Product product : products2) {
            System.out.println(product);
        }
    }
}
