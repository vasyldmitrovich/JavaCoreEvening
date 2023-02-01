package com.prostopizza.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class OAuth2AuthenticationProcessingExceptionTest {
    @Test
    public void testConstructor() {
        OAuth2AuthenticationProcessingException actualOAuth2AuthenticationProcessingException = new OAuth2AuthenticationProcessingException(
                "msg");
        assertEquals("com.prostopizza.exception.OAuth2AuthenticationProcessingException: msg",
                actualOAuth2AuthenticationProcessingException.toString());
        assertEquals("msg", actualOAuth2AuthenticationProcessingException.getLocalizedMessage());
        assertNull(actualOAuth2AuthenticationProcessingException.getCause());
        assertEquals("msg", actualOAuth2AuthenticationProcessingException.getMessage());
        assertEquals(0, actualOAuth2AuthenticationProcessingException.getSuppressed().length);
    }

    @Test
    public void testConstructor2() {
        Throwable throwable = new Throwable();
        assertSame((new OAuth2AuthenticationProcessingException("msg", throwable)).getCause(), throwable);
    }
}

