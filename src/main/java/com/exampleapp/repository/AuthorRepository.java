package com.exampleapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.exampleapp.domain.Author;



public interface AuthorRepository extends CrudRepository<Author, Long> {

}