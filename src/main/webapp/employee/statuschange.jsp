<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="Model.*"
    import ="Dao.*"
    import ="java.util.*"%>
<%
List<Object> l=new mobileOrderDao().queryAll();
mobileOrder[] m=l.toArray(new mobileOrder[l.size()]);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">所有訂單資料</h1>
	<form action="../StatusController" method="post">
		<div align="center">更改第 <input type=text name="id"> 筆訂單狀態</div>
		<div style="margin:10px" align="center"><input type=submit value="確認"></div>
	</form>
	<table width=1200 align=center border=0>
		<tr>
			<td width=100 align=center>訂單編號
			<td width=100 align=center>下訂Username
			<td width=100 align=center>iphome13
			<td width=100 align=center>耳機
			<td width=100 align=center>傳輸線材
			<td width=100 align=center>保護殼
			<td width=100 align=center>螢幕保護貼
			<td width=100 align=center>總價
			<td width=300 align=center>下訂/最後更新時間
			<td width=100 align=center>訂單狀態
		<tr>
			<td colspan=10><hr>
		
		<%
			for(int i=0;i<m.length;i++)
			{
				out.println("<tr><td width=100 align=center>"+m[i].getId()+
						"<td width=100 align=center>"+m[i].getName()+
						"<td width=100 align=center>"+m[i].getIphome13()+
						"<td width=100 align=center>"+m[i].getAirpads()+
						"<td width=100 align=center>"+m[i].getPhonecable()+
						"<td width=100 align=center>"+m[i].getPhonecase()+
						"<td width=100 align=center>"+m[i].getProtector()+
						"<td width=100 align=center>"+m[i].getSum()+
						"<td width=300 align=center>"+m[i].getTime()+
						"<td width=100 align=center>"+m[i].getStatus());
			}
		%>
	</table>
	<div style="padding:2em"align=center><a href="manager.jsp">返回上一頁</a></div>
</body>
</html>