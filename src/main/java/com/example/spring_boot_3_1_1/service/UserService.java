package com.example.spring_boot_3_1_1.service;

import com.example.spring_boot_3_1_1.entity.Role;
import com.example.spring_boot_3_1_1.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> userList();

    Role getRoleByName(String name);
}
