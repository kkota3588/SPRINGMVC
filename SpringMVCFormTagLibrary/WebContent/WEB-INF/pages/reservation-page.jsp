<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">  
        First name: <form:input path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" />
		<br>
		<br>  
        Gender:   
        Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>  
        Meals:  
        BreakFast<form:checkbox path="food" value="BreakFast" />  
        Lunch<form:checkbox path="food" value="Lunch" />  
        Dinner<form:checkbox path="food" value="Dinner" />
		<br>
		<br>  
        Leaving from: <form:select path="cityFrom">
			<form:option value="Visakhapatnam" label="Visakhapatnam" />
			<form:option value="Guntur" label="Guntur" />
			<form:option value="Vizianagaram" label="Vizianagaram" />
			<form:option value="Vijayawada" label="Vijayawada" />
		</form:select>
		<br>
		<br>  
        Going to: <form:select path="cityTo">
			<form:option value="Visakhapatnam" label="Visakhapatnam" />
			<form:option value="Guntur" label="Guntur" />
			<form:option value="Vizianagaram" label="Vizianagaram" />
			<form:option value="Vijayawada" label="Vijayawada" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>