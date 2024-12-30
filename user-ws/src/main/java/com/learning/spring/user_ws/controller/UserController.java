package com.learning.spring.user_ws.controller;

import com.learning.spring.user_ws.request.UserRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    Environment env;

    @GetMapping("/status")
    public String checkUserStatus(){
        return "working on port : "+env.getProperty("local.server.port");
    }

    @PostMapping()
    public String createUser( @Valid @RequestBody UserRequest userRequest){
        return "User Created";
    }

}
