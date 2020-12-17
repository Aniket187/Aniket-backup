package com.example.demo.controller;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@CrossOrigin(origins = "*")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	private String saveStudent(@RequestBody Student student){
		studentService.saveUpdate(student);
		return  student.getName()+"was added";
	}
	@GetMapping("/welcome")
	private String welcome(){
		return "Welcome User";
		
	} 
//	@GetMapping("/login")
//	private Student findStudent(@RequestBody Student student) throws ResourceNotFoundException{
////		Student std;
////		return (Student) studentService.findStudent(student);
////		if(std.equals(null)){
////			throw new ResourceNotFoundException("No Todo Found for current User");
////		}
//		return (Student)userAuth.loadUserByUsername(student.getEmail());
//		
//	
//	}

}
