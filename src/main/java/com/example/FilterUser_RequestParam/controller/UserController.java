package com.example.FilterUser_RequestParam.controller;


import com.example.FilterUser_RequestParam.model.User;
import com.example.FilterUser_RequestParam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/filter")
    public List<User> getFilteredUsers(@RequestParam(required = false ) Integer age,
                                       @RequestParam(required = false) String city) {
        return userService.filterUsers(age, city);
    }
}
