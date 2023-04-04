package com.mockito.mockito.controller;

import com.mockito.mockito.entity.User;
import com.mockito.mockito.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    @GetMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("all")
    public List<User> getUsers(){
        return userService.listUsers();
    }
}

