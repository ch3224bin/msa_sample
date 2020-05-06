package com.example.user.service;

import org.springframework.stereotype.Service;

import com.example.user.dao.UserRepository;
import com.example.user.dto.UserDc;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserDc.Res getUser(long id) {
		return userRepository.findById(id)
				.map(UserDc.Res::new)
				.orElseThrow(() -> new RuntimeException());
	}
}
