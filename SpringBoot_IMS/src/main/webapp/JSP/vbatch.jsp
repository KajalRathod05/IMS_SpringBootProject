<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/JSP/admin.css">
<title>Insert title here</title>
</head>
<body>

<form action="">
<table border>
<tr>
<th>BID</th>
<th>Batch name</th>
<th>Action</th>
</tr>

<tr>
<c:forEach items="${bl}"  var="b">
<td>${b.bid }</td>
<td>${b.bname }</td>
<td><a href="editb?bid=${b.bid}">Edit</a> || <a href="deleteb?bid=${b.bid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>