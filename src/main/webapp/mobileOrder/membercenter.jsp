<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Model.mobilemember"%>
<%

mobilemember m=(mobilemember)session.getAttribute("M");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style.css">
</head>
<body>
	<nav>
        <ul >
            <li><a class="active" href="../index.html">首頁</a></li>
            <li><a href="mobileOrder.jsp">商品清單</a></li>
            <li style="margin-left:auto"><a href=""> 會員中心</a></li>
        </ul>
        
    </nav>
    <ol >
    	<li align="center"><a style="margin:1.5em;font-size:2em" href="queryusername.jsp">查詢歷史訂單</a> 
		<li align="center"><a style="margin:1.5em;font-size:2em" href="update.jsp">修改訂單資料</a>
		<li align="center"><a style="margin:1.5em;font-size:2em" href="delete.jsp">取消訂單</a>
		<li align="center"><a style="margin:1.5em;font-size:2em" href="updatemember.jsp">更改會員資料</a>
    </ol>
	
</body>
</html>