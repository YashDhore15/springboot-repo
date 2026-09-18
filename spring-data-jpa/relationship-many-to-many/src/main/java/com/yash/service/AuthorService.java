package com.yash.service;

import com.yash.entity.Author;

public interface AuthorService {
	
	public Author saveAuthor(Author author);
	public Author fetchAuthorById(Long id);
	public void deleteAuthor(Long id);
	public void softDeleteAuthor(Long id);
}
