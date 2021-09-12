<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<div class="row">
				<h1><c:out value="${thisCategory.name}" /></h1>
			<div class="col">
				<h3>Products: </h3>
								<c:forEach items="${allproducts}" var="product">
					<p>
						-<c:out value="${product.name}" />
					</p>
    			</c:forEach>
			</div>
			<div class="col">
			<p>Add Product:</p>
			<form method="POST" action="/addproduct/${thisCategory.id}">
						<select name="products">
							<c:forEach items="${prodNonContains}" var="product">
								-<option value="${product.id}">${product.name}</option>
    						</c:forEach>
					<select>
					<input type="submit" value="Submit"/>
					</form>
			</div>
		</div>
		
	</div>
</body>
</html>