package com.mockito.mockito.service;

import com.mockito.mockito.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> listUsers();
}
