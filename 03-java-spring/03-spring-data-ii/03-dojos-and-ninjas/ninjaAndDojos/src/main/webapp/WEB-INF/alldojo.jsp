<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
    
<meta charset="UTF-8">
<title>Tacos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1><c:out value="${dojo.name} Location Ninja"/></h1>
	
	<table class="table table-dark">
  <thead>
    <tr>

      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">AGE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    <c:forEach items="${dojo.ninjas}" var="ninja">
    	<tr>
    		<td><c:out value="${ninja.firstName}"/></td>
    		<td><c:out value="${ninja.lastName}"/></td>
    		<td><c:out value="${ninja.age}"/></td>
    		
    	</tr>
    </c:forEach>
    </tr>
  </tbody>
</table>
</body>
</html>