package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.EmployeeDao;
import com.model.Employee;

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		String age = request.getParameter("age");
		Employee emp = new Employee(Integer.parseInt(id),name,department,email,Integer.parseInt(age));
		EmployeeDao empDao = new EmployeeDao();
		empDao.updateEmployee(emp);
		response.sendRedirect("employees");
	}

}
