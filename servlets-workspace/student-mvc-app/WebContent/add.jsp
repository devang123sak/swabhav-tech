<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<form action="add" method="POST">  

First Name :<input type="text" name="firstName"  value="${requestScope.firstName }"><br/>  
Last Name :<input type="text" name="lastName" value="${requestScope.lastName }"><br/>  
Roll Number :<input type="number" name="rollNumber" value="${requestScope.rollNumber }"><br/>  
<input type="submit" value="ADD" />  
</form> 
</body>
</html>