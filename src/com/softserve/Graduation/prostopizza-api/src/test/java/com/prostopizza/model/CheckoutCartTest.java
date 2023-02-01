package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class CheckoutCartTest {
    @Test
    public void testSetId() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setId(123L);
        assertEquals(123L, checkoutCart.getId());
    }

    @Test
    public void testSetOrder_id() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setOrder_id("order_id");
        assertEquals("order_id", checkoutCart.getOrder_id());
    }

    @Test
    public void testSetPayment_type() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setPayment_type("payment_type");
        assertEquals("payment_type", checkoutCart.getPayment_type());
    }

    @Test
    public void testSetDelivery_address() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setDelivery_address("42 Main St");
        assertEquals("42 Main St", checkoutCart.getDelivery_address());
    }

    @Test
    public void testSetQty() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setQty(1);
        assertEquals(1, checkoutCart.getQty());
    }

    @Test
    public void testSetPrice() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setPrice(10.0);
        assertEquals(10.0, checkoutCart.getPrice());
    }

    @Test
    public void testSetOrder_date() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setOrder_date("2020-03-01");
        assertEquals("2020-03-01", checkoutCart.getOrder_date());
    }

    @Test
    public void testSetUser_id() {
        CheckoutCart checkoutCart = new CheckoutCart();
        checkoutCart.setUser_id(1L);
        assertEquals(1L, checkoutCart.getUser_id());
    }

    @Test
    public void testSetProduct() {
        CheckoutCart checkoutCart = new CheckoutCart();
        Products products = new Products();
        checkoutCart.setProduct(products);
        assertSame(products, checkoutCart.getProduct());
    }
}

