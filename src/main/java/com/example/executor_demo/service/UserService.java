package com.example.executor_demo.service;

import com.example.executor_demo.model.User;
import com.example.executor_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUser() {
        // Simulate a call to the database
        Optional<User> user = userRepository.findById(1L);
        return user.map(User::getName).orElse("User not found");
    }
}
