package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class AddToCartTest {
    @Test
    public void testSetQty() {
        AddToCart addToCart = new AddToCart();
        addToCart.setQty(1);
        assertEquals(1, addToCart.getQty());
    }

    @Test
    public void testSetPrice() {
        AddToCart addToCart = new AddToCart();
        addToCart.setPrice(10.0);
        assertEquals(10.0, addToCart.getPrice());
    }

    @Test
    public void testSetAdded_date() {
        AddToCart addToCart = new AddToCart();
        addToCart.setAdded_date("2020-03-01");
        assertEquals("2020-03-01", addToCart.getAdded_date());
    }

    @Test
    public void testSetUser_id() {
        AddToCart addToCart = new AddToCart();
        addToCart.setUser_id(1L);
        assertEquals(1L, addToCart.getUser_id().longValue());
    }

    @Test
    public void testSetId() {
        AddToCart addToCart = new AddToCart();
        addToCart.setId(123L);
        assertEquals(123L, addToCart.getId());
    }

    @Test
    public void testSetProduct() {
        AddToCart addToCart = new AddToCart();
        addToCart.setProduct(new Products());
        assertNull(addToCart.getProductName());
    }

    @Test
    public void testGetProductName() {
        Products products = new Products();
        products.setId(123L);
        products.setSize("size");
        products.setName("name");
        products.setAdded_on("added_on");
        products.setPrice("price");
        AddToCart addToCart = new AddToCart();
        addToCart.setProduct(products);
        assertEquals("name", addToCart.getProductName());
    }
}

