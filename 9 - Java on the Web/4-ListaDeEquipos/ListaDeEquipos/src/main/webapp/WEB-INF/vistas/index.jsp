<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista de Equipos</title>
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">

</head>
<body class="container text-center">
	<div>
		<h1 class="py-3">Lista de Equipos</h1>
	</div>
	<div class="shadow mt-3">
		<table class="table table-secondary table-striped ">
			<thead class="table-dark">
				<tr>
					<th>Equipo</th>
					<th>Jugadores</th>
					<th>Acción</th>
				</tr>
			</thead>

			<tbody class="table-group-divider">
				<c:forEach var="equipo" items="${ lista }" varStatus="ind">
					<tr>
						<td>${ equipo.getNombreEquipo() }</td>
						<td>${ equipo.getJugadores().size() }</td>
						<td><a class="text-decoration-none link-success" href="equipos?id=${ ind.index }">Información</a> |
							<a class="text-decoration-none link-danger" href="eliminarEquipo?id=${ ind.index }">Eliminar</a> </td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		
	</div>
	
	<div>
		<a href="equipos" class="btn btn-success w-25 my-4">Ingresar Nuevo Equipo</a>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

</body>
</html>