<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobileOrder"
    import="Model.mobilemember"
    import="Dao.mobilememberDao"
    import="java.util.List"%>
<%
mobilemember m=(mobilemember)session.getAttribute("M");
List<Object> l=new mobilememberDao().queryAll();
mobilemember[] m1=l.toArray(new mobilemember[l.size()]);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">�R���|�����</h1>
	<form action="../deleteMemberController" method="post">
		<div align="center">�R���� <input type=text name="id"> ���|�����</div>
		<div style="margin:10px" align="center"><input type=submit value="�T�{"></div>
	</form>
	
	<table width=1000 align=center border=0>
		<tr>
			<td width=100 align=center>id
			<td width=100 align=center>name
			<td width=100 align=center>username
			<td width=100 align=center>password
			<td width=100 align=center>address
			<td width=100 align=center>mobile
			<td width=300 align=center>���U�ɶ�
		<tr>
			<td colspan=9><hr>
		
		<%
			for(int i=0;i<m1.length;i++)
			{
				out.println("<tr><td width=100 align=center>"+m1[i].getId()+
						"<td width=100 align=center>"+m1[i].getName()+
						"<td width=100 align=center>"+m1[i].getUsername()+
						"<td width=100 align=center>"+m1[i].getPassword()+
						"<td width=100 align=center>"+m1[i].getAddress()+
						"<td width=100 align=center>"+m1[i].getMobile()+
						"<td width=300 align=center>"+m1[i].getTime());
			}
		%>
			
	</table>
	
	<div style="padding:2em"align=center><a href="manager.jsp">��^�W�@��</a></div>
</body>
</html>