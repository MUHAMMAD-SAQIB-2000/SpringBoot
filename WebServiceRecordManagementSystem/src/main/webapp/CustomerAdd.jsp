<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Add Record</title>
<style>
</style>
</head>
<body>
	<div>
		<ul>
			<li><a onclick="window.location.href = '${pageContext.request.contextPath}/home'">Home</a></li>
			<li><a class="active" onclick="window.location.href = '${pageContext.request.contextPath}/addCustomerForm'">Add Record</a></li>
			<li><a onclick="window.location.href = '${pageContext.request.contextPath}/displayAllCustomers'">See All Records</a></li>
			<li><a href="#about">Login In</a></li>
		</ul>
	</div>
	<div class="mainBody">
		<h1 class="h">SAMZ Vehicle Record Management System</h1>
		<h3 class="h">Add Record of A New Customer</h3>

		<main>
			<div class="form">
				<form:form action="${pageContext.request.contextPath}/saveOne" modelAttribute="customer">
					<label class="title">Enter Name:</label>
					<br />
					<form:input class="inputForm" path="customerName" />
					<br />
					<label class="title">Enter Age:</label>
					<br />
					<form:input class="inputForm" path="customerAge" />
					<br />
					<label class="title">Enter Id Card Number:</label>
					<br />
					<form:input class="inputForm" path="customerIdCardNumber" />
					<br />
					<label class="title">Enter Email:</label>
					<br />
					<form:input class="inputForm" type="email" path="customerEmail" />
					<br />
					<label class="title">Select Gender: </label>
					<p class="para">Male <form:radiobutton path="customerGender" value="Male" ></form:radiobutton></p>
					<p class="para">Female <form:radiobutton path="customerGender" value="Female" ></form:radiobutton></p>
					<br />
					<label class="title">Select Vehicle: </label>
					<form:select path="customerVehicle">
						<form:option value="MotorBike"><p class="para">MotorBike</p></form:option>
						<form:option value="Car"><p class="para">Car</p></form:option>
						<form:option value="Jeep"><p class="para">Jeep</p></form:option>
						<form:option value="Heavy Bike"><p class="para">Heavy Bike</p></form:option>
						<form:option value="Cycle"><p class="para">Cycle</p></form:option>
						<form:option value="Bus"><p class="para">Bus</p></form:option>
					</form:select>
					<br />
					<form:hidden path="customerID"/>
					<br />
					<label class="title">Save form</label>
					<button class="button button2" type="submit">Save</button>
				</form:form>
			</div>
		</main>
		<h2 class="h">Please Give us Your feedBack</h2>
	</div>
</body>
</html>