package com.cybage;

import javax.persistence.*;




@Entity
@Table
public class Student {
	
	@Id
	int id;
	String name;
	String std;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
public Student(int id, String name, String std) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
	}
public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	

}
