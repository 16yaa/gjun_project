<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.*" 
    import="Dao.*"
    import="java.util.*"%>
<%
/*
mobilemember m=(mobilemember)session.getAttribute("M");
int iphome13=Integer.parseInt(request.getParameter("iphome13"));
int airpads=Integer.parseInt(request.getParameter("airpads"));
int phonecable=Integer.parseInt(request.getParameter("phonecable"));
int phonecase=Integer.parseInt(request.getParameter("phonecase"));
int protector=Integer.parseInt(request.getParameter("protector"));
mobileOrder mo=new mobileOrder(m.getUsername(),iphome13,airpads,phonecable,phonecase,protector);
session.setAttribute("mo",mo);
*/
mobileOrder mo=(mobileOrder)session.getAttribute("mo");
mobilemember m=(mobilemember)session.getAttribute("M");
List<Object> l=new mobileOrderDao().queryShoppingcart();
Shoppingcart[] sc=l.toArray(new Shoppingcart[l.size()]);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table style="font-size:24px" width=800 align=center border=0>

		<tr>
			<td colspan=4 align=center>
			<h3><%=m.getName() %> ���q��</h3>
			<hr>
		<tr>
			<td width=200 align=center>iphome13
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getSciphome13()+"��");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getSciphome13()*22990+"��");
			}%>
			<form action="../deleteShoppingcartController1" method="post">
			<td width=400 align=center><input type="submit" value="�����o�Ӱӫ~">
			</form>
		<tr>
			<td width=200 align=center>airpads
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScairpads()+"��");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScairpads()*5990+"��");
			}%>
			<form action="../deleteShoppingcartController2" method="post">
			<td width=400 align=center><input type="submit" value="�����o�Ӱӫ~">
			</form>
		<tr>
			<td width=200 align=center>�u��
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScphonecable()+"��");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScphonecable()*590+"��");
			}%>
			<form action="../deleteShoppingcartController3" method="post">
			<td width=400 align=center><input type="submit" value="�����o�Ӱӫ~">
			</form>
		<tr>
			<td width=200 align=center>����O�@��
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScphonecase()+"��");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScphonecase()*1490+"��");
			}%>
			<form action="../deleteShoppingcartController4" method="post">
			<td width=400 align=center><input type="submit" value="�����o�Ӱӫ~">
			</form>
		<tr>
			<td width=200 align=center>�ù��O�@�K
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScprotector()+"��");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+sc[i].getScprotector()*1390+"��");
			}%>
			<form action="../deleteShoppingcartController5" method="post">
			<td width=400 align=center><input type="submit" value="�����o�Ӱӫ~">
			</form>
		<tr>
			<td width=200 align=center>�`�p:
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td width=200 align=center>"+
			(sc[i].getSciphome13()+
			sc[i].getScairpads()+
			sc[i].getScphonecable()+
			sc[i].getScphonecase()+
			sc[i].getScprotector())+"��ӫ~");
			}%>
			<%for(int i=0;i<sc.length;i++)
			{out.println("<td colspan=2 width=200 align=center>"+sc[i].getSum()+"��");
			}%>
			
		<tr>
			<td colspan=4 align=center>
			<a href="mobileOrder.jsp">�~���ʪ�</a>
			<a href="../addmobileOrderController">�e�X</a>

	
</table>
</body>
</html>