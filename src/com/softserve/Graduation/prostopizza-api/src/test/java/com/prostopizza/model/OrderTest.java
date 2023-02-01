package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    public void testSetId() {
        Order order = new Order();
        order.setId(123L);
        assertEquals(123L, order.getId());
    }

    @Test
    public void testSetOrder_id() {
        Order order = new Order();
        order.setOrder_id("order_id");
        assertEquals("order_id", order.getOrder_id());
    }

    @Test
    public void testSetProduct_id() {
        Order order = new Order();
        order.setProduct_id(1L);
        assertEquals(1L, order.getProduct_id());
    }

    @Test
    public void testSetQty() {
        Order order = new Order();
        order.setQty(1);
        assertEquals(1, order.getQty());
    }

    @Test
    public void testSetPrice() {
        Order order = new Order();
        order.setPrice(1);
        assertEquals(1, order.getPrice());
    }

    @Test
    public void testSetOrder_on() {
        Order order = new Order();
        order.setOrder_on("order_on");
        assertEquals("order_on", order.getOrder_on());
    }

    @Test
    public void testSetStatus() {
        Order order = new Order();
        order.setStatus(1);
        assertEquals(1, order.getStatus());
    }
}

