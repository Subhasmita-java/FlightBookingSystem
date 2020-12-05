<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight CheckIn Page</title>
</head>
<body>
<center>
<h2>Flight CheckIn</h2>
</center>
<form action="flightCheckIn" method="post">
Check in flight with Reservation ID : <input type="text" name="reservationID">
<input type="submit" value="Check In">
</form>
</body>
</html>