<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salir</title>
</head>
<body>
	<h2>Vuelva pronto Chaito</h2>
	<%
	session.invalidate();
	%>
	<hr>
	 <a href="index.jsp">Volver al inicio</a> |
</body>
</html>