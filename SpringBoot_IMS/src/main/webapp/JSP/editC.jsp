<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/JSP/admin.css">
</head>
<body>

<form action="updatec">
<pre>
<input type="hidden" name="cid" value="${c.cid }"><br>
Course Name:<input type="text" name="cname" value="${c.cname }"><br>
Course Feese:<input type="text" name="feese"  value="${c.feese}"><br>
<input type="submit" value="UPDATE"><br>
</pre>

</form>
</body>
</html>