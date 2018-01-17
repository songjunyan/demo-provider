package com.example.demo.controller;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sls
 * @date 2018/1/2
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id){
        User findOne = userRepository.findOne(id);
        return findOne;
    }
}
