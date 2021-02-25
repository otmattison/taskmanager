<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>register here</title>
</head>
<body>
<div>
    <div>
        <form:form id="form" >
            <h1>Sign Up:</h1>
            <p>Please enter a username and password:</p>
                <input type="text" id="username" name="username" placeholder="Enter a username" class="form-control">
            <br>
            <br>
                <input type="password" id="password" name="password" placeholder="Enter a password" class="form-control">
            <br>
            <br>
                <input type="submit" value="Submit">
        </form:form>
    </div>

</div>
</body>
</html>