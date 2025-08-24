package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.dao.EmployeeDao;
import com.model.Employee;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao empDao = new EmployeeDao();
		List<Employee> employees = empDao.getEmployees();
		request.setAttribute("employees", employees);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees.jsp");
		requestDispatcher.forward(request, response);
	}

	

}
