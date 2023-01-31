package com.example.JWTtoken.service;

import com.example.JWTtoken.entity.Role;
import com.example.JWTtoken.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
