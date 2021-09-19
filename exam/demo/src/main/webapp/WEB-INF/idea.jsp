<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create a New Idea </h1>

	<form:form method="POST" action="/create" modelAttribute="idea">
		<p>
			<form:label path="content">Content:</form:label>
			<form:input type="text" path="content" />
			<form:errors path="content"/>
		</p>

		<input type="submit" value="Create" />
	</form:form>
</body>
</html>