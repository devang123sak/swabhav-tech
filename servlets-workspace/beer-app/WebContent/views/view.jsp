<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Beer-App</title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP</h1>
	<%
	ArrayList Result = (ArrayList)request.getAttribute("Brands");
	Iterator iterator = Result.iterator();
	while(iterator.hasNext()){
		out.print("<br>Try : "+iterator.next());
	}
	%>
	<br><a href="http://localhost:8080/beer-app/views/form.html" >Enter Form Again</a>

</body>
</html>