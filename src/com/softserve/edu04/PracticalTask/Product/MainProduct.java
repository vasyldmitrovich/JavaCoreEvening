package com.softserve.edu04.PracticalTask.Product;

import static com.softserve.edu04.PracticalTask.Product.Product.getBiggestQuantity;
import static com.softserve.edu04.PracticalTask.Product.Product.getHighestPrice;

public class MainProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Chokolad", 1.9, 1500);
        Product p2 = new Product("Cookies", 2.3, 1750);
        Product p3 = new Product("Candies", 0.8, 3600);

        Product[] Range = {p1, p2, p3};

        for (Product p : Range) {
            if (p.getQuantity() == getBiggestQuantity()) {
                System.out.println("The product with biggest quantity - " + p);
            }
        }
        for (Product p : Range) {
            if (p.getPrice() == getHighestPrice()) {
                System.out.println("The product with highest price - " + p);
            }
        }
    }
}