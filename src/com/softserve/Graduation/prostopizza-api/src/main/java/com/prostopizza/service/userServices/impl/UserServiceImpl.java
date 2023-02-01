package com.prostopizza.service.userServices.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import com.prostopizza.service.userServices.UserService;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.prostopizza.repository.UserRepository;
import com.prostopizza.model.User;

@Service
public class UserServiceImpl implements UserService {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
    LocalDateTime now;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    final
    UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findByEmail(String email) throws Exception {
        return userRepo.findByEmail(email).orElseThrow(()->new Exception("User Not found.."));
    }

    @Override
    public User getUserDetailById(long userId) throws Exception {

        return userRepo.findById(userId).orElseThrow(()->new Exception("User Not found.."));
    }

    @Override
    public User signUpUser(HashMap<String, String> signUpRequest) throws Exception {
        try {
            if(userRepo.findByEmail(signUpRequest.get("email")).isPresent()) {
                throw new Exception("User is already registered with email");
            }
            now = LocalDateTime.now();
            User user = new User();
            user.setName(signUpRequest.get("name"));
            user.setEmail(signUpRequest.get("email"));
            user.setPassword(signUpRequest.get("password"));
            userRepo.save(user);
            return user;
        }catch(Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}