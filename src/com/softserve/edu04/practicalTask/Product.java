package com.softserve.edu04.practicalTask;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price, quantity;
    /*Put list object in static variable is not good decision
    * And that class is template, for manipulation with that list use another class and methods*/
    private static ArrayList<Product> products = new ArrayList<>();
    private static int minPrice = Integer.MIN_VALUE;
    private static int minQuantity = Integer.MIN_VALUE;


    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        products.add(this);

        if (price > minPrice) minPrice = price;
        if (quantity > minQuantity) minQuantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void getNameAndQuantity() {
      for (Product prod : products){
          if (prod.getPrice() == minPrice) System.out.println(prod.getName() + " is the most expensive item with the quantity - " + prod.getQuantity() + " and the price - " + prod.getPrice());
      }
    }
    public static void getNameBiggestQuantity() {
        for (Product prod : products){
            if (prod.getQuantity() == minQuantity) System.out.println(prod.getName() + " is the most expensive item with the biggest quantity - " + prod.getQuantity());
        }
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
