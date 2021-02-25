<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div>
		<div>
			<form:form id="form">
				<h1>Login:</h1>
				<p>Please enter your username and password:</p>
				<input type="text" id="username" name="username"
					placeholder="Enter a username" class="form-control">
				<br>
				<br>
				<input type="password" id="password" name="password"
					placeholder="Enter a password" class="form-control">
				<br>
				<br>
				<input type="submit" value="Submit">
				<br>
				<br>
				<a href="/register">Click here to sign up!</a>
			</form:form>
		</div>
	</div>
</body>
</html>