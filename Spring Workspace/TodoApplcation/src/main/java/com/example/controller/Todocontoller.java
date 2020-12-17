package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.repository.User;

@RestController
public class Todocontoller {
	@Autowired
	User us;
	@PostMapping("/post")
	@ResponseBody
	public void addUser(@RequestBody Users user){
		us.save(user);
		
	}

}
