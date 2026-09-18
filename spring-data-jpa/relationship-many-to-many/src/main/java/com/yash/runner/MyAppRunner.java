package com.yash.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yash.entity.Author;
import com.yash.entity.Book;
import com.yash.service.AuthorService;
import com.yash.service.BookService;

@Component
public class MyAppRunner implements ApplicationRunner {
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private BookService bookService;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
/*		
		// Case 1 : Saving Author and books 
  
		Author author = Author.builder()
				.authorId(1L)
				.authorName("Marcus Aurelius")
				.build();
				
		Book book = Book.builder()
					.bookId(101L)
					.bookName("Meditations")
					.authors(new ArrayList(List.of(author)))
					.build();
		
		book = bookService.saveBook(book);

		Author a1 = Author.builder()
					.authorId(2L)
					.authorName("Rahul")
					.build();
		
		Author a2 = Author.builder()
				.authorId(3L)
				.authorName("Kiran")
				.build();
		
		Book b1 = Book.builder()
				.bookId(102L)
				.bookName("Java")
				.authors(new ArrayList(List.of(a1, a2)))
				.build();
		
		Book b2 = Book.builder()
				.bookId(103L)
				.bookName("C Programming")
				.authors(new ArrayList(List.of(a1)))
				.build();
		
		b1 = bookService.saveBook(b1);
		b2 = bookService.saveBook(b2);
		
		System.out.println("Author and Book saved!");
*/
		
		// Case 2 : Hard Deleting book
//		bookService.deleteBook(102L);
		

/*
		// Case 3 : Soft Deleting Author
		
		authorService.softDeleteAuthor(2L);
		
		Author a = authorService.fetchAuthorById(2L); 
*/		


		// Case 4 : Fetching book by ID and printing authors
		Book book = bookService.fetchBookById(102L);
		
		System.out.println("Book ID : " + book.getBookId());
		System.out.println("Book Name : " + book.getBookName());
		
		for(Author author : book.getAuthors()) {
			
			System.out.println("Author ID : " + author.getAuthorId());
			System.out.println("Author Name : " + author.getAuthorName());
			System.out.println("------------------------------------------");
		}


/*		
		// Case 5 : Creating book and Adding existing author to book
		
		Author author = authorService.fetchAuthorById(2L);
		
		Book book = new Book(
					104L,
					"C++",
					null,
					new ArrayList(List.of(author))
				);
		
		book = bookService.saveBook(book);
		
		System.out.println("Book saved!");
*/		

	}
}


