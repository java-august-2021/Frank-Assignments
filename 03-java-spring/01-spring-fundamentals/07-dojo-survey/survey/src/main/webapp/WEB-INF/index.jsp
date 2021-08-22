<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello THERE!</h1>
	<form action="/result" method="POST">

		<div class="container w-25 border border-3">
			<p class="mt-4">
				Your Name <input type="text" id="name"
					name="name">
			</p>
			<div class="form-group mb-4">
				<label for="location">Location</label> <select name ="location" id="location">
					<option value="San Diego">San Diego</option>
					<option value="New York">New York</option>
					<option value="Chicago">Chicago</option>
				</select>
			</div>
			<div class="form-group mb-4">
				<label for="language">Favorite Language</label> <select name ="language"
					id="language">
					<option value="JAVA">JAVA</option>
					<option value="PYTHON">PYTHON</option>
					<option value="MERN">MERN</option>
				</select>
			</div>

			<div class="form-group mb-4">
				<label for="comment">Comment (optional)</label>
				<textarea class="form-control" name="comment" id="comment"
					rows="3"></textarea>
			</div>
			<button class="btn btn-primary mb-4">Submit</button>
		</div>
	</form>
</body>
</html>