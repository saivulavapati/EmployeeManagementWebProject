<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
     <h1>Sign Up Details</h1>
     <form action="signup" method="post">
		<label for="email">Email</label>
		<input type="text" name="email"/><br/>
		
		<label for="username">Name</label>
		<input type="text" name="username"/><br/>
		
		<label for="password">Password</label>
		<input type="text" name="password"/><br/>
		
		<label for="confirm-password">Confirm Password</label>
		<input type="text" name="confirm-password"/><br/>
		
		<label for="phoneNumber">Phone Number</label>
		<input type="text" name="phoneNumber"/><br/>
		
		<label for="age">Age</label>
		<input type="text" name="age"/><br/>
		
		<input type="submit" name="submit"/>
	</form>
</body>
</html>