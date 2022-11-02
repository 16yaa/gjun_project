<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.mobilemember"
    %>
<%

mobilemember m=(mobilemember)session.getAttribute("M");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style>
*{ margin: 0; padding: 0; }

nav {
  background-color: #3b383c;
}
nav ul {
  display: flex;
  list-style-type: none;
  padding-left: 1rem;
}
nav ul li {
  padding: 0.5rem 0.75rem;
}
nav ul li a {
  color: rgb(192, 192, 192);
  text-decoration: none;
  font-size: 1.25rem;
  transition: all 0.25s ease;
}
table{margin:auto}
</style>
</head>
<body>
	<nav style="margin: 0;padding: 0;">
        <ul >
            <li><a class="active" href="../index.html">首頁</a></li>
            <li><a href="mobileOrder.jsp">商品清單</a></li>
            <li style="margin-left:auto"><a href="membercenter.jsp"> 會員中心</a></li>
        </ul>
        
    </nav>
<form action="../mobileOrderShoppingcartController" method="post">
<span align="center">
<h3 style="margin:1em" align="center">歡迎 <%=m.getUsername()%>
<!-- 
	<a style="margin-left:100px" href="queryusername.jsp">查詢歷史訂單</a> 
	<a style="margin-left:100px" href="update.jsp">修改訂單資料</a>
	<a style="margin-left:100px" href="delete.jsp">取消訂單</a>
	<a style="margin-left:100px" href="updatemember.jsp">更改會員資料</a>
-->
</span>	
</h3>
	<table width=800 align=center border=1>
		<tr>
			<td width=200 align=center><h3>編號</h3>
			<td width=200 align=center><h3>品項</h3>
			<td width=200 align=center><h3>數量</h3>
			<td width=200 align=center><h3>定價</h3>
		<tr>
			<td align=center>1) iphome13
			<td width=250 align=center>
				<img alt="手機" src="pic/Phone.jpg" width=200 height=200>
			<td align=center>
				<select name="iphome13">
					<option value=0>0
					<option value=1>1
					<option value=2>2
					<option value=3>3
					<option value=4>4
					<option value=5>5
					<option value=6>6
					<option value=7>7
					<option value=8>8
					<option value=9>9
				</select>
			<td align=center>單價:
			22900
			
		<tr>
			<td align=center>2) airpads
			<td width=250 align=center>
				<img alt="airpads" src="pic/airpads.jpg" width=200 height=200>
			<td align=center>
				<select name="airpads">
					<option value=0>0
					<option value=1>1
					<option value=2>2
					<option value=3>3
					<option value=4>4
					<option value=5>5
					<option value=6>6
					<option value=7>7
					<option value=8>8
					<option value=9>9
				</select>
			<td align=center>單價:
			5990
			<tr>
				<td align=center>3) 手機傳輸、充電線
				<td width=250 align=center>
					<img alt="phonecable" src="pic/phonecable.jpg" width=200 height=200>
				<td align=center>
					<select name="phonecable">
					<option value=0>0
					<option value=1>1
					<option value=2>2
					<option value=3>3
					<option value=4>4
					<option value=5>5
					<option value=6>6
					<option value=7>7
					<option value=8>8
					<option value=9>9
					</select>
				<td align=center>單價:
				<br>590
			<tr>
			<tr>
				<td align=center>4) 手機保護殼
				<td width=250 align=center>
					<img alt="phonecase" src="pic/phonecase.jpg" width=200 height=200>
				<td align=center>
					<select name="phonecase">
					<option value=0>0
					<option value=1>1
					<option value=2>2
					<option value=3>3
					<option value=4>4
					<option value=5>5
					<option value=6>6
					<option value=7>7
					<option value=8>8
					<option value=9>9
					</select>
				<td align=center>單價:
				1490
			<tr>
				<td align=center>5) 螢幕保護貼
				<td width=250 align=center>
					<img alt="protector" src="pic/protector.jpg" width=200 height=200>
				<td align=center>
					<select name="protector">
					<option value=0>0
					<option value=1>1
					<option value=2>2
					<option value=3>3
					<option value=4>4
					<option value=5>5
					<option value=6>6
					<option value=7>7
					<option value=8>8
					<option value=9>9
					</select>
				<td align=center>單價:
				1390
			<tr>
			<td colspan=4 align=center>
			<input type="submit" value="加入購物車">
		</table>
		<table  align=center>
		<tr>
			<td align=center><a href="../index.html">登出</a>
		</table>
</form>
</body>
</html>