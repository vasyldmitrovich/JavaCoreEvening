package com.prostopizza.controller.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LoginRequestTest {
    @Test
    public void testSetEmail() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail("email");
        assertEquals("email", loginRequest.getEmail());
    }

    @Test
    public void testSetPassword() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword("passwordtest");
        assertEquals("passwordtest", loginRequest.getPassword());
    }
}

