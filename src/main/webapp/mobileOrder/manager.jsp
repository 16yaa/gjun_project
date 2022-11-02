<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.*"%>
<!DOCTYPE html>
<%

Employee emp=(Employee)session.getAttribute("emp");
%>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=400 align=center border=0>
		<tr>
			<td  align=center><%=emp.getUsername() %> ,請選擇你要使用的項目<br>
			後台管理系統
		<tr>
			<td><hr>
		<tr>
			<td align=center><a href="querymember.jsp">1)查詢會員資料</a>
		<tr>
			<td align=center><a href="deletemember.jsp">2)刪除會員資料</a>
		<tr>
			<td align=center><a href="querymemberorder.jsp">3)查詢所有訂單</a>
		<tr>
			<td align=center><a href="statuschange.jsp">4)更改訂單狀態</a>
		<tr>
			<td><hr>
<%
if(emp.getAdmin().equals("1"))
{
	out.println("<div align=center><a style=font-size:1.5em href=employeeList.jsp>"+"5)員工清單管理"+"</a></div>");
}
%>
		<tr>
			<td align=center><a href="../index.html">登出</a>
	</table>
</body>
</html>