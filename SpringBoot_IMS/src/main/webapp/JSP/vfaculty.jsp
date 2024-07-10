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
<th>FID</th>
<th>faculty name</th>
<th>Faculty Course</th>
<th>Faculty Batch</th>
<th>Action</th>
</tr>

<tr>
<c:forEach items="${fl }"  var="f">
<td>${f.fid }</td>
<td>${f.fname }</td>
<td>${f.course }</td>
<td>${f.batch }</td>
<td><a href="editf?fid=${f.fid}">Edit</a> || <a href="deletef?fid=${f.fid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>