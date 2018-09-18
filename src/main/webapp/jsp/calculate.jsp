<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align = "center">
		<form action="calcuteTrial" method="get">
		  Width: 
		  <input type="text" name="width" value = "${width}">
		  <br>
		  Height: <input type="text" name="height" value = "${height}">
		  <br>
		  <input type="submit" value="Submit">
		</form>
		<c:if test="${circuit != 0 }">
			Circuit: ${circuit}<br>
			Area: ${area}
		</c:if>
		
	
	</div>
</body>
</html>