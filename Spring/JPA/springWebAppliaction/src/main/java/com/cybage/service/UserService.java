package com.cybage.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserRepository;
import com.cybage.model.User;

@Service
public class UserService {
	
	
		
	@Autowired
	UserRepository userRepository;
	
	public void addUser(User u){
		userRepository.save(u);
	}
	
	
	public List<User> editUser(User u1){
		User u=searchUser(u1.getId());
				u.setName(u1.getName());
	return userRepository.findAll();
	}
	
	
	public List<User> deleteUser(long id){
		User u=userRepository.getOne(id);
		 userRepository.delete(u);
		 return getUserList();
		}
	
	public List<User> getUserList(){
	return userRepository.findAll();
	}
	
	public User searchUser(long id){
		User u = userRepository.getOne(id);
				return u;
	}
		
	
	public long countRows(){
		userRepository.save(new User(106,"Riya"));
		return userRepository.count();
	}
	
	
	

}
