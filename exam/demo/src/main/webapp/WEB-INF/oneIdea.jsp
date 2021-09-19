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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h1><c:out value="${oneIdea.content}" /></h1>
	 
	 <p>Created By:   <c:out value="${oneIdea.creator.firstname}" /> </p>
	 
	 	<table class="table">
		<thead>
			<tr>
				<th scope="col">Name</th>

			</tr>
		</thead>
		<tbody>
		<c:forEach items="${oneIdea.likers }" var="user">
			<tr>
				<td> ${user.firstname} </td>
			</tr>
		</c:forEach>

		</tbody>
	</table>
	<a href="/idea/${oneIdea.id}/edit">EDIT</a>
</body>
</html>