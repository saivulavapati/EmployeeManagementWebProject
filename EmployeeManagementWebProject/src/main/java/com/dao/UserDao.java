package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.constants.Constants;
import com.model.User;

public class UserDao {

	public void saveUser(User user) {
		Connection connection;
		try {
			connection = Utils.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_USER);
			statement.setString(1, user.getEmail());
			statement.setString(2,user.getUsername());
			statement.setString(3, user.getPassword());
			statement.setString(4,user.getPhoneNumber());
			statement.setInt(5,user.getAge());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkUser(String email,String password) {
		Connection connection;
		try {
			connection = Utils.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_USER);
			statement.setString(1, email);
			ResultSet rs = statement.executeQuery();
			String rsEmail=null;
			String rsPassword = null;
			while(rs.next()) {
				rsEmail = rs.getString("email");
				rsPassword = rs.getString("password");
			}
			return email.equals(rsEmail) && password.equals(rsPassword);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
