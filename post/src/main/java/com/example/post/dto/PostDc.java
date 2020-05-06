package com.example.post.dto;

import java.time.LocalDateTime;

import com.example.post.domain.Post;

import lombok.Getter;

public class PostDc {
	@Getter
	static public class Res {
		private long id;
		private String title;
		private String content;
		private LocalDateTime createdAt;
		private User createdBy;
		
		public Res(Post post) {
			this.id = post.getId();
			this.title = post.getTitle();
			this.content = post.getContent();
			this.createdAt = post.getCreatedAt();
		}
		
		public Res(Post post, User createdBy) {
			this.id = post.getId();
			this.title = post.getTitle();
			this.content = post.getContent();
			this.createdAt = post.getCreatedAt();
			this.createdBy = createdBy;
		}
	}
}
