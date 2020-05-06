package com.example.post.service;

import org.springframework.stereotype.Service;

import com.example.post.client.UserServiceClient;
import com.example.post.dao.PostRepository;
import com.example.post.dto.PostDc;

@Service
public class PostService {
	
	private UserServiceClient userServiceClient;
	private PostRepository postRepository;

	public PostService(UserServiceClient userServiceClient, PostRepository postRepository) {
		this.userServiceClient = userServiceClient;
		this.postRepository = postRepository;
	}
	
	public PostDc.Res getPost(long id) {
		return postRepository.findById(id)
				.map(post -> new PostDc.Res(post, userServiceClient.getUser(post.getCreatedBy())))
				.orElseThrow(() -> new RuntimeException());
	}
}
