package com.prostopizza.model;

import javax.persistence.*;

@Entity
@Table(name = "product_ingredient")
public class ProductIngredient {
    @Id
    @Column(name = "id")
    long id;
    @Column(name = "product_id")
    long product_id;
    @Column(name = "ingredient_id")
    long ingredient_id;


    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getIngredient_id() {
        return ingredient_id;
    }

    public void setIngredient_id(long ingredient_id) {
        this.ingredient_id = ingredient_id;
    }
}
