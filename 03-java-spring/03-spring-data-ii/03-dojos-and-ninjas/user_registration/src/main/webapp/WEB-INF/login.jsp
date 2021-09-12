<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<title>Registration Page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Register!</h1>

				<p>
					<form:errors path="user.*" />
				</p>

				<form:form method="POST" action="/register" modelAttribute="user">
					<p>
						<form:label path="firstname">First Name:</form:label>
						<form:input type="text" path="firstname" />
					</p>

					<p>
						<form:label path="lastname">Last Name:</form:label>
						<form:input type="text" path="lastname" />
					</p>

					<p>
						<form:label path="email">Email:</form:label>
						<form:input type="email" path="email" />
					</p>
					<p>
						<form:label path="password">Password:</form:label>
						<form:password path="password" />
					</p>
					<p>
						<form:label path="passwordConfirmation">Password Confirmation:</form:label>
						<form:password path="passwordConfirmation" />
					</p>
					<input type="submit" value="Register!" />
				</form:form>
			</div>
			<div class="col">
				<h1>Login</h1>
				<p>
					<c:out value="${error}" />
				</p>
				<form method="post" action="/">
					<p>
						<label type="email" for="email">Email</label> <input type="text"
							id="email" name="email" />
					</p>
					<p>
						<label for="password">Password</label> <input type="password"
							id="password" name="password" />
					</p>
					<input type="submit" value="Login!" />
				</form>
			</div>
		</div>

	</div>



</body>
</html>
