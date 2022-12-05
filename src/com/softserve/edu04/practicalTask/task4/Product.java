package com.softserve.edu04.practicalTask.task4;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int quantity;

    private static double highestPrice = 0.00;

    private static int highestQuantity = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if(price > highestPrice){
            highestPrice = price;
        }

        if(quantity > highestQuantity){
            highestQuantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return quantity;
    }

    public static double getHighestPrice() {
        return highestPrice;
    }

    public static int getHighestCount() {
        return highestQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + quantity +
                '}';
    }
}
