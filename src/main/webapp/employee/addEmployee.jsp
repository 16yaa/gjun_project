<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../addEmployeeController" method="post">
		<table width=450 align=center border=0>
			<tr>
				<td colspan=2 align=center><h3>會員資料</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td style="padding:5px" width=100 align=center>帳號
				<td style="padding:5px" align=center><input type="text" name="username" required>
			<tr>
				<td style="padding:5px" width=100 align=center>密碼
				<td style="padding:5px" align=center><input type="text" name="password" required>
			<tr>
				<td style="padding:5px" colspan=2  align=center>
				<input type="submit" value="註冊">
			<tr>
				<td  colspan=2 >
				<div align=center><a href="employeeLogin.jsp">返回上一頁</a></div>
			
		</table>
	
	
	
	</form>
</body>
</html>