<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Retrieve Operation</h1>
<form:form method="post" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id:</td>
				<td><input type="text" path="traineeId" value="${traineeId}"></td>
			</tr>
			<tr>
			<td><input type="button" value="retrieve"></td>
			</tr>	
</table><br><br><br><br>
<h4>Trainee Info</h4>
		<table>
		<tr>
<th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<tr>
<td>${ trainee.traineeId }</td>
<td>${ trainee.traineeName }</td>
<td>${ trainee.traineeLocation }</td>
<td>${ trainee.traineeDomain }</td>
</tr>	
</table>
</form:form>
</body>
</html>