package demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int addressId;
	private String joiningDate;
	private int id;
	private String name;
	private String desgination;
	private long salary;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setjoiningDate(Date joiningdate) {
		
		String pattern="dd/MM/yyyy";
		SimpleDateFormat simple=new SimpleDateFormat(pattern);
		
		joiningDate = simple.format(joiningdate);
	}
	public int getId() {
		return id;
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
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

	
	

	

}
