package com.softserve.edu04;

public class Product {
    private String name;
    private float price;
    private int quantity;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
    public void setPrice(float price){

        this.price = price;
    }
    public float getPrice(){

        return this.price;
    }
    public void setQuantity(int quantity){

        this.quantity = quantity;
    }
    public int getQuantity(){

        return this.quantity;
    }

    public Product(){
        name = "";
        price = 0.0f;
        quantity = 0;
    }
    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public static void main(String[] args) {
        Product product1 = new Product("Book", 2.5f, 5);
        Product product2 = new Product("Pen", 2.9f, 8);
        Product product3 = new Product("Pencil", 4.9f, 4);
        if(product1.price>product2.price && product1.price>product3.price){
            System.out.println("Назва найдорожчого товару: " + product1.name + " кількість: " + product1.quantity);
        } else if (product2.price>product3.price && product2.price>product1.price){
            System.out.println("Назва найдорожчого товару: " + product2.name + " кількість: " + product2.quantity);
        }else {
            System.out.println("Назва найдорожчого товару: " + product3.name + " кількість: " + product3.quantity);
        }
        if(product1.quantity>product2.quantity && product1.quantity>product3.quantity){
            System.out.println("Найбільша кількість: " + product1.name);
        } else if (product2.quantity>product3.quantity && product2.quantity>product1.quantity){
            System.out.println("Найбільша кількість: " + product2.name);
        }else {
            System.out.println("Найбільша кількість " + product3.name);
        }
    }
}
