package com.example.securitydeneme.controller;

import org.apache.coyote.Response;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

@RequestMapping("/home")
@PreAuthorize("hasAnyAuthority('ADMIN')")

public class HomeController {

    @GetMapping("/admin")
    public String helloWorld(){
        System.out.println("admin girişi yapıldı");
        return "hello admin";
    }

    @PreAuthorize("hasAnyAuthority('USER')")
    @GetMapping("/user")
    public String helloadmin(){
        System.out.println("hello user giriş yapıldı");
        return "hello user"  ;
    }

}
