package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.EmployeeDao;
import com.model.Employee;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		Employee emp =  new Employee(name,department,email,Integer.parseInt(age));
		EmployeeDao empDao = new EmployeeDao();
		empDao.addEmployee(emp);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
		requestDispatcher.forward(request, response);
	}

}
