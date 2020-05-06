package com.example.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
