<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobilemember"%>
<%

mobilemember m=(mobilemember)session.getAttribute("M");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5"  http-equiv="refresh" content="5;url= ../mobileOrder/mobileOrder.jsp ">
<title>Insert title here</title>
</head>
<body>
<!-- 
<h1 style="margin:2em" align="center"><%=m.getName() %>用戶你好</h1>
-->
<%

{
	out.println("<h1 style=margin:2em align=center>"+m.getName()+" 用戶你好</h1>");
	out.println("<div align=center><a style=font-size:1.5em href=../mobileOrder/mobileOrder.jsp>"+"5秒後自動前往購物系統，如果你的瀏覽器沒有自動跳轉，請點擊此鏈接"+"</a></div>");
}
%>
<!-- 
<div align="center"><a style="font-size:1.5em" href="../mobileOrder/mobileOrder.jsp">前往購物系統</a></div>
-->
<!--

<!-- 
<div align="center"><a style="font-size:1.5em" href="../mobileOrder/manager.jsp">前往後台管理系統</a></div> 
-->

</body>
</html>