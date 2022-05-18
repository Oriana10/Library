package com.library.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.persistence.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
