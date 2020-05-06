package com.example.post.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.post.dto.PostDc;
import com.example.post.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private PostService postService;
	
	public PostController(PostService postService) {
		this.postService = postService;
	}

	@GetMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public PostDc.Res getPost(@PathVariable("id") long id) {
		return postService.getPost(id);
	}
}
