package com.example.post.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.post.client.config.UserServiceClientRequestConfiguration;
import com.example.post.dto.User;

@FeignClient(value = "userservice", configuration = UserServiceClientRequestConfiguration.class)
public interface UserServiceClient {

	@GetMapping(value = "/users/{id}", consumes = "application/json")
	User getUser(@PathVariable("id") long id);
	
}
