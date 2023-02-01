package com.prostopizza.controller;

import com.prostopizza.model.Products;
import com.prostopizza.service.productService.ProductServices;
import com.prostopizza.service.userServices.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/admin")
@ResponseBody
public class AdminController {
    private final UserService userService;
    final ProductServices productServices;
    public AdminController(UserService userService, ProductServices productServices) {
        this.userService = userService;
        this.productServices = productServices;
    }


}
