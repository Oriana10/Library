package com.library.app.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.app.persistence.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	User findByEmail(String email);
	
}
