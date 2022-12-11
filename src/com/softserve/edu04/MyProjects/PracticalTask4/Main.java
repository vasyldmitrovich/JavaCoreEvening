package com.softserve.edu04.MyProjects.PracticalTask4;

public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[3];
//                = new Product("bred", 69, 3);
//        Product product2 = new Product("butter", 70, 3);
//        Product product3 = new Product("milk", 40, 3);

        product[0] = new Product("bred", 69, 3);
        product[1] = new Product("butter", 70, 3);
        product[2] = new Product("milk", 72, 3);

        Product.mostExpensive(product);
    }

}
