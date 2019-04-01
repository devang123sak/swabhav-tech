<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.techlab.controllers.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-app</title>
</head>
<body>
<a href="http://localhost:8080/student-mvc-app/login">Login</a>
	<br>
	<a href="http://localhost:8080/student-mvc-app/logout">LogOut</a>
	<br>
<h3>Student List</h3>
<a href="http://localhost:8080/student-mvc-app/">Home</a>
		<a href="http://localhost:8080/student-mvc-app/add">Add</a>
	<%
	
		ArrayList<Student> Result1 = (ArrayList<Student>) request.getAttribute("studentDetails");
		for(Student studentObj:Result1){
			out.print("<br> "+studentObj+"<a href='http://localhost:8080/student-mvc-app/edit?rollNumber="+studentObj.getRollNo()+"'>Edit</a>");
			out.print(" <a href='http://localhost:8080/student-mvc-app/delete?rollNumber="+studentObj.getRollNo()+"'>Delete <a>");
		}
		
	%>
	
</body>
</html>