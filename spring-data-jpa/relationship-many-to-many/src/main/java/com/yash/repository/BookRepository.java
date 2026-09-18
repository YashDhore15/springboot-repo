package com.yash.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	Optional<Book> findByBookIdAndIsDeletedIsNull(Long id);
}
