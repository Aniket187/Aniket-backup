package com.example.demo.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.UsersRepository;
@Service
public class UserDetailServiceImpl implements UserDetailsService {
	 @Autowired
	 private UsersRepository userRepository;
	 @Autowired
	 private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student user=userRepository.findByEmail(username);
		if(user==null){
			try {
				throw new ResourceNotFoundException(username +"not found");
			} catch (ResourceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    return new MyUserDetails1(user);
		
//		return new User(user.getEmail(), user.getPassword(), 
//				Collections.singleton(new SimpleGrantedAuthority(user.getRole())));
	}

}
