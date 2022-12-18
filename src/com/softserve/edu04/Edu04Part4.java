package com.softserve.edu04;
/**
 * PRACTICAL TASKS
 * Create class Product with fields name, price and quantity
 * • Create four instances of type Product
 * • Display the name and quantity of the most expensive item
 * • Display the name of the items, which has the biggest quantity
 */
public class Edu04Part4 {

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 2, 14);
        Product product2 = new Product("Meat", 18, 3);
        Product product3 = new Product("Peach", 3, 11);
        Product product4 = new Product("Milk", 10, 2);

        expensive(product1, product2, product3, product4);
        amount(product1, product2, product3, product4);
    }

    private static void amount(Product product1, Product product2, Product product3, Product product4) {
        int largestNumber = 0;
        Product product = null;
        if (product1.quantity > largestNumber) {
            largestNumber = product1.quantity;
            product = product1;
        }
        if (product2.quantity > largestNumber) {
            largestNumber = product2.quantity;
            product = product2;
        }
        if (product3.quantity > largestNumber) {
            largestNumber = product3.quantity;
            product = product3;
        }
        if (product4.quantity > largestNumber) {
            largestNumber = product4.quantity;
            product = product4;
        }
        System.out.println("The biggest quantity is " + product.name);
    }

    public static void expensive(Product product1, Product product2, Product product3, Product product4) {
        int higherPrice = 0;
        Product product = null;
        if (product1.price > higherPrice) {
            higherPrice = product1.price;
            product = product1;
        }
        if (product2.price > higherPrice) {
            higherPrice = product2.price;
            product = product2;
        }
        if (product3.price > higherPrice) {
            higherPrice = product3.price;
            product = product3;
        }
        if (product4.price > higherPrice) {
            higherPrice = product4.price;
            product = product4;
        }
        System.out.println("The most expensive item is " + product.name + " - quantity = " + product.quantity);
    }
}

class Product {
    String name;
    int price, quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
