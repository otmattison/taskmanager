<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Task</title>

</head>
<body>
    <div>
        <form:form id="form" >
            <h1 >Create Task:</h1>
                <label for="name" >Name:</label>
                <input type="text" id="name" name="name" placeholder="Enter a task name" class="form-control">
            <br>
            <br>
                <label for="startDate" >Start Date:</label>
                <input type="date" id="startDate" name="startDate" class="form-control">
            <br>
            <br>
                <label for="endDate" >End Date:</label>
                <input type="date" id="endDate" name="endDate" class="form-control">
            <br>
            <br>
                <label for="description" >Description:</label>
                <textarea id="description" name="description" rows="5" cols="33" placeholder="Enter description here..." class="form-control"></textarea>
            <br>
            <br>
                <label for="severity" >Severity:</label>
                    <select name="severity" id="severity" class="form-control">
                        <option value="high">High</option>
                        <option value="medium">Medium</option>
                        <option value="low">Low</option>
                    </select>
            <br>
            <br>
               <label for="email" >Email:</label>
                <input type="text" id="email" name="email" placeholder="Enter a email" class="form-control">
            <br>
                <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>