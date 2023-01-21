package com.softserve.edu14.homeWork.AppProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private String category;
    private LocalDate dateOfManufacture;
    private Integer price;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Product (String category, String dateOfManufacture,Integer price){
        this.category = category;
        this.dateOfManufacture = LocalDate.parse( dateOfManufacture, formatter);
        this.price = price;

    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString(){
        String inform = "Category: " + category + ", date of manufacture: "
                + dateOfManufacture +  ", price: " + price;
        return  inform;
    }
}
