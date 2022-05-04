package com.example.mongotest.web;

import java.util.List;
import java.util.Set;

import com.example.mongotest.domain.User;
import com.example.mongotest.domain.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final UserRepository userRepository;

    @GetMapping("/user")
    public List<User> data() {
        return userRepository.findAll();
    }
}
