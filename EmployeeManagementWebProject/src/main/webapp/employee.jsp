<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>
	<h1>Enter Employee Details</h1>
	<form action="addEmployee" method="post">
	
		<label for="name">Name</label>
		<input type="text" name="name"/><br/>
		
		<label for="email">Email</label>
		<input type="text" name="email"/><br/>
		
		<label for="department">Department</label>
		<input type="text" name="department"/><br/>
		
		<label for="age">Age</label>
		<input type="text" name="age"/><br/>
		
		<input type="submit" name="submit"/>
	</form>
</body>
</html>