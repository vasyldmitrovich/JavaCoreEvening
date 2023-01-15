package com.softserve.edu14.homeTask.Task1;

import java.time.LocalDate;

public class Product {

    private String manufactureCategory;
    private LocalDate manufactureDate;
    private double productPrice;

    public Product(String manufactureCategory, LocalDate manufactureDate, double productPrice) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.productPrice = productPrice;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
               "manufactureCategory='" + manufactureCategory + '\'' +
               ", manufactureDate=" + manufactureDate +
               ", productPrice=" + productPrice +
               '}';
    }
}
