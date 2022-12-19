package com.softserve.edu04.PracticalTask.Four;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 13);
        Product product2 = new Product("Sofa", 599, 12);
        Product product3 = new Product("Ring Door", 33.5, 150);
        Product product4 = new Product("Headphones", 89, 50);
        if(product1.getPrice() > product2.getPrice() && product1.getPrice() > product3.getPrice() && product1.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product1.getName() + ", quantity: " + product1.getQuantity());
        } else if (product2.getPrice() > product1.getPrice() && product2.getPrice() > product3.getPrice() && product2.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product2.getName() + ", quantity: " + product2.getQuantity());
        }else if (product3.getPrice() > product1.getPrice() && product3.getPrice() > product2.getPrice() && product3.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product3.getName() + ", quantity:" + product3.getQuantity());
        }
        else {
            System.out.println("The most expensive product: " + product4.getName() + ", quantity:" + product4.getQuantity());
        }
        if(product1.getQuantity() > product2.getQuantity() && product1.getQuantity() > product3.getQuantity() && product1.getQuantity() > product4.getQuantity()){
            System.out.println("Product with the biggest quantity: " + product1.getName());
        } else if (product2.getQuantity() > product1.getQuantity() && product2.getQuantity() > product3.getQuantity() && product2.getQuantity() > product4.getQuantity()) {
            System.out.println("Product with the biggest quantity: " + product2.getName());
        }else if (product3.getQuantity() > product1.getQuantity() && product3.getQuantity() > product2.getQuantity() && product3.getQuantity() > product4.getQuantity()) {
            System.out.println("Product with the biggest quantity: " + product3.getName());
        } else {
            System.out.println("Product with the biggest quantity: " + product4.getName());
        }
    }

}
