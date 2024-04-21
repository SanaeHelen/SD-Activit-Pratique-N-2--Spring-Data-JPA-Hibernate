package com.example.jpa.service;

import com.example.jpa.entities.Role;
import com.example.jpa.entities.User;
import com.example.jpa.repositories.RoleRepository;
import com.example.jpa.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;


    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findRoleByRoleName(String rolename) {
        return roleRepository.findByRoleName(rolename);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        User user= findUserByUserName(username);
        Role role = findRoleByRoleName(rolename);
        if (user.getRoles()!=null) {
            user.getRoles().add(role);
            role.getUsers().add(user);
        }

    }

    @Override
    public User authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        if(user==null) throw new RuntimeException("Bad credentials");
        if (user.getPassword().equals(password)){
           return user;
        }
        throw new RuntimeException("Bad credentials") ;
    }
}
