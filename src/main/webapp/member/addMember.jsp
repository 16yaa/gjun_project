<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="../addMemberController" method="post">
		<table width=450 align=center border=0>
			<tr>
				<td colspan=2 align=center><h3>�|�����</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td style="padding:5px" width=100 align=center>�m�W
				<td style="padding:5px" align=center><input type="text" name="name" required>
			<tr>
				<td style="padding:5px" width=100 align=center>�b��
				<td style="padding:5px" align=center><input type="text" name="username" required>
			<tr>
				<td style="padding:5px" width=100 align=center>�K�X
				<td style="padding:5px" align=center><input type="text" name="password" required>
			<tr>
				<td style="padding:5px" width=100 align=center>�a�}
				<td style="padding:5px" align=center><input type="text" name="address" required>
			<tr>
				<td style="padding:5px" width=100 align=center>�s���q��
				<td style="padding:5px" align=center><input type="text" name="mobile" required>
			<!-- 
			<tr>
				<td style="padding:5px" colspan=2 align=center>
				admin?<input type="checkbox" id="admin" value="admin">
			-->
			<tr>
			
				<td style="padding:5px" colspan=2  align=center>
				<input type="submit" value="���U">
			<tr>
				<td  colspan=2 >
				<div align=center><a href="../index.html">��^�W�@��</a></div>
			
		</table>
	
	
	
	</form>
</body>
</html>