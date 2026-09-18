package com.yash.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
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
public class Author {
	
	@Id
	private Long authorId;
	private String authorName;
	private LocalDate isDeleted;
	
	@ManyToMany(
				cascade= {
						CascadeType.PERSIST,
						CascadeType.MERGE,
						CascadeType.REFRESH,
						CascadeType.DETACH
				},
				fetch=FetchType.LAZY,
				
				mappedBy = "authors"
			)
	private List<Book> books;
	
}






