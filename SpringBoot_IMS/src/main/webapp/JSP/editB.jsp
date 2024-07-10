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

<form action="updateb">
<pre>
<input type="hidden" name="bid" value="${b.bid }"><br>
Batch Name:<input type="text" name="bname" value="${b.bname}"><br>

<input type="submit" value="UPDATE"><br>
</pre>

</form>
</body>
</html>