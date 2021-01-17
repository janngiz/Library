package com.anurag.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="Author")
@Table(name="author_details")
public class Author {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String lastName;
	private String language;
	private String ward;
	
	@OneToOne(mappedBy="author")
	@JsonBackReference
	private Book book;
	
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Book getBook() {
		return book;
	}





	public void setBook(Book book) {
		this.book = book;
	}










	public Author(int id, String name, String lastName, String language, String ward, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.language = language;
		this.ward = ward;
		this.book = book;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getWard() {
		return ward;
	}





	public void setWard(String ward) {
		this.ward = ward;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	

}
