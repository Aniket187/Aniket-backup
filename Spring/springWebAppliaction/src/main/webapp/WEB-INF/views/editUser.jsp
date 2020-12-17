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
<h1>Enter user data</h1>
<form:form modelAttribute="user" action="editUser" method="post">

Enter UserName: <form:input path="name"/><br>
Enter UserId: <form:input path="id"/><br>
<input type="submit" value="Edit"/>

</form:form>
</body>
</html>