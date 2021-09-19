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
	
	<form:form action="/update/${oneIdea.id}" method="post" modelAttribute="oneIdea">
    
    <p>
        <form:label path="content">Content</form:label>
        <form:input path="content"/>
    </p>
	    <input type="submit" value="Update"/>
	    
</form:form>
<form action="/delete/${oneIdea.id}" method="post">
    <input type="submit" value="Delete">
</form>

</body>
</html>