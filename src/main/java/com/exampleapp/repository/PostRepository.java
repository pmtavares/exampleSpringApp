package com.exampleapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleapp.domain.Post;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	
	
}