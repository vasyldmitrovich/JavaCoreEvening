package com.softserve.edu04.PracticalTask.Four;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;



    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}