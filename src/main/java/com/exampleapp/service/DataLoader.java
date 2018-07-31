package com.exampleapp.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleapp.domain.Author;
import com.exampleapp.domain.Post;
import com.exampleapp.repository.*;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository,AuthorRepository authorRepository){
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData(){
		// create an author
		Author dv = new Author("Pedro","Tavares");
		authorRepository.save(dv);
		
		// create a post
		Post post = new Post("Spring Data Rocks!");
		post.setBody("Post Body here...");
		post.setPostedOn(new Date());
		post.setAuthor(dv);
		postRepository.save(post);
	}
	
}
