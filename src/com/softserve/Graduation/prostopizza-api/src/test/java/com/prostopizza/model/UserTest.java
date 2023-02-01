package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testSetImageUrl() {
        User user = new User();
        user.setImageUrl("https://example.org/example");
        assertEquals("https://example.org/example", user.getImageUrl());
    }

    @Test
    public void testSetId() {
        User user = new User();
        user.setId(123L);
        assertEquals(123L, user.getId());
    }

    @Test
    public void testSetName() {
        User user = new User();
        user.setName("name");
        assertEquals("name", user.getName());
    }

    @Test
    public void testSetEmail() {
        User user = new User();
        user.setEmail("email");
        assertEquals("email", user.getEmail());
    }

    @Test
    public void testSetPassword() {
        User user = new User();
        user.setPassword("iloveyou");
        assertEquals("iloveyou", user.getPassword());
    }

    @Test
    public void testSetProvider() {
        User user = new User();
        user.setProvider(AuthProvider.local);
        assertEquals(AuthProvider.local, user.getProvider());
    }

    @Test
    public void testSetProviderId() {
        User user = new User();
        user.setProviderId("42");
        assertEquals("42", user.getProviderId());
    }
}

