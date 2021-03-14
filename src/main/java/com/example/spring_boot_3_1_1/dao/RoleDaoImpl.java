package com.example.spring_boot_3_1_1.dao;

import com.example.spring_boot_3_1_1.entity.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class RoleDaoImpl implements RoleDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByName(String name) {
        TypedQuery<Role> role = entityManager.createQuery("from Role R where R.name = :name", Role.class);
        role.setParameter("name", name);
        return role.getSingleResult();
    }
}
