<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form User</title>
</head>
<body>
	<div align = "center">
		<form:form action = "addUser" method = "POST" modelAttribute ="User" >
			<table>
				<tr>
					<td><form:input path = "id" name = "id" id = "id" style="display:none;"/></td>
				</tr>
				<tr>
					<td><form:label path= "firtsName">First Name</form:label></td>
					<td><form:input path = "firtsName" name = "firtsName" id = "firtsName"/></td>
				</tr>
				<tr>
					<td ><form:label path= "lastName">Last Name</form:label></td>
					<td><form:input path = "lastName" name = "lastName" id = "lastName"/></td>
				</tr>
				
				<tr>
					<td ><form:label path= "address">Location</form:label></td>
					<td><form:input path = "address" name = "address" id = "address"/></td>
				</tr>
				
				<tr>
					<td ></td>
					<td><form:button name = "add" id = "add">Save</form:button></td>
				</tr>
			</table>
		</form:form>
	
	</div>
</body>
</html>