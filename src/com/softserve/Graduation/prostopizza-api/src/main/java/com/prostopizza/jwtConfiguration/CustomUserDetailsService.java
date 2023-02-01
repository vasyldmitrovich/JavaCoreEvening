package com.prostopizza.jwtConfiguration;

import javax.transaction.Transactional;


import com.prostopizza.exception.ResourceNotFoundException;
import com.prostopizza.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prostopizza.service.userServices.UserService;
import com.prostopizza.model.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

        final
        UserService userService;
        final
        UserRepository userRepository;

    public CustomUserDetailsService(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email)
                throws UsernameNotFoundException {

                User user = userRepository.findByEmail(email)
                        .orElseThrow(()->
                                new UsernameNotFoundException("User not found with email: "+ email)
                        );
                return UserPrincipal.create(user);
        }

        // This method is used by JWTAuthenticationFilter
        @Transactional
        public UserDetails loadUserById(Long id) {
                User user = userRepository.findById(id).orElseThrow(
                        ()-> new ResourceNotFoundException("User", "id", id)
                );
                return UserPrincipal.create(user);
        }

}
