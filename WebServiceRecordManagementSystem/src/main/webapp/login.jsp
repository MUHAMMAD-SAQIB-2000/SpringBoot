<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	${SPRING_SECURITY_LAST_EXCEPTION.messege}
	<div>
		<ul>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/home'">Home</a></li>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/addCustomerForm'">Add
					Record</a></li>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/displayAllCustomers'">See
					All Records</a></li>
			<li><a class="active"
				onclick="window.location.href = '${pageContext.request.contextPath}/login'">Login
					In</a></li>
		</ul>
	</div>
	<div class="mainBody">
		<h1 class="h">To Proceed, Login</h1>
		<form action="/login" method="post">
			<label class="title">UserName:</label> <br /> <input
				class="inputForm" type="text" name="username"
				placeholder="you username" /> <br /> <label class="title">Password:</label>
			<br /> <input class="inputForm" type="password" name="password"
				placeholder="your password" /> <br /><input
				class="button button2 loginButton" name="submit" value="submit" type="submit" />
		</form>
	</div>

</body>
</html>