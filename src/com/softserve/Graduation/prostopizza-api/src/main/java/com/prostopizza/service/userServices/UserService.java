package com.prostopizza.service.userServices;

import com.prostopizza.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public interface UserService {
    User findByEmail(String email) throws Exception;
    User getUserDetailById(long userId) throws Exception;
    User signUpUser(HashMap<String,String> signUpRequest) throws Exception;
}
