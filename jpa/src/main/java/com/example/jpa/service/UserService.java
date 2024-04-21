package com.example.jpa.service;

import com.example.jpa.entities.Role;
import com.example.jpa.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String rolename);
    void addRoleToUser(String username, String rolename);
    User authenticate(String username,String password);
}
