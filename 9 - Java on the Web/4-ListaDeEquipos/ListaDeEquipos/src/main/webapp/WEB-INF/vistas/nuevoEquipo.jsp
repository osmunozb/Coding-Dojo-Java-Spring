<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Crear equipo</title>
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body class="container text-center">
	<h1 class="py-3">Crear un nuevo equipo</h1>

	<a href="/ListaDeEquipos/" class="btn btn-primary mb-2">Inicio</a>

	<form action="equipos" method="Post"
		class="d-flex flex-column align-items-center">
		<label for="nombreEquipo">Nombre del equipo:</label> 
		<input type="text"
			name="nombreEquipo" required> <input type="submit"
			value="Crear equipo" class="btn btn-success m-3">
	</form>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>