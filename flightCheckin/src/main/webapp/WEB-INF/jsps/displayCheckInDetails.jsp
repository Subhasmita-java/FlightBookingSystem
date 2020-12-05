<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation Details Page</title>
</head>
<body>
<center>
<h1>Reservation Details</h1>
</center>

<h2>Flight Details</h2>
Flight Number : ${reservation.flight.flightNumber}<br>
Operating Airlines : ${reservation.flight.operatingAirlines}<br>
Departure City :  ${reservation.flight.departureCity}<br>
Arrival City : ${reservation.flight.arrivalCity}<br>
Date of departure : ${reservation.flight.dateOfDeparture}<br>
Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}<br>

<h2>Passenger Details</h2>

First Name : ${reservation.passenger.firstName}<br>
Last Name : ${reservation.passenger.lastName}<br>
Email : ${reservation.passenger.email}<br>
Contact Number : ${reservation.passenger.phone}<br>

<form action="checkIn" method="post">
Number of bags of passenger : <input type="text" name="numberOfBags">
<input type="hidden" value="${reservation.id}" name= "reservationID">
<input type="submit" value="Check In" >
</form>
</body>
</html>