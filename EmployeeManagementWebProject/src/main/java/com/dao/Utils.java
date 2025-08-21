package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.constants.Constants;

public class Utils {

	private static Connection connection;
	

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(connection == null) {
			connection  = DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
		}
		return connection;
	}
	
}
