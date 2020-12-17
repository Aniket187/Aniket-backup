package com.cybage.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cybage.model.Employee;

@Repository
public class EmployeeDao {

		List<Employee> userList;
		
		public EmployeeDao() {
		userList=new ArrayList<Employee>();
		
		}
		
		public void addUser(Employee u){
			userList.add(u);
		}
		
		public boolean editUser(Employee u){
			return userList.add(u);
		}
		
		public boolean deleteUser(Employee u){
			return userList.remove(u);
		}
		
		
		public List<Employee> getList(){
			return userList;
		}
}

