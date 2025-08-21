package com.model;

public class User {
	
	private String email;
	private String username;
	private String password;
	private String phoneNumber;
	private int age;
	
	
	public User() {
	}
 
	
	public User(String email,String username, String password, String phoneNumber, int age) {
		this.email = email;
		this.username=username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
