package com.example.securitydeneme.controller;

import com.example.securitydeneme.entities.User;
import com.example.securitydeneme.repo.UserRepository;
import com.example.securitydeneme.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
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
}
