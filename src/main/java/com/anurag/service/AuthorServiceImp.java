package com.anurag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.dao.AuthorDao;
import com.anurag.entities.Ward;

@Service
public class AuthorServiceImp implements AuthorService {
	@Autowired
	private AuthorDao repo;

	@Override
	public Ward getWard() {
	  Integer ward1 =	repo.countWard1();
	  Integer ward2 = repo.countWard2();
	  Integer ward3 = repo.countWard3();
	  
	 Ward ward  = new Ward();
	 ward.setWard1(ward1);
	 ward.setWard2(ward2);
	 ward.setWard3(ward3);
	 
		return ward;
	}

}
