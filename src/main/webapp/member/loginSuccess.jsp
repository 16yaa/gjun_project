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
<h1 style="margin:2em" align="center"><%=m.getName() %>�Τ�A�n</h1>
-->
<%

{
	out.println("<h1 style=margin:2em align=center>"+m.getName()+" �Τ�A�n</h1>");
	out.println("<div align=center><a style=font-size:1.5em href=../mobileOrder/mobileOrder.jsp>"+"5���۰ʫe���ʪ��t�ΡA�p�G�A���s�����S���۰ʸ���A���I�����챵"+"</a></div>");
}
%>
<!-- 
<div align="center"><a style="font-size:1.5em" href="../mobileOrder/mobileOrder.jsp">�e���ʪ��t��</a></div>
-->
<!--

<!-- 
<div align="center"><a style="font-size:1.5em" href="../mobileOrder/manager.jsp">�e����x�޲z�t��</a></div> 
-->

</body>
</html>