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
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>


<form:form action="/ninjas/new"  method="post" modelAttribute="ninja">
<form:label path="dojo">Dojo:</form:label>
<form:select path="dojo">
<c:forEach var="dojo" items="${dojos}">
<form:option value="${dojo.id}"> <c:out value="${dojo.name}"></c:out> </form:option>
</c:forEach>
</form:select>

<form:label path="firstName">firstName</form:label>
<form:input path="firstName"></form:input>


<form:label path="lastName">lastName</form:label>
<form:input path="lastName"></form:input>



<form:label path="age">age</form:label>
<form:input path="age" type="number"></form:input>

<input type="submit" value="Create">


</form:form>
</body>
</html>