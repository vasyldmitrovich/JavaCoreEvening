package com.softserve.edu14.Homework;

public class Product {
    private String manufactureCategory;
    private int dateOfManufacture;
    private int price;

    public Product(String manufactureCategory, int dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public Product() {

    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
