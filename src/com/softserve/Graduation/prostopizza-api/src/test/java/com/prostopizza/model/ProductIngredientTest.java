package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductIngredientTest {
    @Test
    public void testSetProduct_id() {
        ProductIngredient productIngredient = new ProductIngredient();
        productIngredient.setProduct_id(1L);
        assertEquals(1L, productIngredient.getProduct_id());
    }

    @Test
    public void testSetIngredient_id() {
        ProductIngredient productIngredient = new ProductIngredient();
        productIngredient.setIngredient_id(1L);
        assertEquals(1L, productIngredient.getIngredient_id());
    }
}

