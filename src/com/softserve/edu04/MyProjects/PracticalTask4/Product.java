package com.softserve.edu04.MyProjects.PracticalTask4;

public class Product {
    private String name;
    private int price;
    private  int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void mostExpensive (Product p) {
        if(p.price > price)
            System.out.println("abc");
    }

}
