<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*"%>
    <%@ page import="com.techlab.model.Department"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<a href="http://localhost:8080/Department-master-app/home">1)Home</a><br>
<a href="http://localhost:8080/Department-master-app/display">2)Display List</a><br>
<a href="http://localhost:8080/Department-master-app/add">3)ADD DEPT</a><br>
<a href="http://localhost:8080/Department-master-app/">4)Delete</a><br>

<%
ArrayList<Department> Result=(ArrayList<Department>) request.getAttribute("deptDetails");
out.print("<table border='2px'>");
out.print("<tr><th>DeptNumber</th> <th>Name</th><th>Location</th><th>Delete</th></tr>");
for(Department deptObj:Result){
	out.print("<tr><th>"+deptObj.getDeptNo()+"</th><th>"+deptObj.getdName()+"</th><th>"+deptObj.getLoc()+
			"</th><th><a href='http://localhost:8080/Department-master-app/delete?DeptNo="+deptObj.getDeptNo()+"'>Delete</a></th></tr>");
	
}
	%>
</body>
</html>