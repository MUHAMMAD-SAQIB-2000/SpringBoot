<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Customers Record Form</title>
<style>
</style>
</head>
<body>
	<main>
		<div>
			<ul>
				<li><a onclick="window.location.href = '${pageContext.request.contextPath}/home'">Home</a></li>
				<li><a onclick="window.location.href = '${pageContext.request.contextPath}/addCustomerForm'">Add Record</a></li>
				<li><a class="active" onclick="window.location.href = '${pageContext.request.contextPath}/displayAllCustomers'">See All Records</a></li>
				<li><a href="#about">Login In</a></li>
			</ul>
		</div>
		<div class="mainBody">
			<h1 class="h">SAMZ Vehicle Record Management System</h1>
			<h3 class="h">Displaying The Data of All available Customers</h3>
			<div class="hi ">
				<table class="tableCSS">
					<thead>
						<tr>
							<th>Id No.</th>
							<th>Name</th>
							<th>Gender</th>
							<th>Age</th>
							<th>Id Card Number</th>
							<th>Vehicle</th>
							<th>Email</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="customer">
							<tr>
								<td>${customer.customerID}</td>
								<td>${customer.customerName}</td>
								<td>${customer.customerGender}</td>
								<td>${customer.customerAge}</td>
								<td>${customer.customerIdCardNumber}</td>
								<td>${customer.customerVehicle}</td>
								<td>${customer.customerEmail}</td>
								<td>
									<a href="${pageContext.request.contextPath}/updateOneCustomerRecord?customerID=${customer.customerID}">Edit</a>
									|| 
									<a href="${pageContext.request.contextPath}/deleteOneRecord?customerID=${customer.customerID}">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<h2 class="h">Please Give us Your feedBack</h2>
	</main>
	
</body>
</html>