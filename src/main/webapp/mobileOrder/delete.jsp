<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobileOrder"
    import="Dao.mobileOrderDao"
    import="java.util.List"
    import="Model.mobilemember"%>
<%
mobilemember m=(mobilemember)session.getAttribute("M");
List<Object> l=new mobileOrderDao().queryname(m.getUsername());
mobileOrder[] mo=l.toArray(new mobileOrder[l.size()]);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="../deletemobileOrderController" method="post">
		<table width=1100 align=center border=0>		
			
			<tr align=center>
				<td>
				<h4>�q������t��</h4>
				�q��s��:<input type="text" name="id" size=3>
				
				<input type="submit" value="�T�w">
			<tr>
				<td><hr>
		</table>
</form>
	<table width=1100 align=center border=0>
		<tr>
			<td width=100 align=center>�q��s��
			<td width=100 align=center>username
			<td width=100 align=center>iphome13
			<td width=100 align=center>airpads
			<td width=100 align=center>����ǿ�B�R�q�u
			<td width=100 align=center>����O�@��
			<td width=100 align=center>�ù��O�@�K
			<td width=100 align=center>���B
			<td width=300 align=center>�U�q�ɶ�
		<tr>
			<td colspan=9><hr>
		
		<%
			for(int i=0;i<mo.length;i++)
			{
				out.println("<tr><td width=100 align=center>"+mo[i].getId()+
						"<td width=100 align=center>"+mo[i].getName()+
						"<td width=100 align=center>"+mo[i].getIphome13()+
						"<td width=100 align=center>"+mo[i].getAirpads()+
						"<td width=100 align=center>"+mo[i].getPhonecable()+
						"<td width=100 align=center>"+mo[i].getPhonecase()+
						"<td width=100 align=center>"+mo[i].getProtector()+
						"<td width=100 align=center>"+mo[i].getSum()+
						"<td width=300 align=center>"+mo[i].getTime());
			}
		%>
			
	</table>
	<div style="padding:2em"align=center><a href="membercenter.jsp">��^�W�@��</a></div>
</body>
</html>