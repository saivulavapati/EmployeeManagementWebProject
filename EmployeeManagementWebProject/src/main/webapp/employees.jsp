<%@ page import="com.model.*,java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employees</h1>
	<a href="employee.jsp">Add Employee</a>
	<table border="1">
	<tr>
		<th>id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Department</th>
		<th>age</th>
	</tr>
	<%List<Employee> employees = (List<Employee>)request.getAttribute("employees"); 
	  for(Employee emp: employees){
	%>
	<tr>
		<td><%=emp.getId() %></td>
		<td><%=emp.getName() %></td>
		<td><%=emp.getEmail() %></td>
		<td><%=emp.getDepartment() %></td>
		<td><%=emp.getAge() %></td>
	</tr>
	<%} %>
	</table>
</body>
</html>