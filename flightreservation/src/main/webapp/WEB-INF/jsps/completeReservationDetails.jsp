<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display complete reservation details</title>
<style> 
            h1 { 
                color:green; 
            } 
</style> 
</head>
<body>
<center>
<h1>Reservation Details</h1>
</center>
<h2>Flight Details</h2>
Airlines : ${flight.operatingAirlines}<br>
Departure City : ${flight.departureCity}<br>
Arrival City : ${flight.arrivalCity}<br>
Estimated Departure Time : ${flight.estimatedDepartureTime}<br>
<form action="completeReservation" method="post">
<h2>Passenger Details</h2>
First Name : <input type="text" name="passangerFirstName"><br>
Last Name : <input type="text" name="passangerLastName"><br>
Email : <input type="text" name="passangerEmail"><br>
Contact no. : <input type="text" name="passangerContactNo"><br>

<h2>Card Details</h2>

Name on the Card : <input type="text" name="nameOnCard"><br>
Card Number : <input type="text" name="cardNumber"><br>
Expiry Date : <input type="text" name="expiryDate"><br>
Three digit security code : <input type="text" name="threeDigitCode"><br>

<input type="hidden" name="flightId" value="${flight.id}">
<input type="submit" value="Confirm">
</form>
</body>
</html>