package com.softserve.edu04.practicalTask.task4;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("product-1", 100.99, 5);
        Product p2 = new Product("product-2", 74.99, 1);
        Product p3 = new Product("product-3", 50.00, 10);
        Product p4 = new Product("product-4", 65.50, 18);

        Product[] products = new Product[]{p1,p2,p3,p4};

        //Display the name and quantity of the most expensive item
        for(Product p: products){
            if(p.getPrice() == Product.getHighestPrice()){
                System.out.println("The product with highest price is " + p);
            }
        }

        //Display the name of the items, which has the biggest quantity
        for(Product p: products){
            if(p.getCount() == Product.getHighestCount()){
                System.out.println("The product with biggest quantity is " + p);
            }
        }

    }
}
