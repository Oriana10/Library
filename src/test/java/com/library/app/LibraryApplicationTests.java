package com.library.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.library.app.model.User;
import com.library.app.repository.UserRepository;

@SpringBootTest
class LibraryApplicationTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
/*
	@Test
	public void createUser() {
		User user = new User();
		user.setId(1L);
		user.setUsername("oriana");
		user.setPassword(encoder.encode("123"));
		User returnedUser = userRepository.save(user);
	
		assertTrue(returnedUser.getPassword().equals(user.getPassword()));
	}
*/
}
