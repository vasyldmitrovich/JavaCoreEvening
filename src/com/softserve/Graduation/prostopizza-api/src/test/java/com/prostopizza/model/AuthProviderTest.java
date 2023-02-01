package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthProviderTest {
    @Test
    public void testValueOf() {
        assertEquals(AuthProvider.google, AuthProvider.valueOf("google"));
    }

    @Test
    public void testValues() {
        assertEquals(2, AuthProvider.values().length);
    }
}

