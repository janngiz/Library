package com.anurag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anurag.entities.Book;
import com.anurag.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	
	//1. Save book
	@PostMapping("/save")
	public ResponseEntity<String> saveBook(@RequestBody Book book)
	{
		Integer id = service.saveBook(book);
		return new  ResponseEntity<String>(id+" saved",HttpStatus.OK);
	}
	
	
	
	//2. fetch all book
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks()
	{
	     List<Book> list = 	service.getAllBooks();
		return new ResponseEntity<List<Book>>(list,HttpStatus.OK);
	}
	
	//3. Fetch one book
	@GetMapping("one/{id}")
	 public ResponseEntity<Book> getOneBook(@PathVariable Integer id)
	 {
		 Book book = service.getOneBook(id);
		 return new ResponseEntity<Book>(book,HttpStatus.OK);
	 }
	
	//4.Delete book
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id)
	{
		service.deleteBook(id); //id yai xa, database bata tani rahanu prdaina
		
		return new ResponseEntity<String>(id+" deleted",HttpStatus.OK);
	}
	
	
	//5. Update book
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateBook(@PathVariable Integer id, @RequestBody Book book)
	{
		Book dbbook =	service.getOneBook(id);
		
		dbbook.setTitle(book.getTitle());
		dbbook.setAuthor(book.getAuthor());
		
		service.saveBook(dbbook);
		
				return new ResponseEntity<String>(id+" updated",HttpStatus.OK);
	}
	
	
	//6.Get Book using Title
	@GetMapping("/title/{title}")
	public ResponseEntity<Book> getBookByTitle(@PathVariable String title){
		  Book  book = service.getBookByTitle(title);
		return new ResponseEntity<Book>(book , HttpStatus.OK);
	}
	
	
	//1. Save list book
		@PostMapping("/save/list")
		public ResponseEntity<String> saveBookList(@RequestBody List<Book> list)
		{
			Integer id = service.saveBookList(list);
			return new  ResponseEntity<String>(id+" saved",HttpStatus.OK);
		}
		
		//Get book by first name 
		
	@GetMapping("/findByFirstLettera")
	public List<Book> findByFirstLetter()
	{
		return service.findByFirstLettera();
	}
	
	@GetMapping("/countall")
	public Integer countAll()
	{
		Integer id = service.countAll();
		return id;
	}


}
