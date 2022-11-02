<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <li><a class="active" href="index.html">首頁</a></li>
            <li><a href="mobileOrder/mobileOrder.jsp">商品清單</a></li>
            <li style="margin-left:auto"><a href=""> 會員中心</a></li>
            <li ><a href="mobileOrder/login.jsp">登入</a></li> 
        </ul>
        
    </nav>
<form action="../mobileLoginController" method="post">
	<h1 style="margin-top:1em"align="center">登入系統</h1>
	
	<div style="font-size:24px;margin-top:1em" align="center">username:<input type=text name="username" required></div>
	<br>
	<div style="font-size:24px" align="center">password:<input type=password name="password" required></div>
	<div style="margin:2em " align="center"><input type="submit" value="login"></div>
	<div style="font-size:1.5em" align="center"><a style="margin:2em " href="member/addMember.jsp">還沒有帳號嗎，馬上註冊吧</a></div>
	
</form>
</body>
</html>