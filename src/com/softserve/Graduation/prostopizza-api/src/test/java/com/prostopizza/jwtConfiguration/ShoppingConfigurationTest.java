package com.prostopizza.jwtConfiguration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class ShoppingConfigurationTest {
    @Test
    public void testValidationWithHashMap() throws Exception {
        assertThrows(Exception.class,
                () -> ShoppingConfiguration.validationWithHashMap(new String[]{"keys"}, new HashMap<String, String>()));
        assertFalse(ShoppingConfiguration.validationWithHashMap(new String[]{}, new HashMap<String, String>()));
        assertThrows(Exception.class, () -> ShoppingConfiguration.validationWithHashMap(new String[]{"keys"}, null));
    }
}

