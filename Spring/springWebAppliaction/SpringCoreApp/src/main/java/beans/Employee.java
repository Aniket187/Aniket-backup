package beans;

import java.util.List;
import java.util.Map;

public class Employee {

	
	
	String empname;
	int empid;
	String empdept;
	Address add;
	List<String> hobbies;
	Map<Integer,String> workingDepts;
	
	
	
	public Map<Integer, String> getWorkingDepts() {
		return workingDepts;
	}

	public void setWorkingDepts(Map<Integer, String> workingDepts) {
		this.workingDepts = workingDepts;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name,String dept,int id,Address add) {
		this.empdept=dept;
		this.empname=name;
		this.empid=id;
		this.add=add;
		}
	
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empdept=" + empdept + ", add=" + add + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	
	
}
