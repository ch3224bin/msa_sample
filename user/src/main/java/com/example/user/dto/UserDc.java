package com.example.user.dto;

import com.example.user.domain.User;

import lombok.Getter;

public class UserDc {
	@Getter
	static public class Req {
		private String username;
		private String email;
	}
	
	@Getter
	static public class Res {
		private long id;
		private String username;
		private String email;
		
		public Res(User user) {
			this.id = user.getId();
			this.username = user.getUsername();
			this.email = user.getEmail();
		}
	}
}
