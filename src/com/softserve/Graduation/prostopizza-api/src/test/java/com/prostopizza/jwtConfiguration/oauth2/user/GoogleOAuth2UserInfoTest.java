package com.prostopizza.jwtConfiguration.oauth2.user;

import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class GoogleOAuth2UserInfoTest {
    @Test
    public void testGetId() {
        assertNull((new GoogleOAuth2UserInfo(new HashMap<String, Object>())).getId());
    }

    @Test
    public void testGetName() {
        assertNull((new GoogleOAuth2UserInfo(new HashMap<String, Object>())).getName());
    }

    @Test
    public void testGetEmail() {
        assertNull((new GoogleOAuth2UserInfo(new HashMap<String, Object>())).getEmail());
    }

    @Test
    public void testGetImageUrl() {
        assertNull((new GoogleOAuth2UserInfo(new HashMap<String, Object>())).getImageUrl());
    }
}

