package com.prostopizza.controller;

import com.prostopizza.exception.ResourceNotFoundException;
import com.prostopizza.jwtConfiguration.UserPrincipal;
import com.prostopizza.model.User;
import com.prostopizza.model.UserRoles;
import com.prostopizza.repository.RoleRepository;
import com.prostopizza.repository.UserRepository;
import com.prostopizza.repository.UserRolesRepository;
import com.prostopizza.security.CurrentUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final UserRolesRepository userRolesRepository;
    private final RoleRepository roleRepository;
    public UserController(UserRepository userRepository, UserRolesRepository userRolesRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal){
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(()-> new ResourceNotFoundException("User","id",userPrincipal.getId()));
    }
    @GetMapping("/user/role")
    @PreAuthorize("hasRole('USER')")
    public String gerCurrentUserRole(@CurrentUser UserPrincipal userPrincipal){
        return roleRepository.findRoleNameById(userRolesRepository.findRoleNameByUserId(userPrincipal.getId()));

    }
}
