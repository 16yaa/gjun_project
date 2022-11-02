<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.mobileOrderDao"
    import="Model.mobilemember"
    import="Model.mobileOrder"
    %>
<%
mobileOrder mo=(mobileOrder)session.getAttribute("mo");
mobilemember m=(mobilemember)session.getAttribute("M");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>
</head>
<body>
<form>
<table style="font-size:24px" width=400 align=center border=0>
		<tr>
			<td colspan=3 align=center>
			<h3><%=m.getName() %> 的訂單詳細資料</h3>
			<hr>
		<tr>
			<td width=200 align=center>iphome13
			<td width=200 align=center><%=mo.getIphome13()%>個
			<td width=200 align=center><%=mo.getIphome13()*22990 %>元
		<tr>
			<td width=200 align=center>airpads
			<td align=center><%=mo.getAirpads() %>個
			<td align=center><%=mo.getAirpads()*5990 %>元
		<tr>
			<td width=200 align=center>手機傳輸、充電線
			<td align=center><%=mo.getPhonecable() %>個
			<td align=center><%=mo.getPhonecable()*590 %>元
		<tr>
			<td width=200 align=center>手機保護殼
			<td align=center><%=mo.getPhonecase() %>個
			<td align=center><%=mo.getPhonecase()*1490 %>元
		<tr>
			<td width=200 align=center>螢幕保護貼
			<td align=center><%=mo.getProtector() %>個
			<td align=center><%=mo.getProtector()*1390 %>元
		<tr>
			<td width=200 align=center>總計:
			<td colspan=2 align=center><%=mo.getSum() %>元
		
		<tr>
			<td width=200 align=center>聯絡方式:
			<td colspan=2 align=center><%=m.getMobile() %>
		<tr>
			<td width=200 align=center>送貨地址:
			<td colspan=2 align=center><%=m.getAddress() %>
		<tr>
			<td width=200 align=center>下訂時間:
			<td colspan=2 align=center><%=mo.getTime() %>
		<tr>
			<td colspan=3 align=center>
			<a href="mobileOrder.jsp">回購物首頁</a>
			<DIV ALIGN="CENTER">
			<FORM>
				<INPUT NAME="print" TYPE="button" VALUE="列印此頁"	ONCLICK="varitext()">
			</FORM>
		</DIV>
	
</table>
</form>
</body>
</html>