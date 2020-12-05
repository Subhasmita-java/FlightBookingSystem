<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User registration</title>
</head>
<body>
<h2>User Login</h2>
<form action="login" method="post">
<pre>
User Name : <input type="text" name="email">
Password : <input type="password" name="password">

<input type="submit" value="Login">
${msg} 
</pre>
</form>
</body>
</html>