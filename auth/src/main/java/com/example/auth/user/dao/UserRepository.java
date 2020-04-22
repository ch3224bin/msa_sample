package com.example.auth.user.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
