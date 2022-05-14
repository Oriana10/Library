package com.library.app.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty; // spring boot validation

//import org.hibernate.validator.constraints.NotEmpty; deprecated
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {

	private static final long serialVersionUID = -618913830215405178L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "El nombre no puede ser nulo o estar vacio")
	@NotBlank(message = "El nombre no puede ser whitespace")
	private String username;
	
	private String password;
	
	
	/*--------- UserDetails Methods --------*/

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// return List.of(new SimpleGrantedAuthority("ROLE_SENSEI"));
		return null;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
	/*--------- Constructors --------*/
	
	public User() {
		super();
	}
	
	public User(Long id,
			@NotEmpty(message = "El nombre no puede ser nulo o estar vacio") @NotBlank(message = "El nombre no puede ser whitespace") String username,
			String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	/*--------- Getters, Setters --------*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
