package com.model;

public class Employee {
	
	private String name;
	private String department;
	private String email;
	private int age;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee() {
	}
	
	public Employee(int id,String name, String department, String email, int age) {
		this.id=id;
		this.name = name;
		this.department = department;
		this.email = email;
		this.age = age;
	}

	public Employee(String name, String department, String email, int age) {
		this.name = name;
		this.department = department;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
