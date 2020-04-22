package com.example.auth.user.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "T_USER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "username", length = 20, unique = true, nullable = false)
	private String username;
	
	@Column(name = "password", length = 400, nullable = false)
	private String password;
	
	@Column(name = "user_type", nullable = false)
	private int userType;
	
	@Column(name = "date", nullable = false)
	private LocalDateTime date;
}
