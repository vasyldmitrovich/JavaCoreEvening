package com.prostopizza.jwtConfiguration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import com.prostopizza.config.AppProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {JwtTokenProvider.class, AppProperties.class})
@ExtendWith(SpringExtension.class)
public class JwtTokenProviderTest {
    @MockBean
    private AppProperties appProperties;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Test
    public void testValidateToken() {
        when(this.appProperties.getAuth()).thenReturn(new AppProperties.Auth());
        assertFalse(this.jwtTokenProvider.validateToken("ABC123"));
    }

    @Test
    public void testValidateToken2() {
        AppProperties.Auth auth = new AppProperties.Auth();
        auth.setTokenSecret("ABC123");
        when(this.appProperties.getAuth()).thenReturn(auth);
        assertFalse(this.jwtTokenProvider.validateToken("ABC123"));
    }

    @Test
    public void testValidateToken3() {
        when(this.appProperties.getAuth()).thenReturn(new AppProperties.Auth());
        assertFalse(this.jwtTokenProvider.validateToken("JWT claims string is empty."));
    }

    @Test
    public void testValidateToken4() {
        AppProperties.Auth auth = new AppProperties.Auth();
        auth.setTokenSecret("ABC123");
        when(this.appProperties.getAuth()).thenReturn(auth);
        assertFalse(this.jwtTokenProvider.validateToken(""));
    }
}

