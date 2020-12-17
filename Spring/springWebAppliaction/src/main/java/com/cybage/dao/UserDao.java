package com.cybage.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cybage.model.User;

@Repository
public class UserDao  {

		List<User> userList;
		
		public UserDao() {
		userList=new ArrayList<User>();
		
		}
		
		public void addUser(User u){
			userList.add(u);
		}
		
		public boolean editUser(User u){
			return userList.add(u);
		}
		
		public boolean deleteUser(User u){
			return userList.remove(u);
		}
		
		
		public List<User> getList(){
			return userList;
		}
}

