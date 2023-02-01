package com.prostopizza.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AppPropertiesTest {
    @Test
    public void testAuthSetTokenExpirationMsec() {
        AppProperties.Auth auth = new AppProperties.Auth();
        auth.setTokenExpirationMsec(1L);
        assertEquals(1L, auth.getTokenExpirationMsec());
    }

    @Test
    public void testAuthSetTokenSecret() {
        AppProperties.Auth auth = new AppProperties.Auth();
        auth.setTokenSecret("ABC123");
        assertEquals("ABC123", auth.getTokenSecret());
    }

    @Test
    public void testOAuth2AuthorizedRedirectUris() {
        AppProperties.OAuth2 oAuth2 = new AppProperties.OAuth2();
        ArrayList<String> stringList = new ArrayList<String>();
        AppProperties.OAuth2 actualAuthorizedRedirectUrisResult = oAuth2.authorizedRedirectUris(stringList);
        assertSame(oAuth2, actualAuthorizedRedirectUrisResult);
        assertSame(stringList, actualAuthorizedRedirectUrisResult.getAuthorizedRedirectUris());
    }
}

