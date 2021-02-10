<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Helow World</title>
</head>
<body>
	<h2>
		Hey There!!!
		
		<% System.out.println("Hello"); %>
	</h2>
	
	<h3>My Name Is ${name}</h3>
	
	<h5>
		<%= request.getParameter("surname") %>
	</h5>
	
	<form name="loginForm" method="POST" action="LoginServlet">
		Username: <input type="text" name="username">
		Password: <input type="password" name="password">
		<br/><br/>
		<input type="submit" value="LOGIN" />
	</form>
</body>
</html>