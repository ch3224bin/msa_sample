package com.example.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/{id}")
	public String getUser(@PathVariable long id) {
		return "User " + id;
	}
}
