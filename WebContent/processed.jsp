<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged In</title>
</head>
<body>
<%
out.println("Welcome"+" "+session.getAttribute("cname")+" "+"you have successfully logged in");
%>
<table>
<tr>
<td>
<a href="Balance"> Balance Check </a>
</td>
</tr>

<tr>
<td>
<a href="transfer.jsp">Fund Transfer</a>
</td>
</tr>

<tr>
<td>
<a href="bal.jsp">Change Password</a>
</td>
</tr>

<tr>
<td>
<a href="bal.jsp">Account Statement</a>
</td>
</tr>
<tr>
<td>
<a href="bal.jsp">Apply For Loan</a>
</td>
</tr>

<tr>
<td>
<a href="bal.jsp">Logout</a>
</td>
</tr>
</table>
</body>
</html>