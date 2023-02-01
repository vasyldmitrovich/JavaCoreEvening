package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PhonesTest {
    @Test
    public void testSetId() {
        Phones phones = new Phones();
        phones.setId(123L);
        assertEquals(123L, phones.getId());
    }

    @Test
    public void testSetMobile() {
        Phones phones = new Phones();
        phones.setMobile("mobile");
        assertEquals("mobile", phones.getMobile());
    }
}

