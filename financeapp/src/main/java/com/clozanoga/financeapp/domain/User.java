package com.clozanoga.financeapp.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Document(collection = "users")
public class User implements UserDetails {

	private static final long serialVersionUID = 1403497362832900069L;

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	private Long id;
	
	@Email(message = "Username needs to be an email")
	@NotBlank(message = "Username is required")
	@Indexed(unique=true)
	private String username;
	@NotBlank(message = "Fullname is required")
	private String fullName;
	@NotBlank(message = "Password field is required")
	private String password;
	
	private List<Portfolio> portfolios;
	
	private LocalDate createdAt;
	private LocalDate updatedAt;
	
	public User() {
		portfolios = new ArrayList<>();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
		
	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {		
		return null;
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
	
}
