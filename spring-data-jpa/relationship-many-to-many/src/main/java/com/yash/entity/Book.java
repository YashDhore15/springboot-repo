package com.yash.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Book {
	
	@Id
	private Long bookId;
	private String bookName;
	private LocalDate isDeleted;
	
	@ManyToMany(
				cascade = {
						CascadeType.PERSIST,
						CascadeType.MERGE,
						CascadeType.REFRESH,
						CascadeType.DETACH
				},
				
				fetch = FetchType.LAZY
			)
	
	@JoinTable(
			name="book_author",
			joinColumns = @JoinColumn(name="book_id"),
			inverseJoinColumns = @JoinColumn(name="author_id")
		)
	private List<Author> authors;
}







