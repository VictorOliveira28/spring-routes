package com.victoroliveira.springroutes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victoroliveira.springroutes.entities.Books;
import com.victoroliveira.springroutes.repositories.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository repository;
	
	public List<Books> findAll(){
		List<Books> list = repository.findAll();		
		return list;
	}

}
