package com.prostopizza.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "ADD_TO_CART")
public class AddToCart {
    @Id
    long id;
    @JsonIgnore

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Products product;
    //Long product_id;
    int qty;
    double price;
    Long user_id;
    @Column(updatable=false, insertable=false)
    String added_date;

    @Transient
    String productName;

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAdded_date() {
        return added_date;
    }
    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }
    Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }

    public String getProductName() {
        return product.getName();
    }
}
