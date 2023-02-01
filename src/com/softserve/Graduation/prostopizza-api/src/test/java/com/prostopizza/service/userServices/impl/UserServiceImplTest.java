package com.prostopizza.service.userServices.impl;

import static org.junit.jupiter.api.Assertions.assertSame;

import com.prostopizza.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UserServiceImplTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testConstructor() {
        assertSame((new UserServiceImpl(this.userRepository)).userRepo, this.userRepository);
    }
}

