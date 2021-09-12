<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<h1><c:out value="${thisProduct.name}" /></h1>
			<div class="col">
				<h3>Category:</h3>
				<c:forEach items="${allCategory}" var="category">
					<p>
						-<c:out value="${category.name}" />
					</p>
    			</c:forEach>
			</div>

			<div class="col">
				<h3>Add Category:</h3>
					<form method="POST" action="/addcategory/${thisProduct.id}">
						<select name="categories">
							<c:forEach items="${outOfProd}" var="outCategory">
								<option value="${outCategory.id}">${outCategory.name}</option>
    						</c:forEach>
					<select>
					<input type="submit" value="Submit"/>
					</form>
			</div>
		</div>
	</div>
</body>
</html>