<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.*"%>
<%

Employee emp=(Employee)session.getAttribute("emp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5"  http-equiv="refresh" content="5;url= ../mobileOrder/manager.jsp ">
<title>Insert title here</title>
</head>
<body>
<!-- 
<h1 style="margin:2em" align="center"><%=emp.getUsername() %>�Τ�A�n</h1>
-->
<%

{
	out.println("<h1 style=margin:2em align=center>"+emp.getUsername()+" �Τ�A�n</h1>");
	out.println("<div align=center><a style=font-size:1.5em href=../mobileOrder/manager.jsp>"+"5���۰ʫe����x�޲z�t�ΡA�p�G�A���s�����S���۰ʸ���A���I�����챵"+"</a></div>");
}
%>


</body>
</html>