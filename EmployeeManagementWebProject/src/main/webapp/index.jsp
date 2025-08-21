<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	<form action="login" method="post">
		<label for="email">Email</label>
		<input type="text" name="email"/><br/>
		<label for="password">Password</label>
		<input type="text" name="password"/><br/>
		<input type="submit" name="submit"/>
	</form>
	<p>New User <a href="signup.jsp">SignUp</a></p>
</body>
</html>