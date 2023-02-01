package com.prostopizza.controller;

import com.prostopizza.controller.request.ApiResponse;
import com.prostopizza.model.User;
import com.prostopizza.service.userServices.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/signUp")
public class SignUpController {
    final
    UserService userService;

    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("user")
    public ResponseEntity<?> userLogin(@RequestBody HashMap<String,String> signUpRequest) {
        try {
            User user = userService.signUpUser(signUpRequest);
            return  ResponseEntity.ok(user);
        }catch(Exception e ) {
            return ResponseEntity.badRequest().body(new ApiResponse(false,e.getMessage()));
        }
    }
}
