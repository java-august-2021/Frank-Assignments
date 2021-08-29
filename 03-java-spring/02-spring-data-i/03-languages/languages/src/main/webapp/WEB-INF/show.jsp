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
<a href="/languages">Dashboard</a>
<p> <c:out value="${language.name }"/> </p>
<p> <c:out value="${language.creator }"/> </p>
<p> <c:out value="${language.version }"/> </p>
<a href="/languages/edit/${language.id}">edit</a>
<a href="/delete/${language.id}">delete</a>
</body>
</html>