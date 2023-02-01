package com.prostopizza.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
    @Id
    @Column(name = "id")
    long id;

    @Column(name = "name")
    String name;
    @Column(name = "price")
    String price;
    @Column(name = "size")
    String size;
    @Column(name = "added_on")
    String added_on;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAdded_on() {
        return added_on;
    }

    public void setAdded_on(String added_on) {
        this.added_on = added_on;
    }
}
