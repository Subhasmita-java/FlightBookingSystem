<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Find Flights</title>
</head>
<body>
<form action="findFlights" method="post">
<h2>Find Flights</h2>
From : <input type="text" name="from">
To : <input type="text" name="to">
Departure Date : <input type="text" name="departureDate">
<input type="submit" value="Go">
</form>
</body>
</html>