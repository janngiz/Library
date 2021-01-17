package com.anurag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anurag.entities.Author;

public interface AuthorDao  extends JpaRepository<Author,Integer> {
	
	@Query("SELECT COUNT(u) FROM Author u WHERE u.ward = 'ward1' ")
	Integer countWard1();
	
	@Query("SELECT COUNT(u) FROM Author u WHERE u.ward='ward2' ")
	Integer countWard2();
	
	@Query("SELECT COUNT(u) FROM Author u WHERE u.ward='ward3' ")
	Integer countWard3();

}
