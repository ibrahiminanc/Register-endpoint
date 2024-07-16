package com.example.performans.controller;

import com.example.performans.model.User;
import com.example.performans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserRequest request){//Json nesneye dönüştürür.
        User user = new User();
        user.setUserName(request.getEmail());
        user.setPassword(request.getPassword());

        userService.registerUser(user);
    }

}
