<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid</title>
</head>
<body>
<h2>Login Failed Try Again !!!</h2>
<form action="http://localhost:9090/bankapplication/Login">
	<table>
		<tr>
			<td><label>Customer ID</label></td>
			<td><input type="text" name="CID" required/></td>
			</tr>
			<tr>
			<td><label>Password</label></td>
			<td><input type="password" name="PW" required/></td>
			</tr>
			<tr>
			<td><input type="submit" value="LOGIN" /></td>
			<td><a href="forgot.jsp">Forgot Password</a></td>
			</tr>
	</table>
</form>

</body>
</html>