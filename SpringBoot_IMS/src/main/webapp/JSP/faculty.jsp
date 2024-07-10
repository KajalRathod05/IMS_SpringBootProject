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

<form action="facultydata">
<div class="center">
<pre>
<lable class="lable">Faculty Name:</lable><input type="text" name="fname" class="input"><br>


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

              
<input type="submit" value="SAVE"><br>
</pre>
</div>

</form>
</body>
</html>