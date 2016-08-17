<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>Registration</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Customer Registration
</h1>

<c:url var="addAction" value="/customer/add" ></c:url>

<form action="${addAction}"   method="post">
<table>
<tr>
<td>First Name : </td>
<td><input type="text" name="fName"></td>
</tr>
<tr>
<td>Last Name : </td>
<td><input type="text" name="lName"></td>
</tr>
<tr>
<td>Phone No : </td>
<td><input type="text" name="pNum"></td>
</tr>
<tr>
<td>Email : </td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>	
</table>	
</form>
<br>

</body>
</html>