<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/styles.css">
<script type="text/javascript" src="/js/script.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="loadDate()">
	<p> <c:out value="${date}"/> </p>
	
</body>
</html>