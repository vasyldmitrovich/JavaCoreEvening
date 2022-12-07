package com.softserve.edu04.PracticalTask4;

public class Product {
    private String name;
    private double price, quanity;

    public Product(){
        name="";
        price = 0;
        quanity = 1;
    }

    public Product(String name, double price, double quanity){
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quanity=" + quanity +
                '}';
    }

    public double getPrice(){
        return this.price;
    }

    public  double getQuanity(){
        return this.quanity;
    }

    public String getName(){
        return this.name;
    }
}
