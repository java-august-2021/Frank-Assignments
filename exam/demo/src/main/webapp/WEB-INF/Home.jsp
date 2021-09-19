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
	<h1>
		Welcome,
		<c:out value="${user.firstname}" />
	</h1>

	<h3>Ideas</h3>
	<a href="">Low Likes</a>
	<a href="">High Likes</a>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Idea</th>
				<th scope="col">Created BY</th>
				<th scope="col">Likes</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listidea }" var="idea">
			<tr>
				<td> <a href="/idea/${idea.id}">${idea.content}</a> </td>
				<td>${idea.creator.firstname}</td>
				<td>${idea.likers.size()}</td>
				<c:choose>
					<c:when test="${idea.likers.contains(user) }">
						<td> <a href="/unlikes/${idea.id}">UnLike</a> </td>
					</c:when>
					<c:otherwise>
						<td> <a href="/likes/${idea.id}">Like</a> </td>
					</c:otherwise>
				</c:choose>
				
					
			</tr>
		</c:forEach>

		</tbody>
	</table>
	<a href="/idea/new">Create an Idea</a>
	<a href="/logout">Logout</a>
</body>
</html>