<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Tasks</title>
</head>
<body>
<h1>Welcome to Tasks, ${user.username}!</h1>
<br>
<a href="/add-task">Add Task</a>
<br>
<table>
    <tr>
        <th>Task Name</th>
        <th>Description</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Severity</th>
        <th>Email</th>
        <th>Owner</th>
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td>${task.name}</td>
            <td>${task.description}</td>
            <td><fmt:formatDate type = "date" value = "${task.startDate}" /></td>
            <td><fmt:formatDate type = "date" value = "${task.endDate}" /></td>
            <td>${task.severity}</td>
            <td>${task.email}</td>
            <td>${task.user.username}</td>
            <c:if test="${task.user.id == user.id}">
                <td><a href="/delete-task/${task.id}">Delete</a></td>
            </c:if>
        </tr>
    </c:forEach>
</table>
<br>
<form:form action="logout" method="post">
    <input type="submit" value="Sign Out" />
</form:form>
</body>
</html>