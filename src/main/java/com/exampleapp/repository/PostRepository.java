package com.exampleapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleapp.domain.Post;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	/*
	 * Return last created post
	 */
	
	Post findFirstByOrderByPostedOnDesc();
	List<Post> findAllByOrderByPostedOnDesc();
	
	Post findBySlug(String slug);
	
}