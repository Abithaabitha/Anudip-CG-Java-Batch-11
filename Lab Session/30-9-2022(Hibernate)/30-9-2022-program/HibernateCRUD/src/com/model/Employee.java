package com.model;
import java.util.Date;

public class Employee {
	
	private int empid;
	private String name;
	private int salary;
	private String department;	
	private Date joingDate;
	
	public Employee() {
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getJoingDate() {
		return joingDate;
	}
	public void setJoingDate(Date joingDate) {
		this.joingDate = joingDate;
	}
	
	
	
	
	
	

}
