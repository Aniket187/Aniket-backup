package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.naming.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.service.MyUserDetails1;
import com.example.demo.utils.AuthUserReq;
import com.example.demo.utils.AuthUserResonse;

@CrossOrigin(origins = "*")
@RestController
public class AuthenticationController {
	@Autowired
	private AuthenticationManager authmanager;
	@GetMapping(value="/login")
	private AuthUserResonse authenticateRequest(@RequestBody AuthUserReq authUserReq)throws AuthenticationException,ResourceNotFoundException{
		System.out.println(authUserReq.getEmail()+" "+authUserReq.getPassword());
		Authentication authentication = authmanager.authenticate(new UsernamePasswordAuthenticationToken(authUserReq.getEmail(),
				authUserReq.getPassword()));
		System.out.println(authentication);
		SecurityContextHolder.getContext().setAuthentication(authentication);
	List<String> authorities=authentication.getAuthorities().stream().map(grantAuthority->((GrantedAuthority)grantAuthority).getAuthority())
			.collect(Collectors.toList());
	String userName =((MyUserDetails1)authentication.getPrincipal()).getName();
	int userId=((MyUserDetails1)authentication.getPrincipal()).getUserId();
	System.out.println("before setting auth response");
	AuthUserResonse authUserResponse=new AuthUserResonse();
	authUserResponse.setUserId(userId);
	authUserResponse.setUserName(userName);
	authUserResponse.setAuthorities(authorities);
		
		return authUserResponse;
	}

}
