<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="Model.*"
    import ="Dao.*"
    import ="java.util.*"%>
<%
List<Object> l=new employeeDao().queryAll();
Employee[] emp=l.toArray(new Employee[l.size()]);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../deleteEmployeeController" method="post">
		<div align="center">刪除第<input type=text name="id"> 筆員工資料</div>
		<div style="margin:10px" align="center"><input type=submit value="確認"></div>
	</form>
<h1 align="center">所有訂單資料</h1>
	<table width=1200 align=center border=0>
		<tr>
			<td width=100 align=center>員工編號
			<td width=100 align=center>Username
			<td width=300 align=center>入職時間
		<tr>
			<td colspan=10><hr>
		
		<%
			for(int i=0;i<emp.length;i++)
			{
				out.println("<tr><td width=100 align=center>"+emp[i].getId()+
						"<td width=100 align=center>"+emp[i].getUsername()+
						"<td width=300 align=center>"+emp[i].getCreatetime());
			}
		%>
			
	</table>
	<div style="padding:2em"align=center><a href="manager.jsp">返回上一頁</a></div>
</body>
</html>