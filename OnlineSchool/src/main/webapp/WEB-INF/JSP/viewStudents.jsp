<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<h3>Add / Edit Student!!!</h3>
<form:form method="post" action="/OnlineSchool/viewStudents.html" commandName="student">
<div class="table-responsive">
<table class="table table-bordered" style="width: 300px">
<tr>
<td>Name :</td>
<td><form:input type="text" path="name" /></td>
</tr>
<tr>
<td>Email :</td>
<td><form:input type="text" path="email" /></td>
</tr>
<tr>
<td>Password :</td>
<td><form:input type="text" path="password" /></td>
</tr>
<tr>
<td></td>
<td><input class="btn btn-primary btn-sm" type="submit" value="Submit" /></td>
<tr>
</tr>
</table>
</div>
</form:form>

<br>
<h3>List of Students</h3>
<table class="table table-bordered" style="width: 300px">
<tr>
<th>name</th>
<th>email</th>
<th>password</th>
<th>Edit/Delete</th>
</tr>
<c:forEach items="${studentList}" var="student">
<tr>
<td width="60" align="center">${student.id}</td>
<td width="60" align="center">${student.name}</td>
<td width="60" align="center">${student.age}</td>
<td width="60" align="center">${student.dept}</td>
<td width="60" align="center"><a href="edit/${student.email}">Edit</a>/<a href="delete/${student.email}">Delete</a></td>
</tr>
</c:forEach>
</tr>
</table>
</body>
</html>
