package com.cybage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView user() {	   
	      return new ModelAndView("user", "user", new Login());
	   }
	
	
	
	   
	   @RequestMapping(value = "/success", method = RequestMethod.POST)
	   public String success(@ModelAttribute("user") Login l,ModelMap model) {
		   
		   if(l.getEmail().equals(l.getPassword()))
			    { System.out.println("Success");
			    model.addAttribute("mesg", l.getEmail());
			   	return "LoginSuccess";
			   	}
	      else
	    	  {
	    	   //model.addAttribute("e",user.getEmail());
	    	   model.addAttribute("error", "Invalid Credentials");
	    	
	    	   // System.out.println("error");
	    	   return "user";
	    	  }
	   }
	
}

