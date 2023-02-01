package com.prostopizza.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class BadRequestExceptionTest {
    @Test
    public void testConstructor() {
        Throwable throwable = new Throwable();
        assertSame((new BadRequestException("An error occurred", throwable)).getCause(), throwable);
    }

    @Test
    public void testConstructor2() {
        BadRequestException actualBadRequestException = new BadRequestException("An error occurred");
        assertEquals("com.prostopizza.exception.BadRequestException: An error occurred",
                actualBadRequestException.toString());
        assertEquals("An error occurred", actualBadRequestException.getLocalizedMessage());
        assertNull(actualBadRequestException.getCause());
        assertEquals("An error occurred", actualBadRequestException.getMessage());
        assertEquals(0, actualBadRequestException.getSuppressed().length);
    }
}

