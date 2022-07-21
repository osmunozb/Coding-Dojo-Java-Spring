<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Juego Great Number</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
	
</head>
<body >
	<div class="container text-center border p-4  my-5 d-flex flex-column align-items-center">
		 <h1>Bienvenido al juego Great Number!</h1>
		 <h3>Estoy pensando en un número entre 1 y 100</h3>
		 <h4>Intenta adivinar (número de intentos permitidos 3)</h4>
		 
		 <div class="text-center w-50 p-3 <c:out value="${color}"/>">
		 	<h3><c:out value="${texto}"/></h3>
		 	<h3>Número de intentos: <c:out value="${contador}"/></h3>
		 	<c:out value="${reinicio}" escapeXml="false" /> 
		 </div>
		 
		 <form action="procesar" method="post" class="p-2">
		 		<input type="text" name="adivinar" class="<c:out value="${none}"/>" required>
		 		<br>
		 		<br>
		 		<button type="submit" class="btn btn-primary <c:out value="${none}"/>">Verificar</button>
		 	</form>
	</div>
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
	
</body>
</html>