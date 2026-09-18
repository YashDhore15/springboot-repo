package com.yash.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Author;
import com.yash.repository.AuthorRepository;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public Author fetchAuthorById(Long id) {
		
		return authorRepository.findByAuthorIdAndIsDeletedIsNull(id).orElseThrow(
				() -> new RuntimeException("Author not found!"));
	}

	@Override
	public void deleteAuthor(Long id) {
		
		authorRepository.deleteById(id);
	}

	@Override
	public void softDeleteAuthor(Long id) {
		
		 Author author = fetchAuthorById(id);
		 author.setIsDeleted(LocalDate.now());
		 
	}

}



