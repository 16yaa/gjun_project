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
	<form action="../updatemobileOrderController" method="post">
		<table width=1200 align=center border=0>		
			
			<tr width=1200 align=center>
				<td>
				<h4>�q��ק�t��</h4>
				�q��s��:<input style="margin:10px" type="text" name="id" size=3>
				iphome13:<input style="margin:10px" type="text" name="iphome13" size=3>
				airpads:<input style="margin:10px" type="text" name="airpads" size=3>
				����ǿ�B�R�q�u:<input style="margin:10px" type="text" name="phonecable" size=3>
				����O�@��:<input style="margin:10px" type="text" name="phonecase" size=3>
				�ù��O�@�K:<input style="margin:10px" type="text" name="protector" size=3>
				<input style="margin:10px" type="submit" value="�T�w">
			<tr>
				<td><hr>
		</table>
	</form>
	
		<table width=1200 align=center>
			
			<tr align=center>
				<td align=center width=150>�q��s��
				<td align=center width=150>�m�W
				<td align=center width=150>iphome13
				<td align=center width=150>airpads
				<td align=center width=150>����ǿ�B�R�q�u
				<td align=center width=150>����O�@��
				<td align=center width=150>�ù��O�@�K
				<td align=center width=150>�`���B
			<tr>
				<td colspan=8 align=center><hr>
			<%
			for(int i=0;i<mo.length;i++)
			{
				out.println("<tr align=center><td>"+
						mo[i].getId()+
						"<td align=center>"+mo[i].getName()+
						"<td align=center>"+mo[i].getIphome13()+
						"<td align=center>"+mo[i].getAirpads()+
						"<td align=center>"+mo[i].getPhonecable()+
						"<td align=center>"+mo[i].getPhonecase()+
						"<td align=center>"+mo[i].getProtector()+
						"<td align=center>"+mo[i].getSum());
			}
		
			%>
			<tr>
				<td colspan=8><hr>
			<tr>
				<td colspan=8 align=center>
				<a href="membercenter.jsp">�W�@��</a>
				
		</table>
</body>
</html>