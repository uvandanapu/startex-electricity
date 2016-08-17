<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Succesfull</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>Successfully Registered!</h3>
<table>
<tr>
<td>First Name: </td><td>${customer.fName}</td>
</tr>
<tr>
<td>Last Name : </td><td>${customer.lName}</td>
</tr>
<tr>
<td>Email Id  : </td><td>${customer.email}</td>
</tr>
<tr>
<td>ServiceId : </td><td>${customer.planInfo.sid}</td> 
</tr>
<tr>
<td>Service Plan : </td><td>${customer.planInfo.plans}</td> 
</tr>
 </table>
</body>
</html>