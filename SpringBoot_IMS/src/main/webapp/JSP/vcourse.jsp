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
<th>CID</th>
<th>Course name</th>
<th>Course Feese</th>
<th>Action</th>
</tr>

<tr>
<c:forEach items="${cl }"  var="c">
<td>${c.cid }</td>
<td>${c.cname }</td>
<td>${c.feese }</td>
<td><a href="editc?cid=${c.cid}">Edit</a> || <a href="deletec?cid=${c.cid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>