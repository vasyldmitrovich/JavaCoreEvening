package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IngredientsTest {
    @Test
    public void testSetId() {
        Ingredients ingredients = new Ingredients();
        ingredients.setId(123L);
        assertEquals(123L, ingredients.getId());
    }

    @Test
    public void testSetName() {
        Ingredients ingredients = new Ingredients();
        ingredients.setName("name");
        assertEquals("name", ingredients.getName());
    }
}

