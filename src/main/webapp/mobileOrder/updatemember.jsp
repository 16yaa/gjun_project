<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobileOrder"
    import="Dao.mobileOrderDao"
    import="Dao.mobilememberDao"
    import="java.util.List"
    import="Model.mobilemember"%>
<%
mobilemember m=(mobilemember)session.getAttribute("M");
List<Object> l=new mobilememberDao().query(m.getUsername());

mobilemember[] mo=l.toArray(new mobilemember[l.size()]);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="../updatemobilememberController" method="post">
		<table width=1200 align=center border=0>		
			
			<tr width=1200 align=center>
				<td>
				<h4>�|����ƭק�t��</h4>
				�|���s��:<input style="margin:10px" type="text" name="id" size=3>
				name:<input style="margin:10px" type="text" name="name" size=3>
				username:<input style="margin:10px" type="text" name="username" size=3>
				password:<input style="margin:10px" type="password" name="password" size=3>
				address:<input style="margin:10px" type="text" name="address" size=3>
				mobile:<input style="margin:10px" type="text" name="mobile" size=3>
				<input style="margin:10px" type="submit" value="�T�w">
			<tr>
				<td><hr>
		</table>
	</form>
<table width=900 align=center border=0>
		<tr>
			<td width=100 align=center>�|���s��
			<td width=100 align=center>name
			<td width=100 align=center>username
			<td width=100 align=center>password
			<td width=100 align=center>address
			<td width=100 align=center>mobile
			
			<td width=300 align=center>�̫��s�ɶ�
		<tr>
			<td colspan=7><hr>
		
		<%
			for(int i=0;i<mo.length;i++)
			{
				out.println("<tr><td width=100 align=center>"+mo[i].getId()+
						"<td width=100 align=center>"+mo[i].getName()+
						"<td width=100 align=center>"+mo[i].getUsername()+
						"<td width=100 align=center>"+mo[i].getPassword()+
						"<td width=100 align=center>"+mo[i].getAddress()+
						"<td width=100 align=center>"+mo[i].getMobile()+
						
						"<td width=300 align=center>"+mo[i].getTime());
			}
		%>
			
	</table>
	<div style="padding:2em"align=center><a href="membercenter.jsp">��^�W�@��</a></div>
</body>
</html>