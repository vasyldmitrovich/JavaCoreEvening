package com.softserve.edu14_Stream.HomeTask.Products;

import java.time.LocalDate;
import java.util.Comparator;

public class Product {
    private String category;
    private LocalDate dateOfManufactured;
    private double price;

    public Product() {
        category = "";
        dateOfManufactured = LocalDate.now();
        price = 0;
    }

    public Product(String category, LocalDate dateOfManufactured, double price) {
        this.category = category;
        this.dateOfManufactured = dateOfManufactured;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufactured() {
        return dateOfManufactured;
    }

    public void setDateOfManufactured(LocalDate dateOfManufactured) {
        this.dateOfManufactured = dateOfManufactured;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "category='" + category + '\'' +
                ", dateOfManufactured=" + dateOfManufactured +
                ", price=" + price +
                '}';
    }

}
