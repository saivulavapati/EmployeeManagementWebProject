package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.constants.Constants;
import com.model.Employee;

public class EmployeeDao {

	public List<Employee> getEmployees(){
		Connection connection;
		List<Employee> employees = new ArrayList<>();
		try {
			connection = Utils.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_EMPLOYEES);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String department = rs.getString("department");
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				Employee emp = new Employee(id,name,department,email,age);
				employees.add(emp);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employees;
		
	}
	
	public void addEmployee(Employee emp) {
		Connection connection;
		List<Employee> employees = new ArrayList<>();
		try {
			connection = Utils.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.ADD_EMPLOYEE);
			statement.setString(1, emp.getName());
			statement.setString(2, emp.getEmail());
			statement.setString(3, emp.getDepartment());
			statement.setInt(4, emp.getAge());
			statement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
