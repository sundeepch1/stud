<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<link rel="stylesheet"
	href="<c:url value="/resources/css/style.css"></c:url>">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

</head>

<body onload="load();">
	<div class=container>
<!-- 		<div class=row> -->
<!-- 			<input type="hidden" id="user_id"> First Name: <input -->
<!-- 				type="text" id="first-name" required="required" name="first_name"><br> -->
<!-- 			MiddelName: <input type="text" id="middle-name" required="required" -->
<!-- 				name="middle_name"><br> Last Name: <input type="text" -->
<!-- 				id="last-name" required="required" name="last_name"><br> -->
<!-- 			Email: <input type="email" id="email" required="required" -->
<!-- 				name="email"><br> Date Of Birth: <input type="text" -->
<!-- 				id="date-of-birth" required="required" name="dateOfBirth"><br> -->
<!-- 			Age: <input type="number" id="age" required="required" name="age"><br> -->
<!-- 			Password: <input type="text" id="password" required="required" -->
<!-- 				name="password"><br> -->
<!-- 			<button onclick="submit();">Submit</button> -->
<!-- 		</div> -->

		<div class=row>
			<table id="table" class="table table-stripped">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Date Of Birth</th>
					<th>Age</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>

			</table>
		</div>
	</div>

	<img src="<c:url value="/resources/img/sindhitutorials.png"></c:url>" />
	<script type="text/javascript"
		src="<c:url value="/resources/js/myscript.js"></c:url>"></script>
</body>
</html>
