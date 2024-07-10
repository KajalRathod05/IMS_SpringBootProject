<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/JSP/admin.css">
</head>
<body>

<form action="">
<table border>
<tr>
<th>SID</th>
<th>Student name</th>
<th>Student Mobno</th>
<th>Student Course</th>
<th>Student Batch</th>
<th>Student's Faculty</th>
<th>Action</th>
</tr>

<tr>
<c:forEach items="${sl }"  var="s">
<td>${s.sid }</td>
<td>${s.sname }</td>
<td>${s.mobno }</td>
<td>${s.course }</td>
<td>${s.batch }</td>
<td>${s.faculty }</td>
<td><a href="edits?sid=${s.sid}">Edit</a> || <a href="deletes?sid=${s.sid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>