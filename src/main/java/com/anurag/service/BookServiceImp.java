package com.anurag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.Exception.BookNotFoundException;
import com.anurag.dao.BookDao;
import com.anurag.entities.Book;


@Service
public class BookServiceImp implements BookService {
	
 @Autowired
	 BookDao repo;
	
	@Override
	public Integer saveBook(Book book) {
	      Integer id = repo.save(book).getId();
		return id;
	}

	@Override
	public List<Book> getAllBooks() {
		 List<Book> list = repo.findAll();
		return list;
	}

	@Override
	public Book getOneBook(Integer id) {
		 Optional<Book> opt = repo.findById(id);
		 
		 Book book =  opt.orElseThrow(
		    		()-> new BookNotFoundException("Book Not Exist"));
		 
	
		return book;
	}

	@Override
	public void deleteBook(Integer id) {
		Book book =  getOneBook(id);
		repo.delete(book);
		
	}
	
	@Override
	public Book getBookByTitle(String title) {
		  Book book = repo.findByTitle(title);
		return book;
	}

	@Override
	public Integer saveBookList(List<Book> list) {
		repo.saveAll(list);
		return null;
	}

	@Override
		public List<Book> findByFirstLettera() {
			return repo.findByFirstLetter();
		}

	@Override
	public Integer countAll() {
	    Integer id = repo.CountTotal();
		
	    return id;
	}
	

}
