package com.prostopizza.controller.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthResponseTest {
    @Test
    public void testSetAccessToken() {
        AuthResponse authResponse = new AuthResponse("ABC123");
        authResponse.setAccessToken("ABC123");
        assertEquals("ABC123", authResponse.getAccessToken());
    }

    @Test
    public void testSetTokenType() {
        AuthResponse authResponse = new AuthResponse("ABC123");
        authResponse.setTokenType("ABC123");
        assertEquals("ABC123", authResponse.getTokenType());
    }
}

