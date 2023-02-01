package com.prostopizza.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.servlet.http.Cookie;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletResponse;

public class CookieUtilsTest {
    @Test
    public void testAddCookie() {
        MockHttpServletResponse mockHttpServletResponse = new MockHttpServletResponse();
        CookieUtils.addCookie(mockHttpServletResponse, "name", "value", 3);
        assertNull(mockHttpServletResponse.getRedirectedUrl());
        Cookie[] cookies = mockHttpServletResponse.getCookies();
        assertEquals(1, cookies.length);
        Cookie cookie = cookies[0];
        assertEquals("/", cookie.getPath());
        assertEquals("name", cookie.getName());
        assertTrue(cookie.isHttpOnly());
        assertEquals(0, cookie.getVersion());
        assertEquals("value", cookie.getValue());
        assertEquals(3, cookie.getMaxAge());
    }

    @Test
    public void testSerialize() {
        assertEquals("rO0ABXQABm9iamVjdA==", CookieUtils.serialize("object"));
    }
}

