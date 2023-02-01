package com.prostopizza.jwtConfiguration;

import com.prostopizza.model.AuthProvider;
import com.prostopizza.model.User;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserPrincipalTest {
    @Test
    public void testCreate() {
        User user = new User();
        user.setPassword("passwordtest");
        user.setEmail("email");
        user.setId(123L);
        user.setImageUrl("https://example.org/example");
        user.setProvider(AuthProvider.local);
        user.setName("name");
        user.setProviderId("42");
        HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
        UserPrincipal actualCreateResult = UserPrincipal.create(user, stringObjectMap);
        assertEquals("passwordtest", actualCreateResult.getPassword());
        assertEquals(123L, actualCreateResult.getId().longValue());
        assertEquals("email", actualCreateResult.getEmail());
        assertSame(stringObjectMap, actualCreateResult.getAttributes());
    }

    @Test
    public void testCreate2() {
        User user = new User();
        user.setPassword("passwordtest");
        user.setEmail("email");
        user.setId(123L);
        user.setImageUrl("https://example.org/example");
        user.setProvider(AuthProvider.local);
        user.setName("name");
        user.setProviderId("42");
        UserPrincipal actualCreateResult = UserPrincipal.create(user);
        assertEquals("passwordtest", actualCreateResult.getPassword());
        assertEquals(123L, actualCreateResult.getId().longValue());
        assertEquals("email", actualCreateResult.getEmail());
    }

    @Test
    public void testIsAccountNonExpired() {
        assertTrue(UserPrincipal.create(new User()).isAccountNonExpired());
    }

    @Test
    public void testIsAccountNonLocked() {
        assertTrue(UserPrincipal.create(new User()).isAccountNonLocked());
    }

    @Test
    public void testIsCredentialsNonExpired() {
        assertTrue(UserPrincipal.create(new User()).isCredentialsNonExpired());
    }

    @Test
    public void testIsEnabled() {
        assertTrue(UserPrincipal.create(new User()).isEnabled());
    }

    @Test
    public void testSetAttributes() {
        UserPrincipal createResult = UserPrincipal.create(new User());
        HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
        createResult.setAttributes(stringObjectMap);
        assertSame(stringObjectMap, createResult.getAttributes());
    }

    @Test
    public void testGetName() {
        assertEquals("0", UserPrincipal.create(new User()).getName());
    }

    @Test
    public void testEquals() {
        assertNotEquals("o", UserPrincipal.create(new User()));
        assertNotEquals(null, UserPrincipal.create(new User()));
    }

    @Test
    public void testHashCode() {
        assertEquals(31, UserPrincipal.create(new User()).hashCode());
    }
}

