<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body>
<form action="add" method="POST">  

Department Number    :<input type="text" name="deptNumber"  value="${requestScope.deptNumber}"><br/>  
Department Name      :<input type="text" name="deptName" value="${requestScope.deptName}"><br/>  
Department Location  :<input type="text" name="deptLocation" value="${requestScope.deptLocation}"><br/>  
<input type="submit" value="ADD" />  
</form> 
</body>
</html>