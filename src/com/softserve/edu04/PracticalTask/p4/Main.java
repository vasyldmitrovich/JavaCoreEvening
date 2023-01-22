package com.softserve.edu04.PracticalTask.p4;

public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("Fish", 12, 33);
        product[1] = new Product("Cheese", 45, 23);
        product[2] = new Product("Pasta", 13, 46);
        product[3] = new Product("Coffee", 9, 54);

        Product.mostExpensive(product);
        Product.biggestQuantity(product);
    }
}
