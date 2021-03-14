package com.example.spring_boot_3_1_1.dao;

import com.example.spring_boot_3_1_1.entity.Role;

public interface RoleDao {
    Role getRoleByName(String name);
}
