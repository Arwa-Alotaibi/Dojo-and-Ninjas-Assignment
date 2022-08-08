<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
      
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Dojo Page</title>
</head>
<body>
<h1><c:out value="${dojo_id.name }"></c:out></h1>

<table>
<tr>
<th>First Name</th>

<th>Last Name</th>

<th>Age</th>

</tr>
<c:forEach var="ninja" items="${dojo_id.ninjas}">
<tr>
<td> ${ninja.firstName}</td>

<td> ${ninja.lastName }</td>

<td>${ninja.age }</td>

</tr>

</c:forEach>





</table>
</body>
</html>