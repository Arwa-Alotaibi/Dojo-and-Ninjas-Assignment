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
<title>New Dojo </title>
</head>
<body>
<h1>New Dojo</h1>

<form:form action="/dojos/new" modelAttribute="dojo" method="post">
<form:label path="name">Name</form:label>
<form:input path="name"></form:input>


<input type="submit" value="Create">



</form:form>

</body>
</html>