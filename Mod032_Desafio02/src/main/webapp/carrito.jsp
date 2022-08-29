<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>carrito</title>
</head>
<body>
	<h2>Carrito:</h2>

	<%=session.getAttribute("misProductos")%>

	<hr>
	<a href="chaito.jsp">Cerrar sessión</a> | 
	<a href="index.jsp">Volver al inicio</a>
</body>
</html>