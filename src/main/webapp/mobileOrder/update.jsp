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
				<h4>訂單修改系統</h4>
				訂單編號:<input style="margin:10px" type="text" name="id" size=3>
				iphome13:<input style="margin:10px" type="text" name="iphome13" size=3>
				airpads:<input style="margin:10px" type="text" name="airpads" size=3>
				手機傳輸、充電線:<input style="margin:10px" type="text" name="phonecable" size=3>
				手機保護殼:<input style="margin:10px" type="text" name="phonecase" size=3>
				螢幕保護貼:<input style="margin:10px" type="text" name="protector" size=3>
				<input style="margin:10px" type="submit" value="確定">
			<tr>
				<td><hr>
		</table>
	</form>
	
		<table width=1200 align=center>
			
			<tr align=center>
				<td align=center width=150>訂單編號
				<td align=center width=150>姓名
				<td align=center width=150>iphome13
				<td align=center width=150>airpads
				<td align=center width=150>手機傳輸、充電線
				<td align=center width=150>手機保護殼
				<td align=center width=150>螢幕保護貼
				<td align=center width=150>總金額
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
				<a href="membercenter.jsp">上一頁</a>
				
		</table>
</body>
</html>