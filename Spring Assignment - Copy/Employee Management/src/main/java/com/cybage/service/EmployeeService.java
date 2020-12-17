package com.cybage.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.EmployeeDao;
import com.cybage.model.Employee;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeDao userdao;
	
	public void addUser(Employee u){
		userdao.addUser(u);
	}
	
	
	
	
	
	
	
	public List<Employee> getUserList(){
	return userdao.getList();
	}
	
	
		
	
	
	
	

}
