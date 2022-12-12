package com.softserve.edu04.MyProjects.PracticalTask4;

/*Roman Sitko. Practical tasks 4
* */
public class Main {
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("bred", 87, 10);
        product[1] = new Product("butter", 82, 9);
        product[2] = new Product("milk", 83, 6);
        product[3] = new Product("tea", 86, 11);

        Product.mostExpensive(product);
        Product.biggestQuantity(product);
    }

}
