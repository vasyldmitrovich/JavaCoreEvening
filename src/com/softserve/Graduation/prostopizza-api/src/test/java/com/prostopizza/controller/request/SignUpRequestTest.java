package com.prostopizza.controller.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignUpRequestTest {
    @Test
    public void testSetName() {
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setName("name");
        assertEquals("name", signUpRequest.getName());
    }

    @Test
    public void testSetEmail() {
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setEmail("email");
        assertEquals("email", signUpRequest.getEmail());
    }

    @Test
    public void testSetPassword() {
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setPassword("passwordtest");
        assertEquals("passwordtest", signUpRequest.getPassword());
    }
}

