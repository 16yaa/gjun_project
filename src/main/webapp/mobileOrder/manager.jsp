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
			<td  align=center><%=emp.getUsername() %> ,�п�ܧA�n�ϥΪ�����<br>
			��x�޲z�t��
		<tr>
			<td><hr>
		<tr>
			<td align=center><a href="querymember.jsp">1)�d�߷|�����</a>
		<tr>
			<td align=center><a href="deletemember.jsp">2)�R���|�����</a>
		<tr>
			<td align=center><a href="querymemberorder.jsp">3)�d�ߩҦ��q��</a>
		<tr>
			<td align=center><a href="statuschange.jsp">4)���q�檬�A</a>
		<tr>
			<td><hr>
<%
if(emp.getAdmin().equals("1"))
{
	out.println("<div align=center><a style=font-size:1.5em href=employeeList.jsp>"+"5)���u�M��޲z"+"</a></div>");
}
%>
		<tr>
			<td align=center><a href="../index.html">�n�X</a>
	</table>
</body>
</html>