package com.softserve.edu04.MyProjects.PracticalTask4;

public class Product {
    private String name;
    private int price;
    private int quantity;

    private static int mostExpencive;
    private static String nameMostExpencive;
    private static int biggestQuantity;
    private static String nameBiggestQuantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void mostExpensive (Product[] p) {
        mostExpencive = p[0].price;
        for (int i = 0; i < p.length; i++) {
            if (p[i].price > mostExpencive) {
                mostExpencive = p[i].price;
            }
            if (p[i].price == mostExpencive) {
                nameMostExpencive = p[i].name;
            }
        }
        System.out.println("Most expencive product: " + nameMostExpencive + ", price: "+ mostExpencive);
    }

    public static void biggestQuantity (Product[] p) {
        biggestQuantity = p[0].quantity;
        for (int i = 0; i < p.length; i++) {
            if (p[i].quantity > biggestQuantity) {
                biggestQuantity = p[i].quantity;
            }
            if (p[i].quantity == biggestQuantity) {
                nameBiggestQuantity = p[i].name;
            }
        }
        System.out.println("Name of biggest quantity: " + nameBiggestQuantity + ", quantity: "+ biggestQuantity);
    }
}
