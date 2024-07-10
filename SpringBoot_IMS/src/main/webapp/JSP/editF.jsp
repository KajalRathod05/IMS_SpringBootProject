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

<form action="updatef">
<pre>
<input type="hidden" name="fid" value="${f.fid}"><br>
Faculty Name:<input type="text" name="fname" value="${f.fname }"><br>

Choose Course:<select name="course" >
               <option>-${f.course}-</option>
               <c:forEach  items="${cl }" var="c">
               <option value="${c.cname}">${c.cname}</option>
               
               </c:forEach>
              </select><br>


Choose Batch:<select name="batch" >
               <option>-${f.batch}-
               <c:forEach  items="${bl }" var="b">
               <option value="${b.bname}">${b.bname}</option>
               </option>
               </c:forEach>
              </select><br>
              
<input type="submit" value="SAVE"><br>
</pre>

</form>
</body>
</html>