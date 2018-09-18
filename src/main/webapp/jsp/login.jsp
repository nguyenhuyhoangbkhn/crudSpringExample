<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align = "center">
		<form:form action = "listUser" method = "POST" modelAttribute ="User" >
		
			<c:if test = "${param['error']}">Incorrect name or password</c:if>
			<table>
				<tr>
					<td><form:label path= "name">User Name</form:label></td>
					<td><form:input path = "name" name = "name" id = "name"/></td>
				</tr>
				<tr>
					<td ><form:label path= "password">Password</form:label></td>
					<td><form:input path = "password" name = "password" id = "password"/></td>
				</tr>
				<tr>
					<td ></td>
					<td><form:button name = "login" id = "login">Login</form:button></td>
				</tr>
			</table>
		</form:form>
	
	</div>
</body>
</html>