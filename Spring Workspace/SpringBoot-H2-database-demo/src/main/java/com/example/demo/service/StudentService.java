package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.Studentrepository;


@Service
public class StudentService {
	@Autowired
	Studentrepository studentrepository;

	public void saveUpdate(Student student){
		studentrepository.save(student);
		
	}

	public Student findStudent(Student student) {
		 Student std=studentrepository.findEmail(student.getEmail(),student.getPassword());
		 System.out.println(std);
		 return std;
		 
		 
}
//	public UserDetails findStudent(Student student) {
//		Student user = studentrepository.findEmail(student.getEmail(), student.getPassword());
//        if (user == null) {
//            throw new UsernameNotFoundException(student.getEmail());
//        }
//        return new Mypriciple(user);
//		 
//		 
//		}
}
