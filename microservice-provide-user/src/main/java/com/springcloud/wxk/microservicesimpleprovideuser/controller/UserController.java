package com.springcloud.wxk.microservicesimpleprovideuser.controller;

import com.springcloud.wxk.microservicesimpleprovideuser.dao.UserRepository;
import com.springcloud.wxk.microservicesimpleprovideuser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
