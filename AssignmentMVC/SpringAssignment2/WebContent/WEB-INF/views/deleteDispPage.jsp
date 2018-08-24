<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Operation</title>
</head>
<body>
<h1>Delete Operation</h1>
<form:form action="delTrainee" method="post" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id:</td>
				<td><form:input path="traineeId" size="30" /></td>
				<td><form:errors path="traineeId" cssClass="error" /></td>
			</tr>	
			<tr>
			<td><input type="submit" value="Delete"> /></td>	
</table>

</form:form>
</body>
</html>