<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name : ${reservation.firstName}
	<br> Last Name : ${reservation.lastName}
	<br> Gender: ${reservation.gender}
	<br> Meals:
	<ul>
		<c:forEach items="${reservation.food}" var="meal">
			<c:out value="${meal}"></c:out>
			<br>
		</c:forEach>
	</ul>
	Leaving From : ${reservation.cityFrom}
	<br> Going To : ${reservation.cityTo}
</body>
</html>