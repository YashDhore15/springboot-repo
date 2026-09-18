package com.yash.service;

import com.yash.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book);
	public Book fetchBookById(Long id);
	public void deleteBook(Long id);
	public void softDeleteBook(Long id);
}
