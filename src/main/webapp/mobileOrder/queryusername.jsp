<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobileOrder"
    import="Model.mobilemember"
    import="Dao.mobileOrderDao"
    import="java.util.List"%>
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
<h1 align="center">歷史訂單</h1>
	<table width=1200 align=center border=0>
		<tr>
			<td width=100 align=center>訂單編號
			<td width=100 align=center>username
			<td width=100 align=center>iphome13
			<td width=100 align=center>airpads
			<td width=100 align=center>手機傳輸、充電線
			<td width=100 align=center>手機保護殼
			<td width=100 align=center>螢幕保護貼
			<td width=100 align=center>金額
			<td width=300 align=center>下訂時間
			<td width=100 align=center>訂單狀態
		<tr>
			<td colspan=10><hr>
		
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
						"<td width=300 align=center>"+mo[i].getTime()+
						"<td width=100 align=center>"+mo[i].getStatus());
			}
		%>
			
	</table>
	<div style="padding:2em"align=center><a href="membercenter.jsp">返回上一頁</a></div>
</body>
</html>