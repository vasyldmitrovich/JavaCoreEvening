package com.prostopizza.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="orders")
public class Order {
    @Id
    long id;
    String order_id;
    long product_id;
    int qty;
    int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrder_on() {
        return order_on;
    }

    public void setOrder_on(String order_on) {
        this.order_on = order_on;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    String order_on;
    int status; //status of the order
}
