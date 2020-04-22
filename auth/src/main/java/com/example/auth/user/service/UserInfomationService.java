package com.example.auth.user.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.auth.user.dao.UserRepository;
import com.example.auth.user.model.UserInfomation;

@Service
public class UserInfomationService implements UserDetailsService {

	private UserRepository userRepository;
	
	public UserInfomationService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username)
				.map(UserInfomation::new)
				.orElseThrow(() -> new UsernameNotFoundException(username));
	}

}
