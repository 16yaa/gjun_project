package Controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.mobileOrderDao;
import Model.mobileOrder;

/**
 * Servlet implementation class updatemobileOrderController
 */
@WebServlet("/updatemobileOrderController")
public class updatemobileOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updatemobileOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		int ID=Integer.parseInt(request.getParameter("id"));
		String Name=request.getParameter("name");
		int Iphome13=Integer.parseInt(request.getParameter("iphome13"));
		int Airpads=Integer.parseInt(request.getParameter("airpads"));
		int Phonecable=Integer.parseInt(request.getParameter("phonecable"));
		int Phonecase=Integer.parseInt(request.getParameter("phonecase"));
		int Protector=Integer.parseInt(request.getParameter("protector"));
		
		
		mobileOrder m=new mobileOrderDao().queryId(ID);
		m.setId(ID);
		m.setIphome13(Iphome13);
		m.setAirpads(Airpads);
		m.setPhonecable(Phonecable);
		m.setPhonecase(Phonecase);
		m.setProtector(Protector);
		LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=null;
        f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        m.setTime(now.format(f));
		m.getSum();
		m.getStatus();
		if(m.getStatus()=="未出貨")
		{
			response.getWriter().print("<script> alert(\"此訂單已出貨，無法更改\"");
			response.sendRedirect("mobileOrder/update.jsp");
			
		}
		else
		{
			new mobileOrderDao().update(m);
			response.sendRedirect("mobileOrder/update.jsp");
		}
		
	}

}
