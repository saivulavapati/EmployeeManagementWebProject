package com.constants;

public class Constants {

	public static final String URL= "jdbc:mysql://localhost:3306/employee_management";
	public static final String USER="root";
	public static final String PASSWORD="root@123";
	
	public static final String INSERT_USER="insert into users(email,username,password,phoneNumber,age) values(?,?,?,?,?)";
	public static final String GET_USER="select * from users where email=?";
	public static final String GET_EMPLOYEES="select * from employees";
	public static final String ADD_EMPLOYEE="insert into employees(name,email,department,age) values(?,?,?,?)";
	public static final String DELETE_EMPLOYEE="delete from employees where id=?";
	public static final String GET_EMPLOYEE="select * from employees where id=?";
	public static final String UPDATE_EMPLOYEE="update employees SET name = ?,email=?,department=?,age=? where id = ?";
}
