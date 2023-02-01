package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserRolesTest {
    @Test
    public void testSetUser_id() {
        UserRoles userRoles = new UserRoles();
        userRoles.setUser_id(1L);
        assertEquals(1L, userRoles.getUser_id());
    }

    @Test
    public void testSetRoles_id() {
        UserRoles userRoles = new UserRoles();
        userRoles.setRoles_id(1L);
        assertEquals(1L, userRoles.getRoles_id());
    }
}

