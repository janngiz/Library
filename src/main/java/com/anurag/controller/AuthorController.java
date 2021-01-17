package com.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anurag.entities.Ward;
import com.anurag.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
	//get   object of ward
	@GetMapping("/ward")
	public Ward getWard() {
	 Ward ward =	service.getWard();
		return ward;
	}

}
