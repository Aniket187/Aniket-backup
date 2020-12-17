package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repository.User;

@Service
public class ComService {
	@Autowired
	User us;
	public void Save(Users user){
		us.saveAndFlush(user);
	}
	

}
