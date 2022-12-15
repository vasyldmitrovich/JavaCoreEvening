package com.softserve.edu04.practicalTask.task4;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Product[] products = createProducts();

        //Display the name and quantity of the most expensive item
        showTheMostExpensiveItem(products);

        //Display the name of the items, which has the biggest quantity
        showItemWithTheBiggestQuantity(products);
    }

    public static Product[] createProducts(){

        Product p1 = new Product("product-1", 100.99, 5);
        Product p2 = new Product("product-2", 74.99, 1);
        Product p3 = new Product("product-3", 50.00, 10);
        Product p4 = new Product("product-4", 65.50, 18);

        return new Product[]{p1,p2,p3,p4};
    }

    public static void showTheMostExpensiveItem(Product[] products){
        for(Product p: products){
            if(p.getPrice() == Product.getHighestPrice()){
                System.out.println("The product with highest price is " + p);
            }
        }
    }

    public static void showItemWithTheBiggestQuantity(Product[] products){
        for(Product p: products){
            if(p.getCount() == Product.getHighestCount()){
                System.out.println("The product with biggest quantity is " + p);
            }
        }
    }
}
