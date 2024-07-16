package com.example.performans.service;


import com.example.performans.model.User;
import com.example.performans.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public void registerUser(User user) {

        userRepository.save(user);
    }
}
