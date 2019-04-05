<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="edit" method="POST">  

First Name :<input type="text" name="firstName"  value="${requestScope.firstName }"><br/>  
Last Name :<input type="text" name="lastName" value="${requestScope.lastName }"><br/>  
Roll Number :<input type="number" name="rollNumber" value="${requestScope.rollNumber }" readonly="readonly" ><br/>  
<input type="submit" value="SAVE" />  
<a href="http://localhost:8080/student-mvc-app/students"><input type="button" value="CANCEL" /> </a>
</form>  
</body>
</html>