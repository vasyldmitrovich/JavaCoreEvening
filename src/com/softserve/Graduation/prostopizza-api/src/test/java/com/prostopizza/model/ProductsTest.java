package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductsTest {
    @Test
    public void testSetId() {
        Products products = new Products();
        products.setId(123L);
        assertEquals(123L, products.getId());
    }

    @Test
    public void testSetName() {
        Products products = new Products();
        products.setName("name");
        assertEquals("name", products.getName());
    }

    @Test
    public void testSetPrice() {
        Products products = new Products();
        products.setPrice("price");
        assertEquals("price", products.getPrice());
    }

    @Test
    public void testSetSize() {
        Products products = new Products();
        products.setSize("size");
        assertEquals("size", products.getSize());
    }

    @Test
    public void testSetAdded_on() {
        Products products = new Products();
        products.setAdded_on("added_on");
        assertEquals("added_on", products.getAdded_on());
    }
}

