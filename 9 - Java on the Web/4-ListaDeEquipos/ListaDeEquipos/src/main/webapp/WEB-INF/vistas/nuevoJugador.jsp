<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Nuevo Jugador</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body class="container text-center ">
	<h1 class="py-3">Agregar Jugador Al Equipo</h1>
	<a href="/ListaDeEquipos/" class="btn btn-primary mb-2">Inicio</a> 
	<form action="jugadores?id=${ idSelecionado }" method="Post" class="d-flex flex-column align-items-center">
		<label for="nombreJugador">Nombre: </label>
		<input type="text" name="nombreJugador" required>
		<label for="apellidoJugador">Apellido: </label>
		<input type="text" name="apellidoJugador" required>
		<label for="edad">Edad: </label>
		<input type="number" name="edad" required> 
		<input type="submit" value="Agregar" class="btn btn-success my-4">
	</form>
</body>
</html>