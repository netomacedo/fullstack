package com.example.fullstack.service;

import com.example.fullstack.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    User findByUserName(String userName);

    List<User> findAllUsers();

    Long numberOfUsers();
}
