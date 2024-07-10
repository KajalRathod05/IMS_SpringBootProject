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

<form action="studentdata">
<pre>
Student Name:<input type="text" name="sname"><br>
Student Mobile No:<input type="text" name="mobno"><br>

Choose Course:<select name="course" >
               <option>--Select--
               <c:forEach  items="${cl }" var="c">
               <option value="${c.cname}">${c.cname}</option>
               </option>
               </c:forEach>
              </select><br>


Choose Batch:<select name="batch" >
               <option>--Select--
               <c:forEach  items="${bl }" var="b">
               <option value="${b.bname}">${b.bname}</option>
               </option>
               </c:forEach>
              </select><br>
              
 Choose Faculty:<select name="faculty" >
               <option>--Select--
               <c:forEach  items="${fl }" var="f">
               <option value="${f.fname}">${f.fname}</option>
               </option>
               </c:forEach>
              </select><br>
              
<input type="submit" value="SAVE"><br>
</pre>

</form>
</body>
</html>