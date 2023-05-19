package com.example.securitydeneme.services;

import com.example.securitydeneme.config.UserDetails;
import com.example.securitydeneme.entities.User;
import com.example.securitydeneme.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userInfo = userRepository.findByName(username);
        return userInfo.map(UserDetails::new).
                orElseThrow(() -> new UsernameNotFoundException("user not found" + username));

    }
}
