package com.softserve.edu14.homeTask;

public class Product {
    private String category;
    private int date;
    private int price;

    public Product(String category, int date, int price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public int getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
