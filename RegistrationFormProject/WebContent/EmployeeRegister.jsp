<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Employee Register Form</h1>
		<form action="EmployeeServlet" method="post">
			<table style="with: 80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>User name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></td>
				</tr>

				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact"></td>
				</tr>


			</table>
			<input type="submit" value="Submit"> 
			<input type="checkbox"value="CB"> 
			<input type="reset" value="RESET">





		</form>

	</div>
</body>
</html>