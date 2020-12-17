package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService userService;
	@GetMapping("/")
	public ModelAndView user1(ModelMap m){
		m.addAttribute("user",new Employee());
		return new ModelAndView("addUser",m);
	}
		
	@GetMapping("/user")
	public ModelAndView user(ModelMap m){
		m.addAttribute("user",new Employee());
		return new ModelAndView("addUser",m);
	}
	@PostMapping("/addUser")
	public ModelAndView userList(@ModelAttribute("user") Employee u,ModelMap m){
		userService.addUser(u);
	 m.addAttribute("user",	userService.getUserList());
		return new ModelAndView("userList",m);
	}
	
	
	
	
}
