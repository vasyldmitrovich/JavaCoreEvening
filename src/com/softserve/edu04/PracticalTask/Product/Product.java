package com.softserve.edu04.PracticalTask.Product;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private static double highestPrice = 0.0;
    private static int biggestQuantity = 0;

      public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

          if (price >= highestPrice) {
              highestPrice = price;
          }
          if (quantity >= biggestQuantity) {
              biggestQuantity= quantity;
          }
    }

    public static double getHighestPrice() {
        return highestPrice;
    }

    public static int getBiggestQuantity() {
        return biggestQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
