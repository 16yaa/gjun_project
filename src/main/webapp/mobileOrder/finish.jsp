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
			<h3><%=m.getName() %> ���q��ԲӸ��</h3>
			<hr>
		<tr>
			<td width=200 align=center>iphome13
			<td width=200 align=center><%=mo.getIphome13()%>��
			<td width=200 align=center><%=mo.getIphome13()*22990 %>��
		<tr>
			<td width=200 align=center>airpads
			<td align=center><%=mo.getAirpads() %>��
			<td align=center><%=mo.getAirpads()*5990 %>��
		<tr>
			<td width=200 align=center>����ǿ�B�R�q�u
			<td align=center><%=mo.getPhonecable() %>��
			<td align=center><%=mo.getPhonecable()*590 %>��
		<tr>
			<td width=200 align=center>����O�@��
			<td align=center><%=mo.getPhonecase() %>��
			<td align=center><%=mo.getPhonecase()*1490 %>��
		<tr>
			<td width=200 align=center>�ù��O�@�K
			<td align=center><%=mo.getProtector() %>��
			<td align=center><%=mo.getProtector()*1390 %>��
		<tr>
			<td width=200 align=center>�`�p:
			<td colspan=2 align=center><%=mo.getSum() %>��
		
		<tr>
			<td width=200 align=center>�p���覡:
			<td colspan=2 align=center><%=m.getMobile() %>
		<tr>
			<td width=200 align=center>�e�f�a�}:
			<td colspan=2 align=center><%=m.getAddress() %>
		<tr>
			<td width=200 align=center>�U�q�ɶ�:
			<td colspan=2 align=center><%=mo.getTime() %>
		<tr>
			<td colspan=3 align=center>
			<a href="mobileOrder.jsp">�^�ʪ�����</a>
			<DIV ALIGN="CENTER">
			<FORM>
				<INPUT NAME="print" TYPE="button" VALUE="�C�L����"	ONCLICK="varitext()">
			</FORM>
		</DIV>
	
</table>
</form>
</body>
</html>