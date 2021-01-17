package com.anurag.service;

import java.util.List;

import com.anurag.entities.Book;

public interface BookService {
	Integer saveBook(Book book);

	List<Book> getAllBooks();

	Book getOneBook(Integer id);

	void deleteBook(Integer id);
	
	Book getBookByTitle(String title);

	Integer saveBookList(List<Book> list);

	List<Book> findByFirstLettera();

	Integer countAll();
	
	

}
