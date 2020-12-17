<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
<a href="/user">Back</a>
<table border=2>
<tr>
<th>Name</th>
<th>ID</th>
</tr>
<c:forEach var="user" items="${user}">
<tr>
<td> ${user.name}</td>
<td>${user.id}</td>

</tr>
</c:forEach>
</table>
</body>
</html>