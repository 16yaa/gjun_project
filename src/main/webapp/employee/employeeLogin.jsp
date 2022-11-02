<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../EmployeeLoginController" method="post">
	<h1 style="margin-top:1em"align="center">後台登入系統</h1>
	
	<div style="font-size:24px;margin-top:1em" align="center">username:<input type=text name="username" required></div>
	<br>
	<div style="font-size:24px" align="center">password:<input type=password name="password" required></div>
	<div style="margin:2em " align="center"><input type="submit" value="login"></div>
	<div style="font-size:1.5em" align="center"><a style="margin:2em " href="addEmployee.jsp">註冊</a></div>
	
</form>
</body>
</html>