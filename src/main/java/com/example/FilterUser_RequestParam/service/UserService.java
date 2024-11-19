package com.example.FilterUser_RequestParam.service;


import com.example.FilterUser_RequestParam.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<User> users = List.of(
            new User(1L, "John Doe", 25, "NewYork"),
            new User(2L, "Jane Smith", 30, "San Francisco"),
            new User(3L, "Robert Brown", 25, "NewYork"),
            new User(4L, "Alice Johnson", 22, "Los Angeles")
    );

    public List<User> filterUsers(Integer age, String city) {
        return users.stream()
                .filter(user -> (age == null || user.getAge() == age) &&
                        (city == null || user.getCity().equalsIgnoreCase(city)))
                .collect(Collectors.toList());
    }
}
