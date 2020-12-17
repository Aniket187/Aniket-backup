package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.dao.UserRepository;
import com.cybage.model.User;
import com.cybage.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
		
	@GetMapping("/user")
	public ModelAndView user(ModelMap m){
		m.addAttribute("user",new User());
		return new ModelAndView("addUser",m);
	}
	@PostMapping("/addUser")
	public ModelAndView userList(@ModelAttribute("user") User u,ModelMap m){
		userService.addUser(u);
	 m.addAttribute("user",	userService.getUserList());
		return new ModelAndView("userList",m);
	}
	
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam("u") String id,ModelMap m){
		int uid=Integer.parseInt(id);
		User u=userService.searchUser((long)uid);
		System.out.println(u.getName());
    	m.addAttribute("user",u);
		return new ModelAndView("editUser",m);
	}
	
	@PostMapping("/editUser")
	public ModelAndView editUser(@ModelAttribute("user") User u,ModelMap m,BindingResult b){
		m.addAttribute("user",userService.editUser(u));
		return new ModelAndView("userList",m);
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("u") Long id,ModelMap m,BindingResult b){
		m.addAttribute("user",userService.deleteUser(id));
		return new ModelAndView("userList",m);
	}
}
