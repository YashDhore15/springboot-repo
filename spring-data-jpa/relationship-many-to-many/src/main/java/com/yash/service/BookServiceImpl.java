package com.yash.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Book;
import com.yash.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Book fetchBookById(Long id) {
		
		return bookRepository.findByBookIdAndIsDeletedIsNull(id).orElseThrow(
				() -> new RuntimeException("Book not found!"));
	}

	@Override
	public void deleteBook(Long id) {
		
		bookRepository.deleteById(id);
	}

	@Override
	public void softDeleteBook(Long id) {
		
		Book book = fetchBookById(id);
		book.setIsDeleted(LocalDate.now());
	}

}
