package com.example.securitydeneme.controller;

import com.example.securitydeneme.dto.AuthRequest;
import com.example.securitydeneme.entities.User;
import com.example.securitydeneme.repo.UserRepository;
import com.example.securitydeneme.services.JwtService;
import com.example.securitydeneme.services.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    private final JwtService jwtService;

    private  AuthenticationManager manager;
    public UserController(UserService userService, UserRepository userRepository, JwtService jwtService, AuthenticationManager manager) {
        this.userService = userService;
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.manager = manager;
    }

    @GetMapping("/alluser")
    public List<User> user() {
        System.out.println("freeePage giriş yapıldı");
        return userService.getUser();
    }

    @PostMapping("/add")
    public String addNewUser(@RequestBody User user) {
        System.out.println(user.toString());
        return userService.addUser(user);
    }
    @PostMapping("/authenticate")
    public String authenticatedAndGenerate(@RequestBody AuthRequest authRequest){
        Authentication authenticate = manager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
        if (authenticate.isAuthenticated()){
            return jwtService.generateToken(authRequest.getUserName());
        }
        else {
            throw  new UsernameNotFoundException("invalid user");
        }


    }
}
