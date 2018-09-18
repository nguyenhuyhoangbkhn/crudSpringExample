<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List User</title>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
  
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.3.1.js"></script>

</head>
<body>
	<div><a href= "http://localhost:8080/spring_example/register">Add</a></div>
	<div>
		<table id="myTable" class="display" style="width:100%">
			<thead>
				<tr>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>ADDRESS</th>
					<th>ACTION</th>
				</tr>
			</thead>
				<tbody>
					<c:forEach var="User" items="${listUser}">
						<tr>
							<td>${User.firtsName}</td>
							<td>${User.lastName}</td>
							<td>${User.address}</td>
							<td> <a href= "http://localhost:8080/spring_example/updateUser?userID=${User.id}">Edit</a>
							</td>
							<td> <a href= "http://localhost:8080/spring_example/deleteUser?userID=${User.id}">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<script type="text/javascript">
				$(document).ready( function () {
				    $('#myTable').DataTable();
				} );
			</script>
			
	</div>
</body>
</html>