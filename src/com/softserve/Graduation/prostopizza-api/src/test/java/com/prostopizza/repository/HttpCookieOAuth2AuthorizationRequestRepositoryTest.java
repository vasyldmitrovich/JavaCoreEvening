package com.prostopizza.repository;

import static org.junit.jupiter.api.Assertions.assertNull;

import javax.servlet.ServletContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;

public class HttpCookieOAuth2AuthorizationRequestRepositoryTest {
    //@Autowired
    private ServletContext servletContext;

    @Test
    public void testLoadAuthorizationRequest() {
        HttpCookieOAuth2AuthorizationRequestRepository httpCookieOAuth2AuthorizationRequestRepository = new HttpCookieOAuth2AuthorizationRequestRepository();
        assertNull(httpCookieOAuth2AuthorizationRequestRepository.loadAuthorizationRequest(new MockHttpServletRequest()));
    }

    @Test
    public void testRemoveAuthorizationRequest() {
        HttpCookieOAuth2AuthorizationRequestRepository httpCookieOAuth2AuthorizationRequestRepository = new HttpCookieOAuth2AuthorizationRequestRepository();
        assertNull(httpCookieOAuth2AuthorizationRequestRepository.removeAuthorizationRequest(new MockHttpServletRequest()));
    }
}

