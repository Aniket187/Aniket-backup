package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;
import com.example.model.Users;
import com.example.service.ComService;

@RestController
public class Todocontoller {
	@Autowired
	ComService cs;
	@PostMapping( "/useradd")
	private void addUser(@RequestBody Users user){
		 cs.Save(user);
		
	}
	@GetMapping("/todo")
	private Todo gettodo(@RequestParam("id") Long id){
		Todo todo = null;;
		return todo;
				
		
	}

}
