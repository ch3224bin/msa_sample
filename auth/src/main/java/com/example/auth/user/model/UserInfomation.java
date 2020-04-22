package com.example.auth.user.model;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.auth.user.domain.User;

import lombok.Getter;

@Getter
public class UserInfomation implements UserDetails {

	private static final long serialVersionUID = 6892441316820244427L;
	
	private String username;
	private String password;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;
	private boolean isEnabled;
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserInfomation(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.authorities = Arrays.asList(new SimpleGrantedAuthority("USER"), new SimpleGrantedAuthority("ADMIN"));
		this.isAccountNonExpired = true;
		this.isAccountNonLocked = true;
		this.isCredentialsNonExpired = true;
		this.isEnabled = true;
	}
}
