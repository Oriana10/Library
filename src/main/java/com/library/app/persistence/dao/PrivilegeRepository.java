package com.library.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.persistence.model.Privilege;


public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);

}
