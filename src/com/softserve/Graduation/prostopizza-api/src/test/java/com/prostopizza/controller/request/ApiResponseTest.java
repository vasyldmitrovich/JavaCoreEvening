package com.prostopizza.controller.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ApiResponseTest {
    @Test
    public void testSetSuccess() {
        ApiResponse apiResponse = new ApiResponse(true, "Test API response");
        apiResponse.setSuccess(true);
        assertTrue(apiResponse.isSuccess());
    }

    @Test
    public void testSetMessage() {
        ApiResponse apiResponse = new ApiResponse(true, "Test API response");
        apiResponse.setMessage("Not all who wander are lost");
        assertEquals("Not all who wander are lost", apiResponse.getMessage());
    }
}

