<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container w-25 border border-3 mt-4">
		<h2>Submitted Info</h2>
		<p>
			Your name: <c:out value="${name}" />
		</p>
		<p>
			Location: <c:out value="${location}" />
		</p>
		<p>
			Language: <c:out value="${language}" />
		</p>
		<p>
			Comment: <c:out value="${comment}" />
		</p>
		<a href="/" class="border border-3 mb-4">Go Back</a>
	</div>

</body>
</html>