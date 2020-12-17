package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Users;


@Repository
public interface User extends JpaRepository<Users, Long>{
	

}