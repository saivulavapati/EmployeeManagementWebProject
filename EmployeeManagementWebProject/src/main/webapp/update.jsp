<%@page import="com.model.Employee"%>
<%@page import="com.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>

<%
int id = Integer.parseInt(request.getParameter("id"));
EmployeeDao empDao = new EmployeeDao();
Employee emp = empDao.getEmployee(id);
%>

<h1>Update Employee Details</h1>
	<form action="update" method="post">
	
		<input hidden="true" type="text" name="id" value="<%=id %>"/>
	
		<label for="name">Name</label>
		<input type="text" name="name" value="<%=emp.getName()%>"/><br/>
		
		<label for="email">Email</label>
		<input type="text" name="email" value="<%=emp.getEmail()%>"/><br/>
		
		<label for="department">Department</label>
		<input type="text" name="department" value="<%=emp.getDepartment()%>"/><br/>
		
		<label for="age">Age</label>
		<input type="text" name="age" value="<%=emp.getAge()%>"/><br/>
		
		<input type="submit" value="update"/>
	</form>

</body>
</html>