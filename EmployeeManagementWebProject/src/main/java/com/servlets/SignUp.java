package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.UserDao;
import com.model.User;

@WebServlet("/signup")
public class SignUp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phoneNumber = request.getParameter("phoneNumber");
		String age = request.getParameter("age");
		User user = new User(email,username,password,phoneNumber,Integer.parseInt(age));
	    UserDao userDao = new UserDao();
	    userDao.saveUser(user);
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
	    requestDispatcher.forward(request, response);
	}
	
	

}
