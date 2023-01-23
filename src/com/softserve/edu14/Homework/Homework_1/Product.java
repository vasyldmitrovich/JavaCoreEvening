package com.softserve.edu14.Homework.Homework_1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String manufactureCategory, String dd_MM_yyyy, int price) {
        try{
            this.dateOfManufacture = LocalDate.parse(dd_MM_yyyy, DateTimeFormatter.ofPattern("dd_MM_yyyy"));
        }
        catch (DateTimeException e){
            System.err.println("Date does not passed validate method: " + dd_MM_yyyy);
        }
        this.manufactureCategory = manufactureCategory;
        this.price = price;
    }

    public String manufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate dateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product [ " +
                "manufactureCategory = '" + manufactureCategory + '\'' +
                ", dateOfManufacture = " + dateOfManufacture +
                ", price = " + price +
                "$ ]";
    }
}
