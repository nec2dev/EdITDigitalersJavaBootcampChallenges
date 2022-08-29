<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="ar.com.educacionit.desafio1.servlets.DatosServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Desafio 1</title>
</head>
<body>
	<h2>Lista de productos</h2>
	<form action="DatosServlet" method="POST">
		<p>Seleccione las frutas para agregar al carrito:</p>
		<input type="checkbox" name="producto" value="manzana">
		manzana<br> <input type="checkbox" name="producto" value="banana">
		banana<br> <input type="checkbox" name="producto"
			value="frutilla"> frutilla<br> <input type="checkbox"
			name="producto" value="lima"> lima<br> <input
			type="checkbox" name="producto" value="mango"> mango<br>
		<input type="checkbox" name="producto" value="anana"> anana<br>
		<input type="checkbox" name="producto" value="kiwi"> kiwi<br>
		<br> <input type="submit" value="guardar al carrito">
	</form>
	<hr>
	 <a href="chaito.jsp">Cerrar sessión</a> |
	 <a href="carrito.jsp">Ver carrito</a>
</body>
</html>
