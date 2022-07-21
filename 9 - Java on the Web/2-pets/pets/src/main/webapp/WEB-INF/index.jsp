<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mascotas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  </head>
</head>
<body class="container">

	<div class="row p-4">
	
	<form action="dog" class="border col p-3">
		<h2>Create a Dog</h2>
		<label for="name">Name</label>
		<input name="name" id="name"> 
		<br>
		<br>
		<label for="breed">Breed </label>
		<input name="breed" id="breed">
		<br>
		<br>
		<label for="weight">Weight (Lbs)</label>
		<input name="weight" id="weight">
		<br>
		<br>
		<button type="submit" class="btn btn-primary">Create Dog</button>
		
	</form>
	
    <form action="cat" class="border col p-3">
		<h2>Create a Cat</h2>
		<label for="name">Name</label>
		<input name="name" id="name"> 
		<br>
		<br>
		<label for="breed">Breed </label>
		<input name="breed" id="breed">
		<br>
		<br>
		<label for="weight">Weight (Lbs)</label>
		<input name="weight" id="weight">
		<br>
		<br>
		<button type="submit" class="btn btn-primary">Create Cat</button>
		
	</form>
	
	</div>

	
		
		
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
	
</body>
</html>