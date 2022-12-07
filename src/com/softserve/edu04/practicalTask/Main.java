package com.softserve.edu04.practicalTask;

public class Main {
    public static void main(String[] args) {
        OddNumber.oddNumbers();
        DayOfTheWeek.dayOfTheWeek();
        Continent.getContinents(); //якось складнувато вийшло

        Product product = new Product("Bacon1", 20 ,  5);
        Product product1 = new Product("Bacon2", 35 ,  7);
        Product product2 = new Product("Bacon3", 35 ,  1);
        Product product3 = new Product("Bacon4", 17 ,  10);

        Product.getNameAndQuantity();
        Product.getNameBiggestQuantity();
    }
}
