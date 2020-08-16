<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div>
		<ul>
			<li><a class="active"
				onclick="window.location.href = '${pageContext.request.contextPath}/home'">Home</a></li>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/addCustomerForm'">Add
					Record</a></li>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/displayAllCustomers'">See
					All Records</a></li>
			<li><a
				onclick="window.location.href = '${pageContext.request.contextPath}/login'">Login
					In</a></li>
		</ul>
	</div>
	<div class="mainBody">
		<h1 class="h">User Logged Out</h1>
		<h1 class="h">
			Click To return To home Page<a class="button button2" onclick="window.location.href='${pageContext.request.contextPath}/home'">Home
			</a></h1>
		<br />	
		<h1 class="h">OR</h1>
		<br />
		<h1 class="h">
			Click To Login Again<a class="button button2" onclick="window.location.href='${pageContext.request.contextPath}/login'">Login
			</a></h1>	
	</div>

</body>
</html>