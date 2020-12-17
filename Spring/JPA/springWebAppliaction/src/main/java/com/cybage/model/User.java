package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 Long id;
	 @Column
	 String name;
	
	 public User(){
		 
	 }
	 
	 public User(long id,String n){
		 this.id=id;
		 this.name=n;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
