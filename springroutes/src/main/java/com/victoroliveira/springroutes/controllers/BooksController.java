package com.victoroliveira.springroutes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victoroliveira.springroutes.services.BooksService;

@Controller
@RequestMapping(value = "/books") //localhost:8080/books
public class BooksController {
	
	@Autowired
	private BooksService service;
	
	@GetMapping
	public ModelAndView findAll() {					
		
		ModelAndView modelAndView = new ModelAndView();	
		modelAndView.addObject("bookResults", service.findAll());
		modelAndView.setViewName("books/result");
		return modelAndView;
	}

}
