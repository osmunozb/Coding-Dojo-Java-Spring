<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Información del equipo</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>

<body class="container text-center">
	<div id="header"><h1 class="py-3"><c:out value="${ equipoSelecionado.getNombreEquipo() }" /></h1>  </div>
	<div class="btn-group w-100 py-2">
		<a href="/ListaDeEquipos/" class="btn btn-primary">Inicio</a> 
		<a href="jugadores?id=<c:out value="${ idSelecionado }" />" class="btn btn-success">Agregar Jugador</a>
	</div>
	
	<div>
		<table class="table table-secondary table-striped ">
			<thead class="table-dark">
				<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
				<th>Acción</th>
			</tr>
			</thead>
			
			<tbody>
				<c:forEach var= "jugador" items="${ jugadoresEquipo }" varStatus="ind">
				<tr>
					<td>${ jugador.getNombre() }</td>
					<td>${ jugador.getApellido() }</td>
					<td>${ jugador.getEdad() }</td>
					<td><a href="eliminarJugador?id=<c:out value="${ idSelecionado }" />&jugadorId=${ ind.index }" class="text-decoration-none link-danger">Eliminar</a></td>
				</tr>
			</c:forEach>
			
			</tbody>
	
		</table>
		
	</div>
	
	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
	
</body>
</html>