package com.anurag.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anurag.entities.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

  public Book	findByTitle(String title);
  
 
   
  @Query("SELECT u FROM Book u WHERE u.title LIKE '%a%'")
  List<Book> findByFirstLetter();
   
  @Query("SELECT COUNT(*) FROM Book ")
  Integer CountTotal();
}
