package com.prostopizza.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class RoleTest {
    @Test
    public void testSetId() {
        Role role = new Role();
        role.setId(123L);
        assertEquals(123L, role.getId().longValue());
    }

    @Test
    public void testSetName() {
        Role role = new Role();
        role.setName("name");
        assertEquals("name", role.getName());
    }

    @Test
    public void testSetUsers() {
        Role role = new Role();
        HashSet<User> userSet = new HashSet<User>();
        role.setUsers(userSet);
        assertSame(userSet, role.getUsers());
    }

    @Test
    public void testGetAuthority() {
        assertNull((new Role()).getAuthority());
    }
}

