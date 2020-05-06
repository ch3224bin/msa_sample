package com.example.post.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
