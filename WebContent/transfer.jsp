<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body>
<form action ="http://localhost:9090/bankapplication/Transfer">
<table>
<tr>
<td><label>Third Party A/C no</label></td>
<td><input type="text" name="ACNO"/></td>
<tr>
<tr>
<td><label>Amount</label></td>
<td><input type="text" name="AMOUNT"/></td>
</tr>
<tr>
<td><input type="submit" value="TRANSFER"/></td>
</tr>
</form>
</table>
</body>
</html>