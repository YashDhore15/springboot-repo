package com.yash.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	Optional<Author> findByAuthorIdAndIsDeletedIsNull(Long id);
}
