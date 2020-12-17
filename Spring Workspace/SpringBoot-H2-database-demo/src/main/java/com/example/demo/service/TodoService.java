package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepository;
	public void saveUpdate(Todo todo){
		todoRepository.save(todo);
		
	}
	public void update(int id) {
		todoRepository.update(id);
	}
	public List<Todo> findAll(int id){
		return todoRepository.findAllById(id);
	}
	
	public Optional<Todo> findById(int id){
		return todoRepository.findById(id);
	}
	public void delete(int id){
		todoRepository.deleteById(id);
	}

}
