package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PizzeriasTest {
    @Test
    public void testSetId() {
        Pizzerias pizzerias = new Pizzerias();
        pizzerias.setId(123L);
        assertEquals(123L, pizzerias.getId());
    }

    @Test
    public void testSetName() {
        Pizzerias pizzerias = new Pizzerias();
        pizzerias.setName("name");
        assertEquals("name", pizzerias.getName());
    }

    @Test
    public void testSetOpenFrom() {
        Pizzerias pizzerias = new Pizzerias();
        pizzerias.setOpenFrom("jane.doe@example.org");
        assertEquals("jane.doe@example.org", pizzerias.getOpenFrom());
    }

    @Test
    public void testSetOpenTo() {
        Pizzerias pizzerias = new Pizzerias();
        pizzerias.setOpenTo("alice.liddell@example.org");
        assertEquals("alice.liddell@example.org", pizzerias.getOpenTo());
    }
}

