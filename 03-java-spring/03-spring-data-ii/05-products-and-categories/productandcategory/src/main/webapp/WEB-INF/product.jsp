<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/create" modelAttribute="newProd">
		<div class="container">
		<h1>New Product</h1>
			<p>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" />
			</p>

			<p>
				<form:label path="description">Description:</form:label>
				<form:input type="text" path="description" />
			</p>
			<p>
				<form:label path="price">Price:</form:label>
				<form:input type="number" path="price" />
			</p>
			<input type="submit" value="Create" />
	</form:form>
	</div>


</body>
</html>