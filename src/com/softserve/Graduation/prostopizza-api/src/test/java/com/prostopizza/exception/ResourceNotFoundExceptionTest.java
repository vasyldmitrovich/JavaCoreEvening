package com.prostopizza.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ResourceNotFoundExceptionTest {
    @Test
    public void testConstructor() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("resourceName",
                "fieldName", "fieldValue");
        assertTrue(actualResourceNotFoundException.getFieldValue() instanceof String);
        assertEquals("resourceName", actualResourceNotFoundException.getResourceName());
        assertEquals("fieldName", actualResourceNotFoundException.getFieldName());
    }
}

