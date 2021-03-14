package com.example.spring_boot_3_1_1.dao;

import com.example.spring_boot_3_1_1.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> userList();

    User findUserByName(String username);
}
